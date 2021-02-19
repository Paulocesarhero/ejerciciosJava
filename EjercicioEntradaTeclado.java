import java.util.Scanner;
public class EjercicioEntradaTeclado {
     String nombre ;
     int anioNacimiento;
     String  estadoCivil;
      int Edad;

    public static void main(String [] arg){
        EjercicioEntradaTeclado objeto = new EjercicioEntradaTeclado();
        objeto.obtenerDatos();
        objeto.calcularEdad();
        objeto.imprimir();
    }
    public void obtenerDatos(){
        Scanner objLeer= new Scanner(System.in);
        System.out.println("Escribe un nombre: ");
        nombre = objLeer.nextLine();
        System.out.println("Escribe estado civil: ");
        estadoCivil = objLeer.nextLine();
        System.out.println("Escribe anio de nacimiento: ");
        anioNacimiento = objLeer.nextInt();
    }
    public void calcularEdad(){
        Edad=( 2021-anioNacimiento);

    }
    public void imprimir(){

        System.out.println("nombre: "+nombre);
        System.out.println("anio de nacimiento: "+anioNacimiento);
        System.out.println("Estado civil: "+estadoCivil);
        System.out.println("edad: "+Edad);

    }
}