import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        CompteBancaire newAccount = new CompteBancaire(name);

        newAccount.performOperations();
    }
}