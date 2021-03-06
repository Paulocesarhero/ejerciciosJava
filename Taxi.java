public class Taxi extends Vehiculo{
    private int numTaxi;
    private float precioPerMin,tiempoDeRecorrido;
    //setters

    public void setTiempoDeRecorrido(float tiempoDeRecorrido) {
        this.tiempoDeRecorrido = tiempoDeRecorrido;
    }

    public void setNumTaxi(int numTaxi) {
        this.numTaxi = numTaxi;
    }

    public void setPrecioPerMin(float precioPerMin) {
        this.precioPerMin = precioPerMin;
    }
    //getters

    public float getPrecioPerMin() {
        return precioPerMin;
    }

    public float getTiempoDeRecorrido() {
        return tiempoDeRecorrido;
    }

    public int getNumTaxi() {
        return numTaxi;
    }

    //constructores
    public Taxi(){}
    public Taxi (String placas,String modelo,String motor,String color,String descripcion,int numTaxi,float precioPerMin,float tiempoDeRecorrido){
        super(placas,modelo,motor,color,descripcion);
        this.numTaxi=numTaxi;
        this.precioPerMin=precioPerMin;
        this.tiempoDeRecorrido=tiempoDeRecorrido;
    }
    public Taxi(int numTaxi,float precioPerMin,float tiempoDeRecorrido){
        this.numTaxi=numTaxi;
        this.precioPerMin=precioPerMin;
        this.tiempoDeRecorrido=tiempoDeRecorrido;
    }
    //metodos
    public float calcularsueldo(){
        return getPrecioPerMin()*getTiempoDeRecorrido();
    }
    public static void main(String [] arg){
        Taxi objTaxi = new Taxi("21090","tsuru","v108","Negro","Coche bonito",202,10,4600);
        objTaxi.imprimirDatos();
        System.out.println("El sueldo es de : "+objTaxi.calcularsueldo());
    }
}