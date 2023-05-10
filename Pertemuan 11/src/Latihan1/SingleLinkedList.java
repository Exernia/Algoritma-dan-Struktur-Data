package Latihan1;

public class SingleLinkedList {
    Node head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void cetak() {
        if (!isEmpty()) {
            Node sementara = head;
            System.out.print("Isi Linked List:\t");
            while (sementara != null) {
                System.out.print(sementara.data + "\t");
                sementara = sementara.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List masih kosong");
        }
    }

    public void addFirst(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node sementara = head;

        do {
            if (sementara.data == key) {
                ndInput.next = sementara.next;
                sementara.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            sementara = sementara.next;
        } while (sementara != null);

    }

    public void insertBefore(int key, int input) {
        Node ndInput = new Node(input, null);
        Node prev = null;
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                ndInput.next = current;
                if (prev == null) {
                    head = ndInput;
                } else {
                    prev.next = ndInput;
                }
                break;
            }
            prev = current;
            current = current.next;
        }
    }

    public void insertAt(int indeks, int input) {
        if (indeks < 0) {
            System.out.println("Indeks salah");
        } else if (indeks == 0) {
            addFirst(input);
        } else {
            Node sementara = head;
            for (int i = 0; i < indeks - 1; i++) {
                sementara = sementara.next;
            }
            sementara.next = new Node(input, sementara.next);
            if (sementara.next.next == null) {
                tail = sementara.next;
            }
        }
    }

    public int getData(int indeks) {
        Node sementara = head;
        for (int i = 0; i < indeks; i++) {
            sementara = sementara.next;
        }
        return sementara.data;
    }

    public int indeksOf(int key) {
        Node sementara = head;
        int indeks = 0;
        while (sementara != null && sementara.data != key) {
            sementara = sementara.next;
            indeks++;
        }

        if (sementara == null) {
            return -1;
        } else {
            return indeks;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Tidak dapat menghapus karena Linked List masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Tidak dapat menghapus karena Linked List masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node sementara = head;
            while (sementara.next != tail) {
                sementara = sementara.next;
            }
            sementara.next = null;
            tail = sementara;
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Tidak dapat menghapus karena Linked List masih kosong");
        } else {
            Node sementara = head;
            while (sementara != null) {
                if (sementara.data == key && sementara == head) {
                    this.removeFirst();
                    break;
                } else if (sementara.next.data == key) {
                    sementara.next = sementara.next.next;
                    if (sementara.next == null) {
                        tail = sementara;
                    }
                    break;
                }
                sementara = sementara.next;
            }
        }
    }

    public void removeAt(int indeks) {
        if (indeks == 0) {
            removeFirst();
        } else {
            Node sementara = head;
            for (int i = 0; i < indeks - 1; i++) {
                sementara = sementara.next;
            }
            sementara.next = sementara.next.next;
            if (sementara.next == null) {
                tail = sementara;
            }
        }
    }

}
