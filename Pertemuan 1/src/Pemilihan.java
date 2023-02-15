import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner rayhan19D = new Scanner(System.in);

        System.out.println("=================== Perhitungan Nilai Mahasiswa ===================");
        System.out.print("Nilai Tugas\t: ");
        int nilaiTugasMhs = rayhan19D.nextInt();
        System.out.print("Nilai UTS\t: ");
        int nilaiUTSMhs = rayhan19D.nextInt();
        System.out.print("Nilai UAS\t: ");
        int nilaiUASMhs = rayhan19D.nextInt();

        float totalNilai = ((20 * nilaiTugasMhs) / 100) + ((35 * nilaiUTSMhs) / 100) + ((45 * nilaiUASMhs) / 100);

        System.out.println("================================================");

        if ((nilaiTugasMhs > 0 && nilaiTugasMhs <= 100) && (nilaiUTSMhs > 0 && nilaiUTSMhs <= 100)
                && (nilaiUASMhs > 0 && nilaiUASMhs <= 100)) {
            if (totalNilai > 80 && totalNilai <= 100) {
                System.out.println("Nilai Akhir\t: " + totalNilai);
                System.out.println("Predikat\t: A");
            } else if (totalNilai > 73 && totalNilai <= 80) {
                System.out.println("Nilai Akhir\t: " + totalNilai);
                System.out.println("Predikat\t: B+");
            } else if (totalNilai > 65 && totalNilai <= 73) {
                System.out.println("Nilai Akhir\t: " + totalNilai);
                System.out.println("Predikat\t: B");
            } else if (totalNilai > 60 && totalNilai <= 65) {
                System.out.println("Nilai Akhir\t: " + totalNilai);
                System.out.println("Predikat\t: C+");
            } else if (totalNilai > 50 && totalNilai <= 60) {
                System.out.println("Nilai Akhir\t: " + totalNilai);
                System.out.println("Predikat\t: C");
            } else if (totalNilai > 39 && totalNilai <= 50) {
                System.out.println("Nilai Akhir\t: " + totalNilai);
                System.out.println("Predikat\t: D");
            } else {
                System.out.println("Nilai Akhir\t: " + totalNilai);
                System.out.println("Predikat\t: E");
            }
            System.out.println("================================================");

            if (totalNilai > 50) {
                System.out.println("Selamat, Anda lulus!");
            } else {
                System.out.println("Mohon maaf, Anda belum lulus!");
            }
        } else {
            System.out.println("Nilai yang Anda masukkan salah!");
            System.out.println("Nilai harus lebih dari 0 dan kurang dari 100");
        }

        System.out.println("================================================");

        rayhan19D.close();
    }
}
