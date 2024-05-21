import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // 1- (fácil) Entrenamiento (opcional)
        // Tu amiga cacatúa está de vuelta!
        // Tienes la clase Cacatua con un método static que cuando le llamas dice "Cacatúa cacahuete!".
        // También tiene una variable estatica: cantidadMinimaCacahuetes = 100;
        // Mostrar en un system.out lo siguiente: " la cacatúa se llama X (su nombre), dice 'Cacatúa cacahuete!' y lo mínimo para que se calle son 100 cacahuetes "
        Cacatua cacatua1 = new Cacatua("Pepita");
        Cacatua cacatua2 = new Cacatua("Robustiana");
        System.out.println(cacatua1.toString());
        System.out.println(cacatua2.toString());

        // 2- (medio) Llega Black Friday en tu tienda online de teléfonos móviles y decides ofrecer un 20% de descuento en todos tus productos.
        // Instancia algunos móviles para probar.
        // El descuento se aplica en todos, (static) así que debes poder mostrar el precio antiguo y el precio con descuento.
        // +EXTRA: posibilidad de anular el descuento a todos los productos después del Black Friday, mediante método a tal propósito
        ArrayList<Movil> moviles = new ArrayList<>();

        moviles.add(new Movil(699.99, 699.99, "Apple", "iPhone 12"));
        moviles.add(new Movil(799.99, 799.99, "Samsung", "Galaxy S21"));
        moviles.add(new Movil(499.99, 499.99, "Google", "Pixel 5"));
        moviles.add(new Movil(299.99, 299.99, "OnePlus", "Nord N10"));
        moviles.add(new Movil(399.99, 399.99, "Xiaomi", "Mi 11 Lite"));
        moviles.add(new Movil(599.99, 599.99, "Sony", "Xperia 5 II"));
        moviles.add(new Movil(899.99, 899.99, "Apple", "iPhone 12 Pro"));
        moviles.add(new Movil(999.99, 999.99, "Samsung", "Galaxy S21 Ultra"));
        moviles.add(new Movil(549.99, 549.99, "Google", "Pixel 5a"));
        moviles.add(new Movil(349.99, 349.99,"OnePlus", "Nord N200"));
        
        for (Movil movil : moviles){
            System.out.println("El precio del móvil " + movil.getModelo() + " sin descuento es de " + movil.getPrecio() + " euros.");
            DescuentoMovil.aplicarDescuento(movil);
            System.out.println("El precio del móvil " + movil.getModelo() + " con descuento es de " + movil.getPrecio() + " euros.");
        }

        for (Movil movil : moviles){
            DescuentoMovil.revertirDescuento(movil);
            System.out.println("Pasado Black Friday, el precio del móvil " + movil.getModelo() + " vuelve a " + movil.getPrecio() + " euros.");
        }

    }
}
