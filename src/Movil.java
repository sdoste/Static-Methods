public class Movil {
    private double precio;
    private String marca;
    private String modelo;
    private final double precioInicial;

    public Movil(double precio, double precioInicial, String marca, String modelo) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.precioInicial = precioInicial;
    }


    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioInicial() {
        return precioInicial;
    }

}
