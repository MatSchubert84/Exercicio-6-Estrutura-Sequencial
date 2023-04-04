package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {

        //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
        double number;

        Scanner keyboard = new Scanner(System.in);

            System.out.println("Write a number: ");
            number = keyboard.nextDouble();

        System.out.println("The number is: " + number);

        keyboard.close();
    }
}