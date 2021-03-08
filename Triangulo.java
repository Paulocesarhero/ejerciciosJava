public class Triangulo extends Figura{
    //constructor
    public Triangulo(double base,double altura){
        super(base,altura);
    }
    //metodo
    public double calcularArea(){
        return (getBase()*getAltura())/2;
    }

}