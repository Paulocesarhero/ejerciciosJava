public class Figura {
    private double base;
    private double altura;
    //setters

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    //getters

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    //constructor
    public Figura(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    //metodo
    public double calcularArea(){
        System.out.println("clase Figura");
        return 0;
    }
}