public class Localidad implements Comparable<Localidad>{
    private int dineroInvertido;
    private int premio;
    public Localidad(int dineroInvertido, int premio) {
        this.dineroInvertido = dineroInvertido;
        this.premio = premio;
    }
    public int getdineroInvertido() {
        return this.dineroInvertido;
    }
    public int getPremio() {
        return this.premio;
    }
    public String toString() {
        return this.getPremio() + "-" + this.getdineroInvertido();
    }
    @Override
    public int compareTo(Localidad other) {
        if (this.premio == other.getPremio()) {
            return 0;
        } else if (this.premio > other.getPremio()) {
            return 1;
        } else {
            return -1;
        }
    }
}

