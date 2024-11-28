public class Metodo extends Comida_region{
    private String metodo_Coccion;

    //Constructor vacío y con parámetros
    public Metodo(String nombre, String tipo, String regionOrigen, String metodo_Coccion) {
        super(nombre, tipo, regionOrigen);
        this.metodo_Coccion = metodo_Coccion;
    }

    public Metodo() {

    }

    //Getters y Setters
    public String getMetodo_Coccion() {
        return metodo_Coccion;
    }

    public void setMetodo_Coccion(String metodo_Coccion) {
        this.metodo_Coccion = metodo_Coccion;
    }

    @Override
    public void Datos(){
        System.out.println("---- MÉTODO DE COCCIÓN RECOMENDADO POR LA REGIÓN -----");
        System.out.println(getMetodo_Coccion());
    }
}
