/**
 * Solução 2 - Método retornando string
 */

package Aula_173_Criando_exceções_personalizadas.Solução_2_ruim.Aplication;

import Aula_173_Criando_exceções_personalizadas.Solução_2_ruim.Model_Entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) throws ParseException{

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room number: ");
        int number = scanner.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scanner.next());
        System.out.print("Check-out date (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scanner.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scanner.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scanner.next());

            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + reservation);
            }

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }


        scanner.close();

    }

}
