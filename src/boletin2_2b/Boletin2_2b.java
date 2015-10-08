
package boletin2_2b;

import java.util.Scanner;


public class Boletin2_2b {

    public static void main(String[] args) {
//entrada por teclado
        double lado, area ;
        Scanner obx =new Scanner (System.in);
        System.out.println("teclea lado  :");
        lado = obx.nextDouble();
        area = Math.pow (lado,2);
        System.out.println("area ="+ area);
    }
    
}
