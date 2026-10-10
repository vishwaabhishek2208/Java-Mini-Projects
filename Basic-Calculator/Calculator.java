import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 For add ");
            System.out.println("2 For subtract ");
            System.out.println("3 For multiply ");
            System.out.println("4 For divide ");
            System.out.println("5 For exit ");

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Bye!");
                break;
            }

            System.out.print("Enter a number : ");
            int a = sc.nextInt();

            System.out.print("Enter another number : ");
            int b = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The summation is : " + (a + b));
                    break;
                case 2:
                    System.out.println("The subtraction is : " + (a - b));
                    break;
                case 3:
                    System.out.println("The multiplication is : " + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        System.out.println("The division is : " + ((double) a / b));
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println();
        }

        sc.close();
    }
}
