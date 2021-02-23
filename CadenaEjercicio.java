import java.util.Scanner;
public class CadenaEjercicio {
     String nombre = "";
     String apellido = "";
     String direccion = "";
     String  telefono = "";
    public static void main(String[] args){
        CadenaEjercicio objeto = new CadenaEjercicio();
        objeto.leerDatosTeclado();
        System.out.println("Tu nombre es: ");
        System.out.println(objeto.nombre);
        System.out.println("Tu apellido es: ");
        System.out.println(objeto.apellido);
        System.out.println("Tu direccion es: ");
        System.out.println(objeto.direccion);
        System.out.println("Tu telefono es: ");
        System.out.println(objeto.telefono);


    }
    public void leerDatosTeclado(){
        Scanner objLeer= new Scanner(System.in);
        System.out.println("Escribe un nombre: ");
        nombre = objLeer.nextLine();
        System.out.println("Escribe estado apellido: ");
        apellido = objLeer.nextLine();
        System.out.println("Escribe direccion: ");
        direccion = objLeer.nextLine();
        System.out.println("Escribe telefono: ");
        telefono = objLeer.nextLine();

    }
}