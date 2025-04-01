package Ejemplo;

public class Moto extends Vehiculo{

    private int ruedasMoto;

    public Moto(String motor, int cilindeadas, int caballos, int ruedasMoto) {
        super(motor, cilindeadas, caballos);
        this.ruedasMoto=ruedasMoto;
    }

    public void LimpiezaMoto(){
        System.out.println("Limpiando moto....");
    }

    @Override
    public void encender() {
        System.out.println("Moto endenciendo...");
    }
    
}
