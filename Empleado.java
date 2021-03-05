
public class Empleado extends Persona{
    private int salarioDiario, diasTrabajos;
    //setters

    public void setDiasTrabajos(int diasTrabajos) {
        this.diasTrabajos = diasTrabajos;
    }

    public void setSalarioDiario(int salarioDiario) {
        this.salarioDiario = salarioDiario;
    }
    //getters

    public int getDiasTrabajos() {
        return diasTrabajos;
    }

    public int getSalarioDiario() {
        return salarioDiario;
    }
    //constructores
    public Empleado(String nombre,String apellido,int edad,char sexo, int salarioDiario, int diasTrabajos){
        super(nombre,apellido,edad,sexo);
        this.salarioDiario = salarioDiario;
        this.diasTrabajos = diasTrabajos;
    }
    public  Empleado(int salarioDiario, int diasTrabajos){
        this.salarioDiario=salarioDiario;
        this.diasTrabajos=diasTrabajos;
    }
    //metodos
    public int salarioTotal(){
        return getDiasTrabajos()*getSalarioDiario();
    }
    public static void main(String [] arg){
        Empleado objEmp = new Empleado("Paulo","Hernandez",18,'M',1200,5);
        objEmp.ImprimirDatos();
        System.out.println("Salario Total = "+objEmp.salarioTotal());
    }
}