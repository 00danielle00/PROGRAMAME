package Ejercicio_Entornos_Objetos;

import java.time.LocalDateTime;

public class PersonaSaludable extends Persona{
    private int resistencia;

    public PersonaSaludable(int edad, float peso, String nombre) {
        super(edad, peso, nombre);
        resistencia=100;
    }

    public boolean madrugar(LocalDateTime hora){
        int dia= hora.getHour();
        System.out.println("Madrugando a las: "+dia);
        return true;
    }

    @Override
    public void ejercicio() {

        System.out.println(nombre+" esta haciendo Ejercicio");
    }

    @Override
    public void alimentacion() {
        System.out.println(nombre+" se está alimentando");
    }

    @Override
    public void bebida() {
        System.out.println(nombre+" esta bebiendo");
    }
}
