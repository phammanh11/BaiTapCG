import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanne.nextLine();

        System.out.println("Hello: " + name);
    }
}
