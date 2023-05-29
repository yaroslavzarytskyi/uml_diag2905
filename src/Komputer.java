public class Komputer {
    private int numer;
    private Boolean czyDziala;

    public Komputer(int numer, Boolean czyDziala) {
        this.numer = numer;
        this.czyDziala = czyDziala;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public boolean isCzyDziala() {
        return czyDziala;
    }

    public void setCzyDziala(boolean czyDziala) {
        this.czyDziala = czyDziala;
    }
}
