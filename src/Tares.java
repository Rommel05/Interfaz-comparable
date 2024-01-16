public class Tares implements Comparable<Tares>{
    private int prioridad;
    private int tiempo;
    public Tares (int prioridad, int tiemno) {
        this.prioridad = prioridad;
        this.tiempo = tiempo;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public int getTiempo() {
        return this.tiempo;
    }
    @Override
    public String toString() {
        return tiempo + "," + prioridad;
    }
    @Override
    public int compareTo(Tares other) {
        if (this.prioridad == other.getPrioridad()) {
            return 0;
        } else if (this.prioridad > other.getPrioridad()) {
            return 1;
        } else {
            return -1;
        }
    }
}
