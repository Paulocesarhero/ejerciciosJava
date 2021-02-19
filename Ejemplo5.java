public class Ejemplo5 {
    public static void main(){
        metodo1();
    }
    public static void metodo1(){
        int k;//variables locales
        System.out.println(k);
        for (int i = 0; i < 10; i++) {
            int j = 5;
            System.out.println(j);//varaible local de este bloque
        }
        System.out.println(j);//esto marcaria error
    }
    public static void metodo2(){
        System.out.println(k);//estto maracaria un error
    }
}