package Praktikum2;

public class Penumpang {
    String nama19D, kotaAsal19D, kotaTujuan19D;
    int jumlahTiket19D, harga19D;

    Penumpang(String nama19D, String kotaAsal19D, String kotaTujuan19D, int jumlahTiket19D, int harga19D) {
        this.nama19D = nama19D;
        this.kotaAsal19D = kotaAsal19D;
        this.kotaTujuan19D = kotaTujuan19D;
        this.jumlahTiket19D = jumlahTiket19D;
        this.harga19D = harga19D;
    }
}

class Queue {
    int maks19D, ukuran19D, depan19D, belakang19D;
    Penumpang[] q19D;

    Queue(int n) {
        maks19D = n;
        Create();
    }

    void Create() {
        q19D = new Penumpang[maks19D];
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
            System.out.println("Elemen terdepan: " + q19D[depan19D].nama19D + " " + q19D[depan19D].kotaAsal19D + " "
                    + q19D[depan19D].kotaTujuan19D + " " + q19D[depan19D].jumlahTiket19D + " "
                    + q19D[depan19D].harga19D);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen terbelakang: " + q19D[belakang19D].nama19D + " " + q19D[belakang19D].kotaAsal19D + " "
                    + q19D[belakang19D].kotaTujuan19D + " " + q19D[belakang19D].jumlahTiket19D + " "
                    + q19D[belakang19D].harga19D);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = depan19D;
            while (i != belakang19D) {
                System.out.println("Elemen terdepan: " + q19D[depan19D].nama19D + " " + q19D[depan19D].kotaAsal19D + " "
                        + q19D[depan19D].kotaTujuan19D + " " + q19D[depan19D].jumlahTiket19D + " "
                        + q19D[depan19D].harga19D);
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

    void Enqueue(Penumpang data) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                depan19D = belakang19D = 0;
            } else {
                if (depan19D == maks19D - 1) {
                    belakang19D = 0;
                } else {
                    belakang19D++;
                }
            }
            q19D[belakang19D] = data;
            ukuran19D++;
        }
    }

    Penumpang Dequeue() {
        Penumpang data = new Penumpang("", "", "", 0, 0);
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
