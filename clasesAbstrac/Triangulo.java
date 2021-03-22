public class Triangulo extends Figura{
    public Triangulo(double base, double altura){
        super(base,altura);
    }
    public double calcularArea(){
        double area = (getBase()*getAltura())/2;
        return area;
    }
    public double calcularPerimetro(){
        double per = getBase()*3;
        return per;
    }
}