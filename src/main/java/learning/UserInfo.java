package learning;

import java.util.Scanner;

public class UserInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = sc.nextLine();
        System.out.println("Enter your age");
        int userAge = sc.nextInt();

        System.out.println("Hello, " + userName);
        System.out.println("You are " + userAge + " years old");
        System.out.println("Next year, you will be " + (userAge + 1));

    }

}
