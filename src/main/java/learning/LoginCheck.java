package learning;

import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String inputUserName = sc.nextLine();
        System.out.println("Enter password");
        String inputPassword = sc.nextLine();

        if (username.equals(inputUserName) && password.equals(inputPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

    }
}
