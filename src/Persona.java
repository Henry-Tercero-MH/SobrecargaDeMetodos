public class Persona {
    /**
     * Atributos de la clase
     */
    private String nombre;
    private String apellido;
    private int edad;

    /**Sbrecarga de metodos
     * Metodo constructor simple
     */
    //Ejemplo 1
    public Persona(){

    }

    /**
     * Metodo constructor con parametros
     */
    //Ejemplo 2
    //tenemos un metodo contructor con el nombre Persona el cual recibira por parametros  nombre y edad
    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    //tenemos otro metodo contructor con el mismo nombre del anterior pero con la diferencia del parametro
    //que este recibira, a eso se le llama sobrecarga de metodos
    public  Persona(String apellido) {
        this.apellido=apellido;
    }
//Ejemplo 3

    public void leerPersona() {
        System.out.println("Nombre: "+nombre+" Edad: "+edad);

    }

    public void leerPersona(String carnet){
        System.out.println("Carnet: "+carnet);
    }
}



