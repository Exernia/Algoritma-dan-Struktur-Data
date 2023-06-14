public class AntreanTruk19D {
    private String data19D;
    private AntreanTruk19D sebelumnya19D, berikutnya19D;
    private AntreanTruk19D kepala19D, ekor19D;

    public AntreanTruk19D(String data19D) {
        this.data19D = data19D;
        this.sebelumnya19D = null;
        this.berikutnya19D = null;
    }

    public void masukkanAntrean19D(String data19D) {
        AntreanTruk19D masukTruk19D = new AntreanTruk19D(data19D);
        if (ekor19D == null) {
            kepala19D = ekor19D = masukTruk19D;
        } else {
            ekor19D.berikutnya19D = masukTruk19D;
            masukTruk19D.sebelumnya19D = ekor19D;
            ekor19D = masukTruk19D;
        }
    }

    public String keluarAntrian19D() {
        if (kepala19D == null) {
            return null;
        }
        String data = kepala19D.data19D;
        if (kepala19D == ekor19D) {
            kepala19D = ekor19D = null;
        } else {
            kepala19D = kepala19D.berikutnya19D;
            kepala19D.sebelumnya19D = null;
        }
        return data;
    }

    public boolean apakahKosong19D() {
        return kepala19D == null;
    }
}