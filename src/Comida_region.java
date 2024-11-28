public class Comida_region extends Comida_tipica {
    private String regionOrigen;

    //Constructor vacío y con parámetros
    public Comida_region(String nombre, String tipo, String regionOrigen) {
        super(nombre, tipo);
        this.regionOrigen = regionOrigen;
    }

    public Comida_region() {

    }

    //Getters y Setters
    public String getRegionOrigen() {
        return regionOrigen;
    }

    public void setRegionOrigen(String regionOrigen) {
        this.regionOrigen = regionOrigen;
    }

    @Override
    public void Datos(){
        System.out.println("------ REGIÓN ORIGEN -----");
        System.out.println(getRegionOrigen());
    }
}
