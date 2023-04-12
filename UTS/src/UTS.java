import java.util.Scanner;

public class UTS {
    private long nIM19D;
    private String namaLengkap19D;

    UTS(Long nIM19D, String namaLengkap19D) {
        this.nIM19D = nIM19D;
        this.namaLengkap19D = namaLengkap19D;
    }

    long konversiKeInt19D() {
        return Long.parseLong(namaLengkap19D);
    }

    long penggabungan19D() {
        return Integer.valueOf(String.valueOf(nIM19D) + String.valueOf(konversiKeInt19D()));
    }
}

class arrayGabung19D {
    
}

class utama19D {
    public static void main(String[] args) {
        Long nIM19D = 2241720213;
        Long konversiNama = 132181131314181248114;
        Scanner integer19D = new Scanner(System.in);
        Scanner string19D = new Scanner(System.in);

        System.out.print("Masukkan NIM Anda\t\t: ");
        long isiNIM19D = integer19D.nextLong();
        System.out.print("Masukkan nama lengkap Anda\t: ");
        String isiNama19D = string19D.nextLine();

        UTS rayahan19D = new UTS(isiNIM19D, isiNama19D);

        System.out.println("Penggabungan konversi nama dengan NIM adalah " + rayahan19D.penggabungan19D());

        integer19D.close();
        string19D.close();
    }

}
