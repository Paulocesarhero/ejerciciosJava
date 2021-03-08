import java.util.ArrayList;
public class MainFigura {
    public static void main (String []arg){
        //creando polimorfidmo
        Figura objFigura;
        objFigura = new  Triangulo(5.0,8.0);
        System.out.println("Tiangulo "+objFigura.calcularArea());

        objFigura = new  Rectangulo(5.0,8.0);
        System.out.println("Rectangulo "+objFigura.calcularArea());

        ///
        ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
        Triangulo objTriangulo = new Triangulo(6.0,3.0);
        Rectangulo objRectangulo = new Rectangulo(8.0,4.0);

        listaFiguras.add(objTriangulo);
        listaFiguras.add(objRectangulo);
        for (Figura fig:listaFiguras) {
            if (fig instanceof Triangulo) {
                System.out.println("Area del triangulo es "+fig.calcularArea());

            }else
                System.out.println("Area del rectangulo "+ fig.calcularArea());

        }
    }
}