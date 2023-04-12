import java.util.Scanner;

public class UTS {
    static int[] konversiHurufKeAngka19D(String namaLengkap19D) {
        String nama19D = namaLengkap19D.replaceAll("\\s+", "").toLowerCase();
        int[] angka = new int[nama19D.length()];

        for (int i = 0; i < nama19D.length(); i++) {
            angka[i] = (int) nama19D.charAt(i) - 96;
        }

        return angka;
    }

    static int[] penggabungan19D(int[] angka, Long nim) {
        String stringNama = String.valueOf(nim);
        int[] array = new int[stringNama.length() + angka.length];

        for (int i = 0; i < stringNama.length(); i++) {
            array[i] = stringNama.charAt(i) - '0';
        }

        for (int i = stringNama.length(); i < angka.length + stringNama.length(); i++) {
            array[i] = angka[i - stringNama.length()];
        }

        return array;
    }
}

class Sorting19D {
    static void bubbleSort19D(int[] array19D) {
        for (int i = 0; i < array19D.length - 1; i++) {
            for (int j = 0; j < array19D.length - i - 1; j++) {
                if (array19D[j] > array19D[j + 1]) {
                    int temp = array19D[j];
                    array19D[j] = array19D[j + 1];
                    array19D[j + 1] = temp;
                }
            }
        }
    }

    static void insertionSort19D(int[] array19D) {
        for (int i = 1; i < array19D.length; i++) {
            int key = array19D[i];
            int j = i - 1;

            while (j >= 0 && array19D[j] > key) {
                array19D[j + 1] = array19D[j];
                j--;
            }

            array19D[j + 1] = key;
        }
    }
}

class Searching19D {
    static int binarySearch19D(String[] arr, String x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    static void sequentialSearch19D(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Elemen tidak ditemukan");
        } else {
            System.out.println("Elemen ditemukan pada indeks ke-" + index);
        }
    }
}

class utama19D {
    public static void main(String[] args) {
        Scanner integer19D = new Scanner(System.in);
        Scanner string19D = new Scanner(System.in);

        System.out.print("Masukkan NIM Anda\t\t: ");
        Long isiNIM19D = integer19D.nextLong();
        System.out.print("Masukkan nama lengkap Anda\t: ");
        String isiNama19D = string19D.nextLine();

        int[] angka19D = UTS.konversiHurufKeAngka19D(isiNama19D);
        int[] array19D = UTS.penggabungan19D(angka19D, isiNIM19D);
        int digitTerakhir = array19D[array19D.length - 1] % 10;

        System.out.print("\nArray sebelum diurutkan: ");
        for (int i = 0; i < array19D.length; i++) {
            System.out.print(array19D[i] + " ");
        }
        System.out.println();

        System.out.print("\nTulis angka yang ingin dicari\t: ");
        String cariAngka19D = string19D.nextLine();

        if (digitTerakhir == 0 || digitTerakhir % 2 == 0) {
            System.out.println("\nMenerapkan bubble sort dan binary search");
            Sorting19D.bubbleSort19D(array19D);
            String[] ubahString19D = new String[array19D.length];
            for (int i = 0; i < array19D.length; i++) {
                ubahString19D[i] = String.valueOf(array19D[i]);
            }
            int indeks = Searching19D.binarySearch19D(ubahString19D, cariAngka19D);
            System.out.println(
                    "\nHasil binary search: " + (indeks != -1 ? "Ditemukan pada indeks " + indeks : "Tidak ditemukan"));
        } else {
            System.out.println("\nMenerapkan insertion sort dan sequential search");
            Sorting19D.insertionSort19D(array19D);
            Searching19D.sequentialSearch19D(array19D, Integer.parseInt(cariAngka19D));
        }

        System.out.print("\nArray setelah diurutkan: ");
        for (int i = 0; i < array19D.length; i++) {
            System.out.print(array19D[i] + " ");
        }

        integer19D.close();
        string19D.close();
    }

}