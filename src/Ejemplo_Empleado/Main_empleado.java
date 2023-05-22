package Ejemplo_Empleado;
import java.util.*;

public class Main_empleado {
    public static void main(String[] args) {
        /*Empleado empleado1=new Empleado("Manuel",100000 , 2020,  11, 15);
        Empleado empleado2=new Empleado("Joaquin",57000 , 2017,  06, 25);
        Empleado empleado3=new Empleado("Cristiano",70000 , 2019,  03, 19);                 MANERA BASICA DE INGRESAR LOS DATOS E IMPRIMIRLOS
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
        System.out.println("Numbre:" + empleado1.dameNombre()+ " Sueldo: " + empleado1.dameSueldo()+ " Fecha de alta: "+ empleado1.dameFechaContrato());
        System.out.println("Numbre:" + empleado2.dameNombre()+ " Sueldo: " + empleado2.dameSueldo()+ " Fecha de alta: "+ empleado2.dameFechaContrato());
        System.out.println("Numbre:" + empleado3.dameNombre()+ " Sueldo: " + empleado3.dameSueldo()+ " Fecha de alta: "+ empleado3.dameFechaContrato());*/

        Jefatura jefe_RRHH = new Jefatura("Manuel Fernandez", 150000, 2005, 12, 12);
        jefe_RRHH.establece_incentivo(50000);

        Empleado[] misEmpleados=new Empleado[6];        // COMO IMPRIMIR DATOS CON UN ARRAY OPTIMIZADO
        misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 06, 02);
        misEmpleados[2]=new Empleado("Maria Martin", 105000, 2002, 03, 15);
        misEmpleados[3]=new Empleado("Antonio Fernandez");
        misEmpleados[4]=jefe_RRHH;  // (POLIMORFISMO)se pueden almacenar en el array de empleados obj de la clase como de la subclase(herencia) Jefatura 
        misEmpleados[5]=new Jefatura("Rodrigo Peralta", 50000, 1995, 2, 4);
        
        /*for(int i=0; i<3; i++){            ----> ESTE ES CON UN BUCLE FOR TRADICIONAL
            misEmpleados[i].subeSueldo(5);
        }*/

        for(Empleado e: misEmpleados){    // ESTE ES CON FOR EACH (for mejorado para recorrer arrays) 
            e.subeSueldo(5);
        }

        /*for(int i=0; i<3; i++){            ----> ESTE ES CON BUCLE FOR TRADICIONAL
            System.out.println("Numbre: "+ misEmpleados[i].dameNombre() + "Sueldo: "+misEmpleados[i].dameSueldo() + "Fecha de alta: " + misEmpleados[i].dameFechaContrato());
        }*/

        for(Empleado e: misEmpleados){      // ESTE ES CON FOR EACH (for mejorado para recorrer arrays)
            System.out.println("Nombre: "+ e.dameNombre() + " Sueldo: "+e.dameSueldo() + " Fecha de alta: " + e.dameFechaContrato());
        }
    }
}


class Empleado{
    // EL METODO CONSTRUCTOR SIEMPRE LLEVA EL MISMO NOMBRE QUE LA CLASE
    public Empleado(String nom, double sue, int agno, int mes, int dia){   //CONSTRUCTOR   nombre, sueldo, año, mes, día 
        sueldo=sue;
        nombre=nom;
        GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
        altaContrato=calendario.getTime();
        Id=idSiguiente;
        idSiguiente++;
    }

    public Empleado(String nom){//Sobrecarga de constructores(donde se crean varios constructores en la misma clase)

        this(nom,30000,2000,01,01);

    }

    public String dameNombre(){     //GETTER
        return nombre + " ID: " + Id;
    }

    public double dameSueldo(){     //GETTER
        return sueldo;
    }

    public Date dameFechaContrato(){    //GETTER
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {     //GETTER
        double aumento = sueldo*porcentaje/100;
        sueldo+= aumento;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private  int Id; //Para respetar el ENCAPSULAMIENTO (y no se pueda modificar fuera de la clase) se crea id siguiente
    private static int idSiguiente=1;  // Con STATIC se logra que todos los objetos compartan la misma variable, en este caso IdSiguiente
}


class Jefatura extends Empleado {

    public Jefatura(String nom, double sue, int agno, int mes, int dia){ //Constructor recibe estos datos 
        super(nom, sue, agno , mes , dia); // se los envia al constructor de la clase Empleado
    }

    public void establece_incentivo(double b){
        incentivo=b;
    }

    public double dameSueldo(){
        double sueldoJefe=super.dameSueldo(); //usando super.damesueldo() estamos llamando al metodo de la clase padre
        return sueldoJefe+incentivo;
    } 
    private double incentivo;


    


}
