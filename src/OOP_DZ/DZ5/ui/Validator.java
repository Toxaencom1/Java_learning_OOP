package OOP_DZ.DZ5.ui;

import OOP_DZ.DZ5.Scanner;

public class Validator {

    public Integer valMenuChoice(String numberFromScanner, int till) {
        while (true) {
            try {
                emergency_exit(numberFromScanner);
                if (Integer.parseInt(numberFromScanner) > 0 && Integer.parseInt(numberFromScanner) <= till) {//
                    return Integer.parseInt(numberFromScanner);
                } else {
                    System.out.printf("Enter number from 1 till %s: ", till);
                    numberFromScanner = Scanner.getScanner().nextLine();
                }
            } catch (Exception ex) {
                System.out.printf("Enter number from 1 till %s: ", till);
                numberFromScanner = Scanner.getScanner().nextLine();
            }
        }
    }

    public Integer valInt(String numberFromScanner) {
        while (true) {
            try {
                emergency_exit(numberFromScanner);
                if (Integer.parseInt(numberFromScanner) > -2_147_483_648 && Integer.parseInt(numberFromScanner) < 2_147_483_647) {//
                    return Integer.parseInt(numberFromScanner);
                } else {
                    System.out.print("Enter number: ");
                    numberFromScanner = Scanner.getScanner().nextLine();
                }
            } catch (Exception ex) {
                System.out.print("Enter number: ");
                numberFromScanner = Scanner.getScanner().nextLine();
            }
        }
    }

    public double valDouble(String numberFromScanner) {
        while (true) {
            try {
                emergency_exit(numberFromScanner);
                if (Double.parseDouble(numberFromScanner) > -2_147_483_648.0 && Double.parseDouble(numberFromScanner) < 2_147_483_647.0) {//
                    return Double.parseDouble(numberFromScanner);
                } else {
                    System.out.print("Enter real number: ");
                    numberFromScanner = Scanner.getScanner().nextLine();
                }
            } catch (Exception ex) {
                System.out.print("Enter real number: ");
                numberFromScanner = Scanner.getScanner().nextLine();
            }
        }
    }

    public String emergency_exit(String string) {
        if (string.equals("exit")) {
            System.exit(0);
        }
        return string;
    }
}
