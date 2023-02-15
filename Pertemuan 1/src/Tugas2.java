import java.util.Scanner;

public class Tugas2 {
    static float rumusKecepatan(Float jarak, Float waktu) {
        float kecepatan = jarak / waktu;
        return kecepatan;
    }

    static float rumusJarak(Float kecepatan, Float waktu) {
        float jarak = kecepatan * waktu;
        return jarak;
    }

    static float rumusWaktu(Float jarak, Float kecepatan) {
        float waktu = jarak / kecepatan;
        return waktu;
    }

    public static void main(String[] args) {
        Scanner rayhan19D = new Scanner(System.in);
        Scanner teks19D = new Scanner(System.in);

        System.out.println("Pilihan menu:");
        System.out.println("\n1. Perhitungan Kecepatan\n2. Perhitungan Jarak\n3. Perhitungan Waktu");
        System.out.print("\nMenu Pilihan Anda: ");
        String teks = teks19D.nextLine();
        System.out.println();

        if (teks.equals("1")) {
            System.out.print("Jarak\t\t: ");
            Float jarak = rayhan19D.nextFloat();
            System.out.print("Waktu (dalam menit): ");
            Float waktu = rayhan19D.nextFloat();
            System.out.println("Kecepatan\t: " + rumusKecepatan(jarak, waktu) + " m/s");
        } else if (teks.equals("2")) {
            System.out.print("Kecepatan\t: ");
            Float kecepatan = rayhan19D.nextFloat();
            System.out.print("Waktu (dalam menit): ");
            Float waktu = rayhan19D.nextFloat();
            System.out.println("Jarak\t\t: " + rumusJarak(kecepatan, waktu) + " meter");
        } else if (teks.equals("3")) {
            System.out.print("jarak\t\t: ");
            Float jarak = rayhan19D.nextFloat();
            System.out.print("Kecepatan\t: ");
            Float kecepatan = rayhan19D.nextFloat();
            System.out.println("Waktu (dalam menit): " + rumusWaktu(jarak, kecepatan) + " menit");
        } else {
            System.out.println("Menu tidak ada");
        }
        rayhan19D.close();
        teks19D.close();
    }
}
