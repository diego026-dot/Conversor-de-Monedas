import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Convertir convertir = new Convertir();
        Scanner leer = new Scanner(System.in);

        int opcion = 0;
        double cantidad;

        while(opcion != 7){

            System.out.println("Ingresa la opcion para cnvertir la moneda");
            System.out.println("1- Dollar a Brasileno");
            System.out.println("2- Brasileno a Dollar");
            System.out.println("3- Dollar a Colmbiano");
            System.out.println("4- Colombiano a Dollar");
            System.out.println("5- Dollar a Chileno");
            System.out.println("6- Chileno a Dollar");
            System.out.println("7- Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa la cantidad de dollares");
                    cantidad = leer.nextDouble();
                    System.out.println(convertir.dollarBrasil() * cantidad);
                    break;

                case 2:
                    System.out.println("Ingresa la cantidad de moneda Brasilena");
                    cantidad = leer.nextDouble();
                    System.out.println(convertir.brasilDollar() * cantidad);
                    break;

                case 3:
                    System.out.println("Ingresa la cantidad de Dollares");
                    cantidad = leer.nextDouble();
                    System.out.println(convertir.dollarColmbia() * cantidad);
                    break;

                case 4:
                    System.out.println("Ingresa la cantidad de moneda Colombiana");
                    cantidad = leer.nextDouble();
                    System.out.println(convertir.colombiaDollar() * cantidad);
                    break;

                case 5:
                    System.out.println("Ingresa la cantidad de Dollares");
                    cantidad = leer.nextDouble();
                    System.out.println(convertir.dollarChile() * cantidad);
                    break;

                case 6:
                    System.out.println("Ingresa la cantidad de moneda Colombiana");
                    cantidad = leer.nextDouble();
                    System.out.println(convertir.chileDollar() * cantidad);
                    break;

                case 7:
                    System.out.println("Gracias");




            }

        }
        


    }
}