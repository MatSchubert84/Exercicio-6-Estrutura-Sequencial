package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        //Faça um Programa que peça dois números e imprima a soma.
        double number1, number2, sum;
        
        Scanner keyboard = new Scanner(System.in);

            System.out.println("Write a number: ");
            number1 = keyboard.nextDouble();
            System.out.println("\nWrite another number: ");
            number2 = keyboard.nextDouble();

        sum = number1 + number2;

        System.out.println("\n" + number1 + " + " + number2 + " = " + sum);
        keyboard.close();
    }
}
