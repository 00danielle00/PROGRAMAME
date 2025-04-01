package Ejemplo;

public class AppVehiculos {
    public static void main(String[] args) {
        Moto kawasaki = new Moto("kago", 200,2500,4);
        Coche rayo = new Coche("kriko",300,3400);

        kawasaki.encender();
        kawasaki.LimpiezaMoto();
        System.out.println();
        rayo.encender();
        rayo.LimpiezaCoche();
    }
}
