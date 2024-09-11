package ejecucion;

import logica.Operaciones;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int opcion;

        Scanner scannerOperacion = new Scanner(System.in);

        System.out.println("Usted va a realizar una operación aritmetica");
        System.out.println("Ingrese el primer número");
        double primero = scannerOperacion.nextInt();
        System.out.println("Ingrese el segundo número");
        double segundo = scannerOperacion.nextInt();

        System.out.println("Digita la operación deseada");

        do{
            System.out.println("-------------------------------------------------");
            System.out.println("-               CALCULADORA                     -");
            System.out.println("-               1.SUMA                          -");
            System.out.println("-               2.RESTA                         -");
            System.out.println("-               3.MULTIPLICACIÓN                -");
            System.out.println("-               4.DIVISIÓN                      -");
            System.out.println("-               0.SALIR                         -");
            System.out.println("-------------------------------------------------");

            opcion = scannerOperacion.nextInt();





            Operaciones operaciones = new Operaciones(primero, segundo);

            switch (opcion){
                case 1:
                    double resultadoSuma = operaciones.suma();
                    System.out.println("El resultado de la suma es:"+resultadoSuma);
                    break;
                case 2:
                    double resultadoResta = operaciones.resta();
                    System.out.println("El resultado de la resta es:"+resultadoResta);
                    break;
                case 3:
                    double resultadoMultiplicacion = operaciones.multiplicacion(primero,segundo);
                    System.out.println("El resultado de la multiplicación es:"+resultadoMultiplicacion);
                    break;
               case 4:
                    double resultadoDivision = operaciones.division(primero,segundo);
                   System.out.println("El resultado de la division es:"+resultadoDivision);
                    break;
                case 0:
                    System.out.println("-------------------------------------------------");
                    System.out.println("-                Saliendo...                    -");
                    System.out.println("-------------------------------------------------");
                    break;

                default :
                    System.out.println("-------------------------------------------------");
                    System.out.println("-  OPCIÓN NO VALIDA/INGRESA UNA OPCIÓN DEL MENÚ -");
                    System.out.println("-------------------------------------------------");

            }

        }while(opcion!=0);
        System.out.println("CHAOOOOOOOOOOO");
    }
}