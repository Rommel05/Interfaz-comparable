public class Member {
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
}
