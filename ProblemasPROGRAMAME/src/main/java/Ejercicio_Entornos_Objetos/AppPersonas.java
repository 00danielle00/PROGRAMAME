package Ejercicio_Entornos_Objetos;

public class AppPersonas {
    public static void main(String[] args) {
        PersonaNoSaludable pepe = new PersonaNoSaludable(24,80,"PEPE");
        PersonaSaludable pepa = new PersonaSaludable(34,60,"PEPA");
        System.out.println(pepe);
        System.out.println(pepa);
        System.out.println();
        pepe.bebida();
        pepe.alimentacion();
        pepe.ejercicio();
        System.out.println();
        pepa.bebida();
        pepa.alimentacion();
        pepa.despertarse();
        pepa.ejercicio();
    }
}
