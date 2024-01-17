public class Tesoro implements Comparable<Tesoro>{
    private String nombre;
    private int valor;
    private int peso;
    public Tesoro(String nombre, int valor, int peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getValor() {
        return this.valor;
    }

    public int getPeso() {
        return this.peso;
    }
    public String toString() {
        return getNombre();
    }
    @Override
    public int compareTo(Tesoro other) {
        if(this.valor == other.getValor()) {
            return this.peso - other.getPeso();
        } else {
            return other.getValor() - this.valor;
        }
    }
}
