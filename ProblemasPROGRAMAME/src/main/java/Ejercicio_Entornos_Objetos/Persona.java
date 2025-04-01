package Ejercicio_Entornos_Objetos;

public abstract class Persona implements Habitos {
    public static int estimacionVida=85;
    protected int edad;
    private float peso;
    public String nombre;

    public Persona(int edad, float peso, String nombre) {
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;
    }

    public void despertarse(){
        System.out.println(nombre+"se está despertando");
    }
    private void dormirse(){
        System.out.println(nombre+"se está durmiendo");

    }

    public static int getEstimacionVida() {
        return estimacionVida;
    }

    public int getEdad() {
        return edad;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", peso=" + peso +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
