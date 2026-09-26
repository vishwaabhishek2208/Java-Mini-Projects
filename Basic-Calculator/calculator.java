import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 For add ");
        System.out.println("2 For subtract ");
        System.out.println("3 For multiply ");
        System.out.println("4 For divide ");

        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        System.out.println("Enter another number : ");
        int b = sc.nextInt();

        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        double division = (double) a / b;

        switch (choice) {
            case 1:
                System.out.println("The summation is : " + sum);
                break;

            case 2:
                System.out.println("The subtraction is : " + sub);
                break;

            case 3:
                System.out.println("The multiplication is : " + multi);
                break;

            case 4:
                System.out.println("The division is : " + division);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }

}
