public class Member implements Comparable<Member>{
    private String pais;
    private int cantidad;

    public Member (String pais, int cantidad) {
        this.pais = pais;
        this.cantidad = cantidad;
    }

    public String getPais() {
        return this.pais;
    }

    public int getCantidad() {
        return this.cantidad;
    }
    @Override
    public String toString() {
        return pais + "-" + cantidad;
    }
    @Override
    public int compareTo(Member other) {
        if(this.cantidad == other.getCantidad()) {
            return 0;
        } else if (this.cantidad > other.getCantidad()) {
            return 1;
        } else {
            return -1;
        }
    }
}
