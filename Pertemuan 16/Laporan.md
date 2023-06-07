# Laporan Praktikum 10

NIM : 2241720213<br>
Nama : Muhammad Rayhan<br>
Kelas : TI-1D

## <b>Latihan</b>

### <b>Contoh List</b>

1. Pembuatan Program<br>
   <img src = "Kode Contoh List.png"><br><br>

2. Verifikasi Hasil Percobaan
   <img src = "Hasil Eksekusi 1.png"><br>

3. Jawaban<br>
   1. Metode `add()` pada objek `List` dapat menerima masukan tipe data apa pun karena `List` diimplementasikan sebagai struktur data yang dapat menyimpan objek dengan tipe data yang berbeda. Artinya, saat kita membuat objek `List` tanpa tipe data, secara tidak langsung membuatnya menjadi `List<Object>`, yang memungkinkan penambahan objek dengan tipe data apa pun.
   2. ```
      List<Integer> l = new ArrayList<>();
      l.add(1);
      l.add(2);
      l.add(3);
      pembatas();
      System.out.printf("Elemen 0: %s\nTotal elemen: %d\nElemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));
      l.remove(0);
      pembatas();
      System.out.printf("Elemen 0: %s\nTotal elemen: %d\nElemen terakhir: %s\n", l.get(0), l.size(),
      l.get(l.size() - 1));
      pembatas();
      ```
   3. <img src = "Pertanyaan 3.1.png"><br>
   4. <img src = "Pertanyaan 4.1.png"><br>
   5. Dari segi fungsionalitas atau kegunaan, perubahan kode program tersebut tidak mengubah secara signifikan. Hanya saja, dari segi kejelasan kode, perubahan secara eksplisit tersebut menunjukkan bahwa jenis struktur data yang akan digunakan adalah jenis linkedlist, bukan arraylist.

### <b>Loop Collection</b>

1. Pembuatan Program<br>
   <img src = "Kode Loop Collection.png"><br><br>

2. Verifikasi Hasil Percobaan
   <img src = "Hasil Eksekusi 2.png"><br><br>

3. Jawaban
   1. Secara fungsi (kegunaan), kedua metode tersebut sama, yaitu sama-sama menambahkan elemen baru ke dalam koleksi. Hanya saja, metode push() secara khusus dan eksplisit digunakan dalam konteks stack saja, sementara metode add() bersifat umum dalam koleksi (tidak stack saja). Oleh karena itu, dalam konteks stack, kita disarankan untuk menggunakan metode push() dibanding add().
   2. <img src = "Pertanyaa 2.2.png"><br>
      Hal yang terjadi adalah tidak adanya penambahan elemen "Durian" dan "Melon" ke dalam stack. Tak hanya itu, bagin kode program for iterator, stream, dan foreach tidak akan ada yang dieksekusi karena tidak ada penambahan elemen. Saat dieksekusi hasilnya di atas.
   3. Perulangan `for` menggunakan iterator pada `Stack` "fruits" digunakan untuk mengiterasi dan mencetak elemen-elemen dalam `Stack`. Iterator berfungsi sebagai "penunjuk" yang menunjuk ke elemen pertama dalam `Stack`, dan pada setiap iterasi, elemen saat ini dicetak. Hal ini memungkinkan akses berurutan ke setiap elemen dalam koleksi data dan memungkinkan operasi pengolahan yang diperlukan sebelum penghapusan.
   4. 
   5. Berfungsi untuk membatasi array agar dapat mencetak sampai indeks ke-6 pada saat dicetak pada traverseInOrder.

### <b>Mahasiswa</b>

1. Pembuatan Program<br>
   <img src = "Kode Mahasiswa.png"><br><br>

2. Verifikasi Hasil Percobaan
   <img src = "Hasil Eksekusi 3.png"><br><br>

3. Jawaban
   1. Konsep argumen pada metode tambah() adalah variabel argumen atau yang biasa disingkat varargs. Secara fungsi, jenis argumen tersebut mirip dengan argumen bertipe array, tetapi terdapat beberapa kelebihan yang salah satunya: dapat menerima masukan argumen lebih dari satu, tanpa harus membuat array terlebih dahulu.
   2. Berfungsi menginputkan nilai awal array dan mengatur batas terakhir indeks array yang akan digunakan pada method traverse in order
   3. Berfungsi mencetak data secara indorder
   4. leftchild berada pada indeks ke-5 dan rightchild berada pada indeks ke-6 jika root dimulai dari indeks ke-0. Sebaliknya, jika root dimulai dari indeks ke-1, leftchild terletak pada indeks ke 5 dan righchild terletak pada indeks ke 6.
   5. Berfungsi untuk membatasi array agar dapat mencetak sampai indeks ke-6 pada saat dicetak pada traverseInOrder.

## <b>Tugas</b>

1. <img src = "Tugas Satu.png"><br><br>
2. <img src = "Tugas Dua.png"><br><br>
3. <img src = "Tugas Tiga.png"><br><br>
3. <img src = "Tugas Tiga.png"><br><br>
