package org.example;

public class Ventas {
    static java.util.Scanner in;
    public static String[] diasSemana={"MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};

    public static boolean casoDePrueba() {
        float dato = in.nextFloat();
        if (dato == -1) {
            return false;
        } else {
            float dineroSemana[] = pedirDato(dato);
            String diasConMasVentas=diasMasVentas(dineroSemana);
            String diaConMenosVentas=diasMenosVentas(dineroSemana);
            System.out.println(diasConMasVentas+" "+diaConMenosVentas+" SI");
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
    public static float[] pedirDato(float dato){
        float[] diasSemana= new float[6];

        diasSemana[0] = dato;

        for (int i = 1; i < diasSemana.length; i++) {
            diasSemana[i]= in.nextFloat();
        }

        return diasSemana;
    }

    public static String diasMasVentas(float[] dato){
        int diaMax = 0;
        for (int i = 1; i < dato.length; i++) {
            if (dato[i] < dato[diaMax]){
                diaMax = i;
            }
        }
        for (int i = 0; i < dato.length; i++) {
            if (dato[i] == dato[diaMax]&&i!=diaMax){
                diaMax = i;

            }
        }

        return diasSemana[diaMax];
    }
    public static String diasMenosVentas(float[] dato) {
        int diaMin = 0;
        
        for (int i = 1; i < dato.length; i++) {
            if (dato[i] < dato[diaMin]){
                diaMin = i;
            }
        }
        for (int i = 0; i < dato.length; i++) {
            if (dato[i] == dato[diaMin]&& i!=diaMin){
                diaMin = i;

            }
        }

        return diasSemana[diaMin];
    }
}
