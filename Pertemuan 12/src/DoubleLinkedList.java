public class DoubleLinkedList {
    Node kepala;
    int ukuran;

    DoubleLinkedList() {
        kepala = null;
        ukuran = 0;
    }

    boolean apaKosong() {
        return kepala == null;
    }

    void addFirst(int item) {
        if (apaKosong()) {
            kepala = new Node(null, item, null);
        } else {
            Node nodeBaru = new Node(null, item, kepala);
            kepala.prev = nodeBaru;
            kepala = nodeBaru;
        }
        ukuran++;
    }

    void addLast(int item) {
        if (apaKosong()) {
            addFirst(item);
        } else {
            Node sekarang = kepala;
            while (sekarang.next != null) {
                sekarang = sekarang.next;
            }
            Node nodeBaru = new Node(sekarang, item, null);
            sekarang.next = nodeBaru;
            ukuran++;
        }
    }

    void add(int item, int indeks) throws Exception {
        if (apaKosong()) {
            addFirst(item);
        } else if (indeks < 0 || indeks > ukuran) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node sekarang = kepala;
            int i = 0;
            while (i < indeks) {
                sekarang = sekarang.next;
                i++;
            }
            if (sekarang.next == null) {
                Node nodeBaru = new Node(null, item, sekarang);
                sekarang.prev = nodeBaru;
                kepala = nodeBaru;
            } else {
                Node nodeBaru = new Node(sekarang.prev, item, sekarang);
                nodeBaru.prev = sekarang.prev;
                nodeBaru.next = sekarang;
                sekarang.prev.next = nodeBaru;
                sekarang.prev = nodeBaru;
            }
        }
        ukuran++;
    }

    int ukuran() {
        return ukuran;
    }

    void clear() {
        kepala = null;
        ukuran = 0;
    }

    void cetak() {
        if (apaKosong()) {
            Node sementara = kepala;
            while (sementara != null) {
                System.out.println(sementara.data + "\t");
                sementara = sementara.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists kosong");
        }
    }

    void removeFirst() throws Exception {
        if (apaKosong()) {
            throw new Exception("Data tidak dapat dihapus karena linked list masih kosong");
        } else if (ukuran == 1) {
            removeLast();
        } else {
            kepala = kepala.next;
            kepala.prev = null;
            ukuran--;
        }
    }

    void removeLast() throws Exception {
        if (apaKosong()) {
            throw new Exception("Data tidak dapat dihapus karena linked list masih kosong");
        } else if (kepala.next == null) {
            kepala = null;
            ukuran--;
            return;
        }
        Node sekarang = kepala;
        while (sekarang.next.next != null) {
            sekarang = sekarang.next;
        }
        sekarang.next = null;
        ukuran--;
    }

    void remove(int indeks) throws Exception {
        if (apaKosong() || indeks >= ukuran) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (indeks == 0) {
            removeFirst();
        } else {
            Node sekarang = kepala;
            int i = 0;
            while (i < indeks) {
                sekarang = sekarang.next;
                i++;
            }
            if (sekarang.next == null) {
                sekarang.prev.next = null;
            } else if (sekarang.prev == null) {
                sekarang = sekarang.next;
                sekarang.prev = null;
                kepala = sekarang;
            } else {
                sekarang.prev.next = sekarang.next;
                sekarang.next.prev = sekarang.prev;
            }
            ukuran--;
        }
    }

    int getFirst() throws Exception {
        if (apaKosong()) {
            throw new Exception("Linked List kosong");
        }
        Node sementara = kepala;
        while (sementara.next != null) {
            sementara = sementara.next;
        }
        return sementara.data;
    }

    int getLast() throws Exception {
        if (apaKosong()) {
            throw new Exception("Linked List kosong");
        }
        Node sementara = kepala;
        while (sementara.next != null) {
            sementara = sementara.next;
        }
        return sementara.data;
    }

    int get(int indeks) throws Exception {
        if (apaKosong() || indeks >= ukuran) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node sementara = kepala;
        for (int i = 0; i < indeks; i++) {
            sementara = sementara.next;
        }
        return sementara.data;
    }
}
