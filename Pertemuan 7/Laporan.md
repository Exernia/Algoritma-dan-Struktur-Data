# Laporan Praktikum 7

NIM : 2241720213<br>
Nama : Muhammad Rayhan<br>
Kelas : TI-1D

## <b>Latihan</b>

### <b>7.1 Pencarian Menggunakan Agoritma Sequential Search</b>

1. Pembuatan Program

   ```java
   public class Mahasiswa19D {
    private int nIM19D, umur19D;
    private String nama19D;
    private double iPK19D;

    public int getnIM19D() {
        return nIM19D;
    }

    public int getUmur19D() {
        return umur19D;
    }

    public String getNama19D() {
        return nama19D;
    }

    public double getiPK19D() {
        return iPK19D;
    }

    Mahasiswa19D(int nIM19D, int umur19D, String nama19D, double iPK19D) {
        this.nIM19D = nIM19D;
        this.umur19D = umur19D;
        this.nama19D = nama19D;
        this.iPK19D = iPK19D;
    }

    void tampil19D() {
        System.out.println("NIM\t: " + nIM19D);
        System.out.println("Nama\t: " + nama19D);
        System.out.println("Umur\t: " + umur19D);
        System.out.println("IPK\t: " + iPK19D);
    }
   }

   public class PencarianMhs19D {
    Mahasiswa19D[] daftarMhs19D = new Mahasiswa19D[5];
    int idx19D;

    void tambah19D(Mahasiswa19D m) {
        if (idx19D < daftarMhs19D.length) {
            daftarMhs19D[idx19D] = m;
            idx19D++;
        } else {
            System.out.println("Data sudah penuh!!!");
        }
    }

    void tampil19D() {
        for (Mahasiswa19D m : daftarMhs19D) {
            m.tampil19D();
            System.out.println("----------------------------\n");

        }
    }

    int FindSeqSearch19D(int cari19D) {
        int posisi = -1;
        for (int i = 0; i < daftarMhs19D.length; i++) {
            if (daftarMhs19D[i].getnIM19D() == cari19D) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    int FindBinarySearch19D(int cari19D, int kiri19D, int kanan19D) {
        int tengah19D;

        if (kanan19D >= kiri19D) {
            tengah19D = (kiri19D + kanan19D) / 2;
            if (cari19D == daftarMhs19D[tengah19D].getnIM19D()) {
                return (tengah19D);
            } else if (daftarMhs19D[tengah19D].getnIM19D() > cari19D) {
                return FindBinarySearch19D(cari19D, kiri19D, tengah19D - 1);
            } else {
                return FindBinarySearch19D(cari19D, tengah19D + 1, kanan19D);
            }
        }
        return -1;
    }

    void tampilPosisi19D(int x, int pos) {
        if (pos != -1) {
            System.out.printf("Data %d ditemukan pada indeks %d\n", x, pos);
        } else {
            System.out.printf("Data %d tidak ditemukan\n", x);
        }
    }

    void tampilData19D(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t: " + daftarMhs19D[pos].getnIM19D());
            System.out.println("Nama\t: " + daftarMhs19D[pos].getNama19D());
            System.out.println("Umur\t: " + daftarMhs19D[pos].getUmur19D());
            System.out.println("IPK\t: " + daftarMhs19D[pos].getiPK19D());
        } else {
            System.out.printf("Data %d tidak ditemukan\n", x);
        }
    }
   }

   import java.util.Scanner;
   public class MahasiswaUtama19D {
    public static void main(String[] args) {
        Scanner int19D = new Scanner(System.in);
        Scanner string19D = new Scanner(System.in);

        PencarianMhs19D data19D = new PencarianMhs19D();
        int jumlahMhs19D = 5;

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
   ```

2. Verifikasi Hasil Percobaan
   <img src = "Hasil Eksekusi 1.1.png"><br>
   <img src = "Hasil Eksekusi 1.2.png"><br>
   <img src = "Hasil Eksekusi 1.3.png"><br><br>
3. Jawaban<br>
   1. Metode <b>tampilData</b> memiliki kegunaan untuk menampilkan nilai dari variabel/data yang ada, sementara metode <b>tampilPosisi</b> memiliki kegunaan untuk mencetak posisi atau indeks dari suatu data yang dicari.
   2. Fungsi break pada potongan program di atas adalah untuk menghentikan proses perulangan di atasnya. Jika nilai yang dicari bernilai true, maka kode <b>break</b> akan dieksekusi yang berarti menghentikan proses perulangan terdekatnya.
   3. Tentunya, program tersebut masih berjalan dengan lancar dan tidak menghasilkan masalah dalam proses eksekusinya. Meskipun demikian, data yang dicetak tidak mengikuti urutan NIM mahasiswa, melainkan mengikuti urutan indeks. Hal ini terjadi karena metode <b>tampil</b> yang hanya mencetak nilai atau data secara berurutan berdasarkan indeks, bukan berdasarkan NIM-nya.

### <b>7.2 Pencarian Menggunakan Binary Search</b>

