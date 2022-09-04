public class Test {
    public static void main(String[] args) {
        /**
         * Crearemos un objeto de la clase Persona
         * Invocaremos a los metodos creados en la clase Persona
         */
        //usamos los metodos creados con los mismos nombres pero con diferentes parametros
        Persona nuevaPersona= new Persona("Henry",30);
        nuevaPersona.leerPersona();
        System.out.println("....................................................");
        String nombre="Henry";
        int edad=30;
        String carnet="7690-20-1040";
        nuevaPersona.leerPersona(carnet);


    }
}
