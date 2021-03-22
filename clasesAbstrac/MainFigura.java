public class MainFigura {
    public static void main(String[] args) {
        Triangulo objTri = new Triangulo (5,4);
        Cuadrado objCua = new Cuadrado(6,6);
        System.out.println("Area Triangulo: "+objTri.calcularArea());
        System.out.println("Perimetro del Triangulo: "+objTri.calcularPerimetro());

        System.out.println("Area Cuadrado: "+objCua.calcularArea());
        System.out.println("Perimetro del Cuadrado: "+objCua.calcularPerimetro());
    }
}