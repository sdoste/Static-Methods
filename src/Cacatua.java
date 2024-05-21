public class Cacatua {
    private String name;
    private static int cantidadMinimaCacahuetes = 100;
    
    public Cacatua(String name) {
        this.name = name;
    }

    static public String speak(){
        return "Cacatua cacahuete";
    }

    @Override
    public String toString() {
        return "La Cacatúa se llama " + this.name + ", dice " + speak() + " y lo mínimo para que se calle son " + cantidadMinimaCacahuetes + " cacahuetes.";
    }
}
