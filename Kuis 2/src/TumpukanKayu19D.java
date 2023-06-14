public class TumpukanKayu19D {
    private String data19D;
    private TumpukanKayu19D berikutnya19D;
    private TumpukanKayu19D atas19D;

    public TumpukanKayu19D(String data19D) {
        this.data19D = data19D;
        this.berikutnya19D = null;
        this.atas19D = null;
    }

    public void masukkanTumpukan19D(String data19D) {
        TumpukanKayu19D kayu19D = new TumpukanKayu19D(data19D);
        kayu19D.berikutnya19D = atas19D;
        atas19D = kayu19D;
    }

    public String keluarTumpukan19D() {
        if (atas19D == null) {
            return null;
        }
        String data19D = atas19D.data19D;
        atas19D = atas19D.berikutnya19D;
        return data19D;
    }

    public boolean apakahKosong19D() {
        return atas19D == null;
    }
}
