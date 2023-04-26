package Homework;

import java.util.Scanner;


import static java.lang.System.*;

public class HomeWorkTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Packstücke möchten Sie versenden?");
        int countOfBoxes = scanner.nextInt();
        System.out.println("Gewicht pro Packstück?");
        double weightOfSingleBox = scanner.nextDouble();

        System.out.println("Tragen Sie den Empfänger ein");
        scanner.nextLine(); // stub
        String nameOfRecipient = scanner.nextLine();
        System.out.println("Geben Sie die Adresse des Empfängers ein");
        String addressOfRecipient = scanner.nextLine();

        double totalParcelWeight =(countOfBoxes * weightOfSingleBox);

        String label = "\nRecipient name: \"" + nameOfRecipient.toUpperCase() + "\"\n"
                + "Recipient address: \"" + addressOfRecipient.toUpperCase() + "\"\n"
                + "Parcel weight: " + totalParcelWeight + " kg";


        System.out.println(label);

        System.out.println("Ist alles richtig? Ja/Nein");
        boolean isCorrect = scanner.nextBoolean();
    }
}
