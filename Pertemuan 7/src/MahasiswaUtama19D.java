import java.util.Scanner;

public class MahasiswaUtama19D {
    public static void main(String[] args) {
        Scanner int19D = new Scanner(System.in);
        Scanner string19D = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs19D = int19D.nextInt();
        PencarianMhs19D data19D = new PencarianMhs19D();

        System.out.println("------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < jumlahMhs19D; i++) {
            System.out.print("NIM\t: ");
            int nIM19D = int19D.nextInt();
            System.out.print("Nama\t: ");
            String nama19D = string19D.nextLine();
            System.out.print("Umur\t: ");
            int umur19D = int19D.nextInt();
            System.out.print("IPK\t: ");
            Double iPK19D = int19D.nextDouble();

            Mahasiswa19D m = new Mahasiswa19D(nIM19D, umur19D, nama19D, iPK19D);
            data19D.tambah19D(m);
            System.out.println("----------------------------");
        }

        System.out.println("\n--------------------- Data Keseluruhan Mahasiswa ---------------------");
        data19D.tampil19D();

        System.out.println("--------------------- Pencarian Data ---------------------");
        System.out.print("Masukkan NIM mahasiswa yang dicari: ");
        int cari19D = int19D.nextInt();
        System.out.println("\n------------------------------------------");
        System.out.println("Menggunakan sequential search");
        System.out.println("------------------------------------------");

        int posisi19D = data19D.FindSeqSearch19D(cari19D);
        data19D.tampilPosisi19D(cari19D, posisi19D);
        data19D.tampilData19D(cari19D, posisi19D);

        System.out.println("\n------------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("------------------------------------------");

        posisi19D = data19D.FindBinarySearch19D(cari19D, 0, jumlahMhs19D - 1);
        data19D.tampilPosisi19D(cari19D, posisi19D);
        data19D.tampilData19D(cari19D, posisi19D);

        int19D.close();
        string19D.close();
    }
}
