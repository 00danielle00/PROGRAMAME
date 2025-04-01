package Ejemplo;

public abstract class Vehiculo {
    private String motor;
    private int cilindeadas;
    private int caballos;

    public Vehiculo(String motor, int cilindeadas, int caballos) {
        this.motor = motor;
        this.cilindeadas = cilindeadas;
        this.caballos = caballos;
    }

    public abstract void encender();

}
