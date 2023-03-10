package OOP_DZ.DZ2;

import java.util.Scanner;

public class Validator {
    public static Integer valMenuChoice(String choice, int till, Scanner scanner) {
        while (true) {
            try {
                emergency_exit(choice);
                if (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) <= till) {//
                    return Integer.parseInt(choice);
                } else {
                    System.out.printf("Enter number from 1 till %s: ", till);
                    choice = scanner.nextLine();
                }
            } catch (Exception ex) {
                System.out.printf("Enter number from 1 till %s: ", till);
                choice = scanner.nextLine();
            }
        }
    }

    public static Integer valInt(String choice, Scanner scanner) {
        while (true) {
            try {
                emergency_exit(choice);
                if (Integer.parseInt(choice) > -2_147_483_648 && Integer.parseInt(choice) < 2_147_483_647) {//
                    return Integer.parseInt(choice);
                } else {
                    System.out.print("Enter number: ");
                    choice = scanner.nextLine();
                }
            } catch (Exception ex) {
                System.out.print("Enter number: ");
                choice = scanner.nextLine();
            }
        }
    }

    public static double valDouble(String choice, Scanner scanner) {
        while (true) {
            try {
                emergency_exit(choice);
                if (Double.parseDouble(choice) > -2_147_483_648.0 && Double.parseDouble(choice) < 2_147_483_647.0) {//
                    return Double.parseDouble(choice);
                } else {
                    System.out.print("Enter real number: ");
                    choice = scanner.nextLine();
                }
            } catch (Exception ex) {
                System.out.print("Enter real number: ");
                choice = scanner.nextLine();
            }
        }
    }

    public static String emergency_exit(String string) {
        if (string.equals("exit")) {
            System.exit(0);
        }
        return string;
    }
}
