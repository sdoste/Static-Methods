public class DescuentoMovil {
    
    private static double descuento = 20;


    public static void aplicarDescuento(Movil movil){
        movil.setPrecio(movil.getPrecio() - (movil.getPrecio() * (descuento/100)));
    }

    public static void revertirDescuento(Movil movil){
        movil.setPrecio(movil.getPrecioInicial());
    }


    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double descuento) {
        DescuentoMovil.descuento = descuento;
    }
    
}
