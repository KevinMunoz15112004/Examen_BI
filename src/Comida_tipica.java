public class Comida_tipica {
    private String nombre;
    private String tipo;

    //Constructor vacío y con parámetros
    public Comida_tipica(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Comida_tipica() {

    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void Datos(){
        System.out.println("------------------------------------------");
        System.out.println("               DETALLES            ");
        System.out.println("------------------------------------------");
        System.out.println("Nombre del plato: "+getNombre());
        System.out.println("Tipo del plato: "+getTipo());
    }
}
