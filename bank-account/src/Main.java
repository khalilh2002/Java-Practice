import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("ecrire votre nom");
        //String nom = sc.nextLine();

        CompteBancaire new_compte = new CompteBancaire("khail");

        new_compte.operation();


    }
}