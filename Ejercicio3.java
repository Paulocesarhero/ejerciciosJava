public class Ejercicio3{

    private int num1=2,num2=3;
    public static void main(String[] args){

        Ejercicio3 objEjercicio3 = new Ejercicio3();
        objEjercicio3.suma();
        objEjercicio3.multiplicar();
    }
    public void multiplicar(){
        System.out.println("La multiplicacion es "+(num1*num2));
    }

    public void suma(){
        System.out.println("La suma es "+(num1+num2));
    }
}