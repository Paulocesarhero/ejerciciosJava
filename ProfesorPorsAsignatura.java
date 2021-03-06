public class ProfesorPorsAsignatura extends Profesores{
    int horasTrabajadas;
    double precioPorHora;
    //setters

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
    //getters

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    //constructore
    public ProfesorPorsAsignatura(){}
    public  ProfesorPorsAsignatura(String nombre,String programa,String  numPersonal,int horasTrabajadas,double precioPorHora){
        super(nombre,programa,numPersonal);
        this.horasTrabajadas=horasTrabajadas;
        this.precioPorHora=precioPorHora;
    }
    //metodos
    public double clacularSueldo(){
        return getHorasTrabajadas()*getPrecioPorHora();
    }
    public static void main(String [] arg){
        ProfesorPorsAsignatura objProfAsig= new ProfesorPorsAsignatura("Paulo","IA","2282522839",8,5500.05);
        objProfAsig.imprimirDatos();
        System.out.println("Suledon "+objProfAsig.clacularSueldo());
    }
}