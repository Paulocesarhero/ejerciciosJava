Epublic class Persona {
   private String nombre,apellido;
    private int edad;
    private char sexo;
    //setters


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //getters
    public char getSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }


    public Persona(){

    }
    public Persona(String nombre,String apellido,int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.sexo = sexo;
    }
   public void ImprimirDatos(){
       System.out.println("Nombre = "+getNombre());
       System.out.println("Apellido = "+getApellido());
       System.out.println("Sexo = "+getSexo());
       System.out.println("Edad = "+getEdad());
   }
}