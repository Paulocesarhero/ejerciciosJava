import java.util.Scanner;
public class Fecha {
    String fechaDeUsuario,mesSt, anio;
    int posicionDeSlash;
    int dia, mes;
    public static void main(String [] arg){
        Fecha objeto = new Fecha();
        objeto.obtenerFecha();
        System.out.println(objeto.converteFecha());

    }
    public void obtenerFecha () {
        Scanner objLeer= new Scanner(System.in);
        System.out.println("Escribe una fecha en formato\n" +
                "dd/mm/aa ");
        fechaDeUsuario = objLeer.nextLine();
    }
    public String converteFecha(){
        String reslutado;
            posicionDeSlash = fechaDeUsuario.indexOf((int) '/');//encontramos el /
            dia = Integer.parseInt(fechaDeUsuario.substring(0,posicionDeSlash));//separamos el dia y ademas lo convertimos a entero
            fechaDeUsuario = fechaDeUsuario.substring((posicionDeSlash+1),fechaDeUsuario.length());//eliminamos el dia de la fecha que nos dio el usuario
            mes = Integer.parseInt(fechaDeUsuario.substring(0,posicionDeSlash));//separamos el mes del anio ademas lo convertimos a entero
            fechaDeUsuario = fechaDeUsuario.substring((posicionDeSlash+1),fechaDeUsuario.length());//eliminamos el mes de la decha del usuario
            anio = fechaDeUsuario;//finalmente asignanamos lo que nos queda de la cadena al anio
            //convertimos los meses
        switch (mes){
            case 1:
                mesSt="enero";
                break;
            case 2:
                mesSt="febrero";
                break;
            case 3:
                mesSt="marzo";
                break;
            case 4:
                mesSt="abril";
                break;
            case 5:
                mesSt="mayo";
                break;
            case 6:
                mesSt="junio";
                break;
            case 7:
                mesSt="julio";
                break;
            case 8:
                mesSt="agosto";
                break;
            case 9:
                mesSt="septiembre";
                break;
            case 10:
                mesSt="octubre";
                break;
            case 11:
                mesSt="noviembre";
                break;
            case 12:
                mesSt="diciembre";
                break;
        };
        reslutado = (dia+" "+mesSt+" de "+" 20"+anio);
        return reslutado;
    }
}