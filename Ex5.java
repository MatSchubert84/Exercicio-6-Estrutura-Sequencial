package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex5 {
    
    public static void main(String[] args) {

        //Faça um Programa que converta metros para centímetros.
        double centimeters, meters;

        Scanner keyboard = new Scanner(System.in);
            
            System.out.println("Write a value in meters to be converted to centimeters: ");
            meters = keyboard.nextDouble();

        centimeters = meters * 100;

        System.out.println("\n" + meters + " meters converted to centimeters is: " + centimeters + " centimeters");
        keyboard.close();
    }
}
