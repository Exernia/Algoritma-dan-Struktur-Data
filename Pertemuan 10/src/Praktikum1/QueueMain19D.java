package Praktikum1;

import java.util.Scanner;

public class QueueMain19D {
    static void menu() {
        System.out.println("\nMasukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue\n2. Dequeue\n3. Print\n4. Peek\n5. Clear\n6. Cari Data\n7. Cari Posisi\n-------------------");
    }

    public static void main(String[] args) {
        Scanner rayhan19D = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = rayhan19D.nextInt();

        Queue Q19D = new Queue(n);

        int pilih19D;

        do {
            menu();
            pilih19D = rayhan19D.nextInt();
            switch (pilih19D) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk19D = rayhan19D.nextInt();
                    Q19D.Enqueue(dataMasuk19D);
                    break;
                case 2:
                    int dataKeluar19D = Q19D.Dequeue();
                    if (dataKeluar19D != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar19D);
                        break;
                    }
                case 3:
                    Q19D.print();
                    break;
                case 4:
                    Q19D.peek();
                    break;
                case 5:
                    Q19D.clear();
                    break;
                case 6:
                    System.out.print("Masukkan data yang ingin dicari: ");
                    int cariData19D = rayhan19D.nextInt();
                    Q19D.peekPosition(cariData19D);
                case 7:
                    System.out.print("Masukkan posisi yang ingin dicari: ");
                    int cariPosisi19D = rayhan19D.nextInt();
                    Q19D.peekAt(cariPosisi19D);
            }
        } while (pilih19D == 1 || pilih19D == 2 || pilih19D == 3 || pilih19D == 4 || pilih19D == 5);

        rayhan19D.close();

    }
}
