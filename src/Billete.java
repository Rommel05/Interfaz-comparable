public class Billete  {
    private int dineroInvertido;
    private int premio;
    public Billete (int dineroInvertido, int premio) {
        this.dineroInvertido = dineroInvertido;
        this.premio = premio;
    }

    public int getDineroInvertido() {
        return this.dineroInvertido;
    }
    public int getPremio() {
        return this.premio;
    }
    public String toString() {
        return getDineroInvertido() + "-" + getPremio();
    }
}
