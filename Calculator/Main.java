import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            addition a1 = new addition();
            subtraction a2 = new subtraction();
            multiplication a3 = new multiplication();
            division a4 = new division();

            int a, b, choice;
            System.out.println("\t +++(Calculator)+++");
            System.out.print("Enter first number : ");
            a = input.nextInt();
            System.out.print("Enter second number : ");
            b = input.nextInt();
            System.out.println("Menu : ");
            System.out.println("1 - Addition : ");
            System.out.println("2 - Subtraction: ");
            System.out.println("3 - Multiplication : ");
            System.out.println("4 - Division : ");
            System.out.print("Choose option (1-4) : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Adding...");
                    System.out.println("Sum of A & B is : " + a1.add(a, b));
                    break;
                case 2:
                    System.out.println("Subtracting...");
                    System.out.println("Difference of A & B is : " + a2.sub(a, b));

                    break;
                case 3:
                    System.out.println("Multiplying...");
                    System.out.println("Product of A & B is : " + a3.mul(a, b));

                    break;
                case 4:
                    System.out.println("Dividing...");
                    System.out.println("Qotient of A & B is : " + a4.div(a, b));

                    break;
                default:
                    break;
            }
            char ch;
            System.out.println("You want to restart the program(y/n) ");
            ch = input.next().charAt(0);
            if (ch == 'y') {

            } else if (ch == 'n') {
                System.exit(0);
            }
        }
    }
}
