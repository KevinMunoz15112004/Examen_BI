import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, tipo, metodo, region;

        //Creación de objetos
        Comida_tipica comida_tipica = new Comida_tipica();
        Metodo metodo_c = new Metodo();
        Comida_region comida_region = new Comida_region();
        Tiempo_coccion tiempo_coccion = new Tiempo_coccion();

        //Petición de ingreso de datos
        System.out.println("**** SECCIÓN COMIDA ****");
        System.out.println("Ingrese el nombre de la comida: ");
        nombre = sc.nextLine();
        comida_tipica.setNombre(nombre);
        System.out.println("Ingrese el tipo de comida: ");
        tipo = sc.nextLine();
        comida_tipica.setTipo(tipo);
        System.out.println("Ingrese la región de procedencia del plato: ");
        region = sc.nextLine();
        comida_region.setRegionOrigen(region);
        System.out.println("Ingrese el método de cocción que recomienda la región: ");
        metodo = sc.nextLine();
        metodo_c.setMetodo_Coccion(metodo);
        tiempo_coccion.validarTiempo();

        //Mostrar los valores
        comida_tipica.Datos();
        comida_region.Datos();
        metodo_c.Datos();
        tiempo_coccion.Datos();
    }
}