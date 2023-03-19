package Ejercicio1;



import javax.xml.datatype.Duration;
import java.util.Scanner;

import java.time.LocalDate;

public class Catalogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bicicleta bici1 = new Bicicleta("Lapierre", "400",27,  LocalDate.of(2022, 1, 1));
        Bicicleta bici2 = new Bicicleta("Btwin", "900", 10,  LocalDate.of(2023, 1, 1));


        Segway segway1 = new Segway("Segways Immotion","v8", 40, LocalDate.of(2023, 1, 1) );
        Segway segway2 = new Segway("Ninebot One", "E+",30, LocalDate.of(2023, 1, 1) );


        Giroscopio giro1 = new Giroscopio("Segway","Nine", 40,  LocalDate.of(2023, 1, 1) );
        Giroscopio giro2 = new Giroscopio("Weebot","Echo", 35,  LocalDate.of(2022, 1, 1) );


        System.out.println("Bicis:");
        System.out.println(bici1.toString() + " Precio de alquiler: " + bici1.tarifaAlquiler() + " €/hora");
        System.out.println(bici2.toString() + " Precio de alquiler: " + bici2.tarifaAlquiler() + " €/hora");
        System.out.println("\nSegways:");
        System.out.println(segway1.toString() + " Precio de alquiler: " + segway1.tarifaAlquiler() + " €/hora");
        System.out.println(segway2.toString() + " Precio de alquiler: " + segway2.tarifaAlquiler() + " €/hora");
        System.out.println("\nGiroscopios:");
        System.out.println(giro1.toString() + " Precio de alquiler: " + giro1.tarifaAlquiler() + " €/hora");
        System.out.println(giro2.toString() + " Precio de alquiler: " + giro2.tarifaAlquiler() + " €/hora");




        boolean salir = false;
        int opcion = sc.nextInt();

        do {
            System.out.println("Indica el tipo de ciclo que quieres alquilar:");
            System.out.println("1.-Bicis Lapierre speed 400 (1 año) 27 velocidades                  4,90€/hora" );
            System.out.println("2.-Bicis Btwin riverside 900 (0 años) 10 velocidades                4,90€/hora");
            System.out.println("3.-Giroscpio Segway Nine (0 años) 40 km de autonomía [1h50 min]     9,90€/hora");
            System.out.println("4.-Giroscopio Weebot Echo (1 año) 35 km de autonomía [1h60 min]     9,90€/hora ");
            System.out.println("5.-Segways Immotion v8 (0 años) 40 km de autonomía                 18,90€/hora");
            System.out.println("6.-Segways Segway Ninebot One E+ (0 años) 30 km de autonomía        18,90€/hora");

            switch (opcion){
                case 0:
                System.out.println("Adiós");
                return;
                case 1:
                    Duration duracion = Duration.ofHours(4);
                    bici1.alquiler(duracion);
                break;
                case 2:
                    Duration duracion2 = Duration.ofHours(4);
                    bici2.alquiler(duracion2);

                    break;
                case 3:
                    Duration duracion3 = Duration.ofHours(4);
                    giro1.alquiler(duracion3);
                    break;

                case 4:
                    Duration duracion4 =  Duration.ofHours(4);
                    giro2.alquiler(duracion4);
                    break;
                case 5:
                    Duration duracion5 = Duration.ofHours(4);
                    segway1.alquiler(duracion5);
                    break;
                case 6:
                    Duration duracion6 = Duration.ofHours(4);
                    segway2.alquiler(duracion6);
                    break;
            }
        }while (salir == false);
    }
}

