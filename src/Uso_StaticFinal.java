

public class Uso_StaticFinal {
    public static void main(String[] args) {
        
        Empleados trabajador1=new Empleados("Paco");
        Empleados trabajador2=new Empleados("Ana");
        Empleados trabajador3=new Empleados("Antonio");
        Empleados trabajador4=new Empleados("Pepe");

        trabajador1.cambiaSeccion("RRHH");


        System.out.println(trabajador1.devuelveDatos()+"\n" + trabajador2.devuelveDatos()+"\n" +
                            trabajador3.devuelveDatos()+"\n" +trabajador4.devuelveDatos()+"\n" );

                            System.out.println(Empleados.dameIdSiguiente());
    }
}

class Empleados{    // esta clase deberia estar en su propio archivo clase 

    public Empleados(String nom){ // CONSTRUCTOR

        nombre=nom;
        seccion="Administracion";
        Id = idSiguiente;
        idSiguiente++;     
    }

    public void cambiaSeccion(String seccion){ //SETTER

        this.seccion=seccion;

    }  



    public String devuelveDatos(){  //GETTER
        return "El nombre es: " + nombre + " y la seccion es "+ seccion+" y el ID es = " + Id;
    }

    
    public static String dameIdSiguiente(){

        return "El ID siguinte es " + idSiguiente;
    }



    private final String nombre; //Final no deja que se cambie el valor de la variable en la ejecucion del programa

    private String seccion;

    private  int Id; //Para respetar el ENCAPSULAMIENTO (y no se pueda modificar fuera de la clase) se crea id siguiente

    private static int idSiguiente=1;  // Con STATIC se logra que todos los objetos compartan la misma variable, en este caso IdSiguiente

}