1. Pembuatan Program

   ```java
   int FindBinarySearch19D(int cari19D, int kiri19D, int kanan19D) {
        int tengah19D;

        if (kanan19D >= kiri19D) {
            tengah19D = (kiri19D + kanan19D) / 2;
            if (cari19D == daftarMhs19D[tengah19D].getnIM19D()) {
                return (tengah19D);
            } else if (daftarMhs19D[tengah19D].getnIM19D() > cari19D) {
                return FindBinarySearch19D(cari19D, kiri19D, tengah19D - 1);
            } else {
                return FindBinarySearch19D(cari19D, tengah19D + 1, kanan19D);
            }
        }
        return -1;
   }
   System.out.println("\n------------------------------------------");
   System.out.println("Menggunakan binary search");
   System.out.println("------------------------------------------");

   posisi19D = data19D.FindBinarySearch19D(cari19D, 0, jumlahMhs19D - 1);
   data19D.tampilPosisi19D(cari19D, posisi19D);
   data19D.tampilData19D(cari19D, posisi19D);
   ```

2. Verifikasi Hasil Percobaan
   <img src = "Hasil Percobaan 4.2.png"><br><br>
3. Jawaban
   1. Proses divide terjadi pada potongan kode program <b>tengah19D = (kiri19D + kanan19D) / 2;</b>.
   2. Proses conquer terjadi pada potongan kode program pada blok kode <b>else if</b> dan <b>else</b>.
   3. Program masih bisa berjalan. Hanya saja, proses pencarian dengan binary tidak berjalan dengan semestinya karena data tidak terurut. Oleh karena itu, perlu ada pengurutan data setalah data diinputkan.
   4. Data tetap tidak ditemukan
      <img src = "Soal 2.4.png"><br>
      Pengubahan program

      ```java
      int FindBinarySearch19D(int cari19D, int kiri19D, int kanan19D) {
        int tengah19D;

        if (kanan19D >= kiri19D) {
            tengah19D = (kiri19D + kanan19D) / 2;
            if (cari19D == daftarMhs19D[tengah19D].getnIM19D()) {
                return (tengah19D);
            } else if (daftarMhs19D[tengah19D].getnIM19D() < cari19D) {
                return FindBinarySearch19D(cari19D, kiri19D, tengah19D - 1);
            } else {
                return FindBinarySearch19D(cari19D, tengah19D + 1, kanan19D);
            }
        }
        return -1;
      }
      ```
      Karena data yang terurut adalah data dari besar ke kecil, kita hanya perlu mengubah notasi dari "lebih besar dari (>)" menjadi "lebih kecil dari (<)". Sehingga, jika data yang dicocokkan dengan nilai tengah tidak sama, maka ia akan berpindah ke sebelah kiri nilai posisi tengah, bukan ke sebelah kiri.<br>

   5. Kode Program
      ```java
      System.out.print("Masukkan jumlah mahasiswa: ");
      int jumlahMhs19D = int19D.nextInt();
      PencarianMhs19D data19D = new PencarianMhs19D();
      ```
      Eksekusi Program
      <img src = "Hasil 2.5.png"><br><br>

### <b>7.3 Percobaan Pengayaan Divide and Conquer</b>

1. Pembuatan Program

   ```java
   public class MergeSortTes19D {
    void mergeSort19D(int[] data) {
        sort19D(data, 0, data.length - 1);
    }

    void merge19D(int data19D[], int kiri19D, int tengah19D, int kanan19D) {
        int[] temp = new int[data19D.length];

        for (int i = kiri19D; i <= kanan19D; i++) {
            temp[i] = data19D[i];
        }

        int a = kiri19D;
        int b = tengah19D + 1;
        int c = kiri19D;

        while (a <= tengah19D && b <= kanan19D) {
            if (temp[a] <= temp[b]) {
                data19D[c] = temp[a];
                a++;
            } else {
                data19D[c] = temp[b];
                b++;
            }
            c++;
        }

        int s = tengah19D - a;

        for (int i = 0; i <= s; i++) {
            data19D[c + i] = temp[a + i];
        }
    }

    void sort19D(int data19D[], int kiri19D, int kanan19D) {
        if (kiri19D < kanan19D) {
            int tengah = (kiri19D + kanan19D) / 2;
            sort19D(data19D, kiri19D, tengah);
            sort19D(data19D, tengah + 1, kanan19D);
            merge19D(data19D, kiri19D, tengah, kanan19D);
        }
    }

    void cetakArray19D(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   }

   class sortUtama {
      public static void main(String[] args) {
         int data19D[] = { 10, 40, 30, 50, 70, 20, 100, 90 };

        System.out.println("Sorting dengan merge sort");
        MergeSortTes19D mSort19D = new MergeSortTes19D();

        System.out.println("Data awal");
        mSort19D.cetakArray19D(data19D);
        mSort19D.mergeSort19D(data19D);
        System.out.println("Setelah diurutkan");
        mSort19D.cetakArray19D(data19D);
    }
   }
   ```
2. Verifikasi Hasil Percobaan
<img src = "Hasil 2.png"><br><br>

## Tugas
