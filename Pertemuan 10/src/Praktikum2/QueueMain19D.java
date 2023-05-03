package Praktikum2;

import java.util.Scanner;

public class QueueMain19D {
    static void menu() {
        System.out.println("\nPilih menu: ");
        System.out.println(
                "1. Antrean baru\n2. Antrean keluar\n3. Cek antrean terdepan\n4. Cek semua antrean\n5. Cek antrean terbelakang\n-------------------");
    }

    public static void main(String[] args) {
        Scanner rayhan19D = new Scanner(System.in);

        System.out.print("Masukkan kapasistas queue: ");
        int jumlah = rayhan19D.nextInt();
        Queue antre19D = new Queue(jumlah);

        int pilih;

        do {
            menu();
            pilih = rayhan19D.nextInt();
            rayhan19D.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama19D = rayhan19D.nextLine();
                    System.out.print("Kota asal: ");
                    String asal19D = rayhan19D.nextLine();
                    System.out.print("Kota tujuan: ");
                    String tujuan19D = rayhan19D.nextLine();
                    System.out.print("Jumlah tiket: ");
                    int jumlah19D = rayhan19D.nextInt();
                    System.out.print("Harga: ");
                    int harga19D = rayhan19D.nextInt();
                    Penumpang p = new Penumpang(nama19D, asal19D, tujuan19D, jumlah19D, harga19D);
                    rayhan19D.nextLine();
                    antre19D.Enqueue(p);
                    break;
                case 2:
                    Penumpang data19D = antre19D.Dequeue();
                    if (!"".equals(data19D.nama19D) && !"".equals(data19D.kotaAsal19D)
                            && !"".equals(data19D.kotaTujuan19D) && data19D.jumlahTiket19D != 0
                            && data19D.harga19D != 0) {
                        System.out.println("Antrean yang keluar: " + data19D.nama19D + " " + data19D.kotaAsal19D + " "
                                + data19D.kotaTujuan19D + " " + data19D.jumlahTiket19D + " " + data19D.harga19D);
                        break;
                    }

                case 3:
                    antre19D.peek();
                    break;

                case 4:
                    antre19D.print();
                    break;
                case 5:
                    antre19D.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);

        rayhan19D.close();
    }
}
