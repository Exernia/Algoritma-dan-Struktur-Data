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
