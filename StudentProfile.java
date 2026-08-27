public class StudentProfile {
    public static void main(String[] args) {

        String name = "Natasha Mwamba";
        int age = 20;
        String programme = "Computer Science";
        double tuitionFee = 12500.50;
        boolean registered = true;

        System.out.println("STUDENT PROFILE");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Programme: " + programme);
        System.out.println("Tuition Fee: " + tuitionFee);
        System.out.println("Registered: " + registered);

        int number1 = 20;
        int number2 = 6;

        System.out.println();
        System.out.println("CALCULATIONS");
        System.out.println("Sum: " + (number1 + number2));
        System.out.println("Difference: " + (number1 - number2));
        System.out.println("Product: " + (number1 * number2));
        System.out.println("Quotient: " + (number1 / number2));
        System.out.println("Remainder: " + (number1 % number2));
    }
}
