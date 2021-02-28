import java.util.Scanner;

public class Vocales {
    String cadena="";

    public static void main(String[] arg) {
        Vocales objeto= new Vocales();
        objeto.leerCadena();
        System.out.println(objeto.cuentaVocales());
    }

    public void leerCadena() {
        Scanner objLeer = new Scanner(System.in);
        System.out.println("Cualquier texto");
        cadena = objLeer.nextLine();
    }

    public String cuentaVocales() {
        int a=0, e=0, i=0, o=0, u=0;
        String resultado;
        for (int j = 0; j<cadena.length(); j++) {
            if (cadena.charAt(j)=='a' || cadena.charAt(j)=='A'){
                a++;
            }
            if (cadena.charAt(j)=='e' || cadena.charAt(j)=='E'){
                e++;
            }
            if (cadena.charAt(j)=='i' || cadena.charAt(j)=='I'){
                i++;
            }
            if (cadena.charAt(j)=='o' || cadena.charAt(j)=='O'){
                o++;
            }
            if (cadena.charAt(j)=='u' || cadena.charAt(j)=='U'){
                u++;
            }
        }
        resultado = ("a = "+a+" e= "+e+" i= "+i+" o = "+o+" u= "+u);
        return resultado;

    }
}