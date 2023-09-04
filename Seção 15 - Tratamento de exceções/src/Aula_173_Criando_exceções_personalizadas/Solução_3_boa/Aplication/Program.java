/**
 * Solução 3 - tratamento de exceções
 */

package Aula_173_Criando_exceções_personalizadas.Solução_3_boa.Aplication;

import Aula_173_Criando_exceções_personalizadas.Solução_3_boa.Model_Entities.Reservation;
//import Aula_173_Criando_exceções_personalizadas.Solução_3_boa.Model_Exceptions.DomainException;
import Aula_173_Criando_exceções_personalizadas.Solução_3_boa.Model_Exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = scanner.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(scanner.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(scanner.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(scanner.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(scanner.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        scanner.close();

    }

}
