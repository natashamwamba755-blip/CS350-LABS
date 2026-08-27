import java.util.Scanner;

public class StudentInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your programme: ");
        String programme = input.nextLine();

        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You are studying " + programme + ".");
        System.out.println("Welcome to CS350.");

        input.close();
    }
}