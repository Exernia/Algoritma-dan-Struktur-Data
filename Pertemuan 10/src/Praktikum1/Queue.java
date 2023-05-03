package Praktikum1;

public class Queue {
    int maks19D, ukuran19D, depan19D, belakang19D;
    int[] q19D;

    Queue(int n) {
        maks19D = n;
        Create();
    }

    void Create() {
        q19D = new int[maks19D];
        ukuran19D = 0;
        depan19D = belakang19D = -1;
    }

    boolean IsEmpty() {
        if (ukuran19D == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean IsFull() {
        if (ukuran19D == maks19D) {
            return true;
        } else {
            return false;
        }
    }

    void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + q19D[depan19D]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void peekPosition(int data) {
        int position = -1;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = depan19D;
            for (int j = 1; j <= ukuran19D; j++) {
                if (q19D[i] == data) {
                    position = j;
                    break;
                }
                i = (i + 1) % maks19D;
            }
            if (position == -1) {
                System.out.println("Data tidak ditemukan di dalam queue");
            } else {
                System.out.println("Data " + data + " berada pada posisi: " + position);
            }
        }
    }

    void peekAt(int position) {
        if (position < 1 || position > ukuran19D) {
            System.out.println("Posisi yang diminta tidak valid");
        } else {
            int i = depan19D;
            int pos = 1;
            while (pos != position) {
                i = (i + 1) % maks19D;
                pos++;
            }
            System.out.println("Data pada posisi " + position + " adalah " + q19D[i]);
        }
    }

    void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = depan19D;
            while (i != belakang19D) {
                System.out.println(q19D[i] + " ");
                i = (i + 1) % maks19D;
            }
            System.out.println(q19D[i] + " ");
            System.out.println("Jumlah elemen: " + ukuran19D);
        }
    }

    void clear() {
        if (!IsEmpty()) {
            depan19D = belakang19D = -1;
            ukuran19D = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                depan19D = belakang19D = 0;
            } else {
                if (belakang19D == maks19D - 1) {
                    belakang19D = 0;
                } else {
                    belakang19D++;
                }
            }
            q19D[belakang19D] = data;
            ukuran19D++;
        }
    }

    int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            data = q19D[depan19D];
            ukuran19D--;
            if (IsEmpty()) {
                depan19D = belakang19D = -1;
            } else {
                if (depan19D == maks19D - 1) {
                    depan19D = 0;
                } else {
                    depan19D++;
                }
            }
        }
        return data;
    }
}
