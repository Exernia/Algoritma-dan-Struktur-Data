import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner rayhan19D = new Scanner(System.in);

        Kerucut19D[] kerucutRayhan19D = new Kerucut19D[3];
        double[] jariJari19D = new double[kerucutRayhan19D.length];
        double[] sisiMiring19D = new double[kerucutRayhan19D.length];

        System.out.println("================= Perhitungan Volume dan Luas Permukaan Kerucut =================");
        for (int i = 0; i < kerucutRayhan19D.length; i++) {
            System.out.println("---------------- Kerucut ke-" + (i + 1) + " ----------------");
            System.out.print("Masukkan jari-jari\t\t: ");
            jariJari19D[i] = rayhan19D.nextDouble();
            System.out.print("Masukkan sisi miring\t\t: ");
            sisiMiring19D[i] = rayhan19D.nextDouble();
            kerucutRayhan19D[i] = new Kerucut19D(jariJari19D[i], sisiMiring19D[i]);
        }

        System.out.println();

        for (int i = 0; i < kerucutRayhan19D.length; i++) {
            System.out.printf("Volume Kerucut ke-%d\t\t: %.2f\n", (i + 1), kerucutRayhan19D[i].hitungVolume19D());
            System.out.printf("Luas Permukaan Kerucut ke-%d\t: %.2f\n", (i + 1),
                    kerucutRayhan19D[i].hitungLuasPermukaan19D());
        }

        System.out.println();
        System.out.println();

        LimasSegiEmpatSamaSisi19D[] limasRayhan19D = new LimasSegiEmpatSamaSisi19D[3];
        double[] panjangSisiAlas19D = new double[limasRayhan19D.length];
        double[] tinggi19D = new double[limasRayhan19D.length];

        System.out.println("================= Perhitungan Volume dan Luas Permukaan Limas =================");
        for (int i = 0; i < limasRayhan19D.length; i++) {
            System.out.println("-------------- Limas ke-" + (i + 1) + " --------------");
            System.out.print("Masukkan panjang sisi alas\t: ");
            panjangSisiAlas19D[i] = rayhan19D.nextDouble();
            System.out.print("Masukkan tinggi limas\t\t: ");
            tinggi19D[i] = rayhan19D.nextDouble();
            limasRayhan19D[i] = new LimasSegiEmpatSamaSisi19D(panjangSisiAlas19D[i], tinggi19D[i]);
        }

        System.out.println();

        for (int i = 0; i < limasRayhan19D.length; i++) {
            System.out.printf("Volume Limas ke-%d\t\t: %.2f\n", (i + 1), limasRayhan19D[i].hitungVolume19D());
            System.out.printf("Luas Permukaan Limas ke-%d\t: %.2f\n", (i + 1),
                    limasRayhan19D[i].hitungLuasPermukaan19D());
        }

        System.out.println();
        System.out.println();

        Bola19D[] bolaRayhan19D = new Bola19D[3];
        double[] jariJariBola19D = new double[bolaRayhan19D.length];

        System.out.println("================= Perhitungan Volume dan Luas Permukaan Bola =================");
        for (int i = 0; i < bolaRayhan19D.length; i++) {
            System.out.printf("Masukkan jari-jari Bola ke-%d: ", (i + 1));
            jariJariBola19D[i] = rayhan19D.nextDouble();
            bolaRayhan19D[i] = new Bola19D(jariJariBola19D[i]);
        }

        System.out.println();

        for (int i = 0; i < bolaRayhan19D.length; i++) {
            System.out.printf("Volume Bola ke-%d\t\t: %.2f\n", (i + 1), bolaRayhan19D[i].hitungVolume19D());
            System.out.printf("Luas Permukaan Bola ke-%d\t: %.2f\n", (i + 1),
                    bolaRayhan19D[i].hitungLuasPermukaan19D());
        }

        rayhan19D.close();
    }
}

class Kerucut19D {
    double jariJari9D, sisiMiring19D;

    public Kerucut19D(double jariJari9D, double sisiMiring19D) {
        this.jariJari9D = jariJari9D;
        this.sisiMiring19D = sisiMiring19D;
    }

    double hitungVolume19D() {
        double tinggi19D = Math.sqrt(((sisiMiring19D * sisiMiring19D) - (jariJari9D * jariJari9D)));
        return (1.0 / 3.0) * Math.PI * jariJari9D * jariJari9D * tinggi19D;
    }

    double hitungLuasPermukaan19D() {
        return Math.PI * jariJari9D * (jariJari9D + sisiMiring19D);
    }
}

class LimasSegiEmpatSamaSisi19D {
    double panjangSisiAlas19D, tinggi19D;

    public LimasSegiEmpatSamaSisi19D(double panjangSisiAlas19D, double tinggi19D) {
        this.panjangSisiAlas19D = panjangSisiAlas19D;
        this.tinggi19D = tinggi19D;
    }

    double hitungVolume19D() {
        return (1.0 / 3.0) * (panjangSisiAlas19D * panjangSisiAlas19D) * tinggi19D;
    }

    double hitungLuasPermukaan19D() {
        double luasAlas19D = panjangSisiAlas19D * panjangSisiAlas19D;
        return luasAlas19D + (4 * (0.5 * panjangSisiAlas19D * tinggi19D));
    }
}

class Bola19D {
    double jariJari9D;

    public Bola19D(double jariJari9D) {
        this.jariJari9D = jariJari9D;
    }

    double hitungVolume19D() {
        return (4.0 / 3.0) * Math.PI * jariJari9D * jariJari9D * jariJari9D;
    }

    double hitungLuasPermukaan19D() {
        return 4 * Math.PI * jariJari9D * jariJari9D;
    }
}
