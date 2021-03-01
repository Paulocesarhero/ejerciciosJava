import java.util.ArrayList;
public class Empleado {
    String nombre;
    int salarioDiario, diasTrabajos;
    public Empleado(){

    }
    public  Empleado(String nombre,int salarioDiario, int diasTrabajos){
        this.nombre=nombre;
        this.salarioDiario=salarioDiario;
        this.diasTrabajos=diasTrabajos;
    }
    public static void main(String [] arg){
        ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();
        Empleado obj1 = new Empleado("Paulo",100,6);
        Empleado obj2 = new Empleado("Regina",300,2);
        Empleado obj3 = new Empleado("Maria",200,4);
        listaEmpleado.add(obj1);
        listaEmpleado.add(obj2);
        listaEmpleado.add(obj3);
        for (Empleado objEmpleado: listaEmpleado){
            System.out.println(objEmpleado.nombre);
            System.out.println(objEmpleado.salarioDiario);
            System.out.println(objEmpleado.diasTrabajos);
            System.out.println(objEmpleado.salarioTotal(objEmpleado.salarioDiario,objEmpleado.diasTrabajos));
        }

    }
    public int salarioTotal(int salarioDiarioA,int diasTrabajosA){
        if (diasTrabajosA>5){
            return salarioDiarioA*diasTrabajosA*2;
        }else return salarioDiarioA*diasTrabajosA;
    }
}