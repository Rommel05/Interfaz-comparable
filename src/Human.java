public class Human implements Comparable<Human>{
    private String nombre;
    private int salario;
    public Human(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.salario;
    }

    @Override
    public int compareTo(Human other) {
        if (this.salario == other.getSalario()) {
            return 0;
        } else if (this.salario > other.getSalario()) {
            return 1;
        } else {
            return -1;
        }
    }
}
