package Fundamentals;

import java.util.Scanner;

public class BackwardsPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int attempts = 0;

        for (int position = username.length() - 1; position >= 0; position--) {
            char currentSym = username.charAt(position);
            password += currentSym;
        }
        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(password)) {
            attempts ++;
            if (attempts >= 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }










    }
}