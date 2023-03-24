package OOP_DZ.DZ5;

public class Scanner {
    private static java.util.Scanner scanner;

    public static java.util.Scanner getScanner() {
        if(scanner == null){
            scanner = new java.util.Scanner(System.in);
        }
        return scanner;
    }
}
