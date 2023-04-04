package listadeexerciciossequencial;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        double grade1, grade2, grade3, grade4, average;

        Scanner keyboard = new Scanner(System.in);

            System.out.println("GRADE 1: ");
            grade1 = keyboard.nextDouble();
            System.out.println("\nGRADE 2: ");
            grade2 = keyboard.nextDouble();
            System.out.println("\nGRADE 3");
            grade3 = keyboard.nextDouble();
            System.out.println("\nGRADE 4: ");
            grade4 = keyboard.nextDouble();

        average = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.println("The grades average is: " + average);
        keyboard.close();
    }
}
