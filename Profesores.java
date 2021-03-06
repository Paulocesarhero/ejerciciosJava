public class Profesores {
    private String programa, nombre;
    private String  numPersonal;
    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public void setNumPersonal(String  numPersonal) {
        this.numPersonal = numPersonal;
    }
    //getters

    public String getPrograma() {
        return programa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumPersonal() {
        return numPersonal;
    }
    //constructores
    public Profesores(){

    }
    public Profesores(String nombre,String programa,String  numPersonal){
        this.nombre=nombre;
        this.programa=programa;
        this.numPersonal=numPersonal;
    }
    //metodods
    public void imprimirDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Numero Personal: "+getNumPersonal());
        System.out.println("Programa: "+getPrograma());
    }
}