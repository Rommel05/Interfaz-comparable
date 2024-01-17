public class Regalos implements Comparable<Regalos>{
    private int comportamiento;
    private int peso;
    public Regalos (int comportamiento, int peso) {
        this.comportamiento = comportamiento;
        this.peso = peso;
    }

    public int getComportamiento() {
        return this.comportamiento;
    }

    public int getPeso() {
        return this.peso;
    }
    public String toString() {
        return getComportamiento() + "-" + getPeso();
    }
    public int compareTo(Regalos other) {
        if (this.comportamiento == other.getComportamiento()) {
            return this.peso - other.getPeso();
        } else {
            return other.getComportamiento() - this.comportamiento;
        }
    }
}
