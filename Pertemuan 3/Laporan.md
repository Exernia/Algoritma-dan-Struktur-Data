# Laporan Praktikum 3

NIM     : 2241720213<br>
Nama    : Muhammad Rayhan<br>
Kelas   : TI-1D

## <b>Latihan</b>
### <b>3.1 Membuat Array dari Object, Mengisi dan Menampilkan</b>
1. Pembuatan Program
<img src = "Latihan 3.1.png"><br><br>
2. Verifikasi Hasil Percobaan
<img src = "Verifikasi Hasil Percobaan 1.png"><br><br>
3. Jawaban<br>
    1.	Secara aturan, sebuah kelas tidak mengapa jika tidak memiliki atribut atau metode satu pun. Namun, idealnya, sebuah kelas harus memiliki isian yang bisa mengidentifikasinya, karena sebuah kelas merupakan representasi dari objek di dunia nyata, baik itu berwujud atau tidak. Objek tersebut pasti memiliki sesuatu yang bisa diidentifikasi, baik itu pengenal berupa ciri-ciri atau perilaku berupa perbuatan.
    2.	Kelas PersegiPanjang pada program di atas tidak memiliki konstruktor. Demikian bisa dilakukan karena kita memang tidak mendeklarasikannya. Kode <b>ppArray[1] = new PersegiPanjang();</b> ditulis sebagai instansiasi objek indeks kedua. Hal itu dilakukan karena sebelumnya kita menginstansiasi objek ppArray kelas PersegiPanjang sebagai ArrayofObject. Oleh karenanya, kita harus menginstansiasi setiap indeks  objek yang dibuat pula.

    3.	Kode tersebut merupakan instansiasi objek dari kelas PersegiPanjang dalam bentuk ArrayofObject.

    4.	Pada kode <b>ppArray[1] = new PersegiPanjang();</b> merupakan instansiasi indeks kedua ArrayofObject ppArray dari kelas PersegiPanjang.
Pada kode <b>ppArray[1].panjang = 80;</b> dan <b>ppArray[1].lebar = 40</b> merupakan inisialisasi variabel/atribut panjang dan lebar dengan nilai 80 dan 40 pada ArrayofObject ppArray indeks kedua dari kelas PersegiPanjang.

    5.	Kelas PersegiPanjang dan Kelas Utama dipisah bertujuan agar kode program lebih terorganisasi. Namun, sebenarnya, jika kedua kelas tersebut hanya ditulis dalam satu kelas yang sama juga, bukan masalah, alias tidak ada keeroran yang terjadi.

### 3.2 <b>Menerima Input Isian Array Menggunakan Looping</b>
1. Pembuatan Program
<img src = "Latihan 3.2.png"><br><br>
2. Verifikasi Hasil Percobaan
<img src = "Verifikasi Hasil Percobaan 2.png"><br><br>
3. Jawaban
    1.  Ya, bisa, bahkan tidak hanya dua dimensi, tiga atau lebih dimensi pun bisa-bisa saja.<br><br>
    2.  Pembuatan Program<br>
        <img src = "Contoh Soal 2 Nomor 3.png"><br>
        Eksekusi Program<br>
        <img src = "Eksekusi Soal 2 Nomor 3.png"><br><br>
    3.  Kode tersebut eror karena tidak ada instansiasi indeks array objek yang bersangkutan, yaitu indeks 5.<br><br>
    4.  <img src = "Soal 2 Nomor 4.png"><br><br>
    5.  Ya, bisa secara aturan. Tidak ada eror atau masalah yang akan terjadi saat dieksekusi. Namun, perlu diingat, jika kita melakukan seperti itu, nilai yang telah dimasukkan sebelumnya akan ditimpa dengan nilai yang baru.<br><br>

### 3.2 <b>Operasi Matematika Atribut Object Array</b>
1. Pembuatan Program
<img src = "Latihan 3.3.png"><br><br>
2. Verifikasi Hasil Percobaan
<img src = "Verifikasi Hasil Percobaan 3.png"><br><br>
3. Jawaban
    1.  Ya, bisa. Tidak ada batasan jumlah dalam pembuatan konstruktur di sebuah kelas, asalkan tidak ada pembeda dari satu konstruktor ke konstruktor lainnya. Hanya saja, saat instansiasi objek nanti, objek tersebut hanya harus mengikuti satu cetakan dari banyak konstruktor yang dibuat dalam kelas tersebut.<br>
        Contoh Program:
        <img src = "Deklarasi Konstruktor.png"><br>
        <img src = "Instansiasi Objek.png"><br>
        Instansiasi Objek di atas merujuk pada konstruktor pada gambar di atasnya. Hal itu juga bisa dilihat dari tidak adanya parameter yang dimasukkan saat instansiasi objek.<br><br>
    2.  Pembuatan Program<br>
        <img src = "Soal 3 Nomor 2.png"><br><br>
    3.  Pembuatan Program<br>
        <img src = "Soal 3 Nomor 3.png"><br><br>
    4.  Pembuatan Program<br>
        <img src = "Soal 3 Nomor 4.png"><br><br>
    5.  Pembuatan Program<br>
        <img src = "Soal 3 Nomor 5.png"><br>
        Eksekusi Program<br>
        <img src = "Eksekusi Soal 3 Nomor 5.png"><br><br>

## Tugas
1.  Pembuatan Program<br>
    <img src = "Program Tugas 2.png"><br><br>
    Hasil Eksekusi<br>
    <img src = "Hasil Eksekusi Tugas 1.png">
    <img src = "Hasil Eksekusi Tugas 1.1.png"><br><br>
2.  Pembuatan Program<br>
    <img src = "Program Tugas 2.png"><br><br>
    Hasil Eksekusi<br>
    <img src = "Hasil Eksekusi Tugas 2.png">