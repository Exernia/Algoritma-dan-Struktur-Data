public class ArrayBalok19D {
    public static void main(String[] args) {
        Balok19D[] blArray19D = new Balok19D[3];
        blArray19D[0] = new Balok19D(100, 30, 12);
        blArray19D[1] = new Balok19D(120, 40, 15);
        blArray19D[2] = new Balok19D(210, 50, 25);

        Balok19D[] balokArray19D = new Balok19D[3];
        balokArray19D[0] = new Balok19D();
        balokArray19D[1] = new Balok19D();
        balokArray19D[2] = new Balok19D();

        Segitiga19D[] sgArray19D = new Segitiga19D[4];
        sgArray19D[0] = new Segitiga19D(10, 4);
        sgArray19D[1] = new Segitiga19D(20, 10);
        sgArray19D[2] = new Segitiga19D(15, 6);
        sgArray19D[3] = new Segitiga19D(25, 10);

        for (int i = 0; i < blArray19D.length; i++) {
            System.out.printf("Volume balok ke-%d: %d\n", (i + 1), blArray19D[i].hitungVolume19D());
        }

        System.out.println();

        for (int i = 0; i < sgArray19D.length; i++) {
            System.out.printf("Luas segitiga ke-%d\t: %d\n", (i + 1), sgArray19D[i].hitungLuas19D());
            System.out.printf("Keliling segitiga ke-%d\t: %d\n", (i + 1), sgArray19D[i].hitungKeliling19D());
        }
    }
}

class Balok19D {
    public int panjang, lebar, tinggi;

    public Balok19D(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public Balok19D() {

    }

    public int hitungVolume19D() {
        return panjang * lebar * tinggi;
    }
}

class Segitiga19D {
    public int alas, tinggi;

    Segitiga19D(int alas, int tinggi) {
        this.tinggi = tinggi;
        this.alas = alas;
    }

    int hitungLuas19D() {
        return (alas * tinggi) / 2;
    }

    int hitungKeliling19D() {
        return alas + tinggi + (int) Math.sqrt((alas * alas) + (tinggi * tinggi));
    }
}