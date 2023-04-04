package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex6 {
    
    public static void main(String[] args) {

        //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        double radius, area;

        Scanner keyboard = new Scanner(System.in);

            System.out.println("Write the radius of a circle to calculate it's area: ");
            radius = keyboard.nextDouble();

        area = (Math.PI * radius * radius);

        System.out.println("\nThe circle area is: " + area);
        keyboard.close();
    }
}
