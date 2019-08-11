/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27072019_4;

import java.util.Scanner;

/**
 *
 * @author wardog
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entradaDatos = new Scanner(System.in);
        int[] num = new int[4];
        int t_suma = 0, t_producto = 0;

        System.out.println("=> Se reciben 4 numeros enteros\n"
                + "=> Se suma el primero con el segunto y se guarda el resultado\n"
                + "=> Se multiplica el tercero por el cuarto y se garda el resultado\n"
                + "=> Se despliega el resultado de cada operacion\n");

        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingresa el valor para la posicion [" + (i + 1) + "] :");
            num[i] = entradaDatos.nextInt();

        }

        t_suma = num[0] + num[1];
        t_producto = num[2] * num[3];

        System.out.println("--------------------------------------------------------");

        System.out.println("Resultado de la ejecucion");
        System.out.println("Total de la suma = " + t_suma);
        System.out.println("Total del producto: " + t_producto);

    }

}
