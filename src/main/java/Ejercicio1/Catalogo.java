package Ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Catalogo {
    public static void main(String[] args) {
        ArrayList<Ciclos> catalogo = new ArrayList<Ciclos>();

        catalogo.add(new Bicicleta("Lapierre", "400",27, LocalDate.of(2022,3,1)));
        catalogo.add(new Bicicleta("Btwin", "900", 10, LocalDate.of(2013,1,1)));
        catalogo.add(new Giroscopio("Ejercicio1.Segway", "Nine", 40,  LocalDate.of(2023,2,1)));
        catalogo.add(new Giroscopio("Weebot", "Echo", 35, LocalDate.of(2022, 12,1)));
        catalogo.add(new Segway("Immotion", "v8", 40, LocalDate.of(2023, 3,1)));
        catalogo.add(new Segway("Ejercicio1.Segway", "Ninebot One E+", 30, LocalDate.of(2023, 1,1)));

        System.out.println("Est es el catálogo de ciclos: ");
        System.out.printf("%-15s%-25s%-30s%s\n", "Tipo", "Marca", "Autonomia", "Tarifa");
        for (Ciclos ciclo : catalogo){
            System.out.println(ciclo);
        }


    }
}
