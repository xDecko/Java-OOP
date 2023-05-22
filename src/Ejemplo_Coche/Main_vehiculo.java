package Ejemplo_Coche;

public class Main_vehiculo {
    public static void main(String[] args) {


        Coche kia=new Coche();
        kia.establece_color("Rojo");

        Furgoneta Furgoneta_mercedes=new Furgoneta(7, 580);

        Furgoneta_mercedes.establece_color("Gris");
        Furgoneta_mercedes.configura_asientos("si");
        Furgoneta_mercedes.configura_climatizador("si");

        System.out.println(kia.dime_datos_generales()+ kia.dime_color());
        System.out.println(Furgoneta_mercedes.dime_datos_generales()+Furgoneta_mercedes.dimeDatosFurgoneta());



 /*     Coche Kia=new Coche();              //Output para la clase coche 

        Kia.establece_color(JOptionPane.showInputDialog("Introduce color"));

        System.out.println(Kia.dime_color());
        System.out.println(Kia.dime_datos_generales());

        Kia.configura_asientos(JOptionPane.showInputDialog("Tienes asientos de cuero?"));

        System.out.println(Kia.dime_asientos());
        Kia.configura_climatizador((JOptionPane.showInputDialog("Tiene climatizador?")));
        System.out.println(Kia.dime_climatizador());
        System.out.println(Kia.dime_peso_coche());
        System.out.println("El precio final del coche es: " + Kia.precio_coche()+ " USD"); */

    }
}
