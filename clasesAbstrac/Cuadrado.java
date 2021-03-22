public class Cuadrado extends Figura{
    public Cuadrado(double base,double altura){
        super(base,altura);
    }
    public double calcularArea(){
        double area = (getBase()*getBase());
        return area;
    }
    public double calcularPerimetro(){
        double per = getBase()*4;
        return per;
    }
}