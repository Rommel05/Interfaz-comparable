public class Tarea implements Comparable<Tarea>{
    private int prioridad;
    private int tiempo;
    public Tarea (int prioridad, int tiempo) {
        this.prioridad = prioridad;
        this.tiempo = tiempo;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public int getTiempo() {
        return this.tiempo;
    }
    public String toString() {
        return this.getPrioridad() + "," + this.getTiempo();
    }
    @Override
    public int compareTo(Tarea other) {
        if (this.prioridad == other.getPrioridad()) {
            return 0;
        } else if (this.prioridad > other.getPrioridad()) {
            return 1;
        } else {
            return -1;
        }
    }
}