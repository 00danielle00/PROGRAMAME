package org.example;

public class YoSoyTu {
    static java.util.Scanner in;
    public static void casoDePrueba() {

        String personaje=in.next().replace(" ", "");
        String parentesco=in.next().replace(" ", "");

        if (personaje.equals("Luke")&&parentesco.equals("padre")){
            System.out.println("TOP SECRET");
        } else if (personaje.equals("Luke")&&parentesco.equals("Padre")) {
            System.out.println(personaje+", yo soy tu "+parentesco);
        } else{
            System.out.println(personaje+", yo soy tu "+parentesco);
        }

    }

    public static void main(String[] args) {

        in = new java.util.Scanner(System.in);

        int numCasos =Integer.parseInt(in.nextLine());
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    } // main
}
