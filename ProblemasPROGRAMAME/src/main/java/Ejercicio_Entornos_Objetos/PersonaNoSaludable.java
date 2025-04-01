package Ejercicio_Entornos_Objetos;

import java.time.LocalDateTime;

public class PersonaNoSaludable extends Persona{
    private int colesterol;

    public PersonaNoSaludable(int edad, float peso, String nombre) {
        super(edad, peso, nombre);
        colesterol=100;
    }

    public void LlegarTarde(LocalDateTime hora){

    }

    @Override
    public void ejercicio() {
        System.out.println(nombre+" haciendo ejercicio");
    }

    @Override
    public void alimentacion() {
        System.out.println(nombre+" alimentandose");
    }

    @Override
    public void bebida() {
        System.out.println(nombre+" bebiendo");
    }

    @Override
    public String toString() {
        return "PersonaNoSaludable{" +
                "colesterol=" + colesterol +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", peso='" + getPeso()+
                '}';
    }
}
