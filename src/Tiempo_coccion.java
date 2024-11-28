import java.util.InputMismatchException;
import java.util.Scanner;

public class Tiempo_coccion extends Metodo {
    Scanner sc = new Scanner(System.in);
    private double tiempo;
    boolean continar;

    //Constructor vacío y con parámetros
    public Tiempo_coccion(String nombre, String tipo, String regionOrigen, String metodo_Coccion, double tiempo) {
        super(nombre, tipo, regionOrigen, metodo_Coccion);
        this.tiempo = tiempo;
    }

    public Tiempo_coccion() {

    }

    //Getters y Setters
    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public void Datos(){
        System.out.println("----- TIEMPO ESTIMADO DE COCCIÓN -----");
        System.out.println(getTiempo()+ " Min.");
    }

    public void validarTiempo(){
        do {
            continar = true;
            try {
                System.out.println("Ingrese el tiempo recomendado de cocción (En minutos): ");
                tiempo = sc.nextDouble();

                if (tiempo < 0){
                    System.out.println("Ingrese un tiempo válido ");
                    continar = false;
                }
                else {
                    this.setTiempo(tiempo);
                }
            }
            catch(InputMismatchException e){
                System.out.println("-------------- TIEMPO NO VÁLIDO --------------");
                sc.nextLine();
                continar = false;
            }
        }while(!continar);
    }
}
