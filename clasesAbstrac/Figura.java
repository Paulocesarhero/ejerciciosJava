public abstract class Figura{
    private double base;
    private double altura;
    public Figura(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract double calcularArea();//metodo abstracto
    public abstract double calcularPerimetro();
}