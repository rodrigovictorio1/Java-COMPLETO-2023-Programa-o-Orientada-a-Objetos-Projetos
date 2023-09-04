package Aula_171_Pilha_de_chamadas_de_métodos_stack_trace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        method1();

        System.out.println("End of program");

    }

    public static void method1() {

        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");

    }

    public static void method2() {

        System.out.println("***METHOD2 START***");
        Scanner scanner = new Scanner(System.in);

        try {

            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        scanner.close();
        System.out.println("***METHOD2 END***");
        
    }

}
