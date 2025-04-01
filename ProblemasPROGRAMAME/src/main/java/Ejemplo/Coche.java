package Ejemplo;

public class Coche extends Vehiculo{

    public Coche(String motor, int cilindeadas, int caballos) {
        super(motor, cilindeadas, caballos);
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo coche....brumbrum");
    }

    public void LimpiezaCoche(){
        System.out.println("Limpiando el coche");
    }
}
