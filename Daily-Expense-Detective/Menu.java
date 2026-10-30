
import java.util.*;

public class Menu {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int budget;

        while (true) {
            System.out.print("Enter your daily budget: ");
            budget = sc.nextInt();

            if (budget < 0) {
                System.out.println("Enter a valid budget!");
            } else {
                break;
            }
        }

        System.out.println("Your budget is: " + budget);

        while (true) {
            System.out.print("Enter expense (0 to finish): ");
            int expense = sc.nextInt();

            if (expense == 0) {
                break;
            }

            if (expense < 0) {
                System.out.println("Enter a valid expense!");
            } else {
                list.add(expense);
                System.out.println("Expense added successfully!");
            }
        }

        int totalExpenses = 0;

        for (int amount : list) {
            totalExpenses += amount;
        }

        int remainingAmount = budget - totalExpenses;

        System.out.println("All expenses: " + list);
        System.out.println("Total expenses: " + totalExpenses);

        if (remainingAmount < 0) {
            System.out.println("You exceeded your budget by: " + (-remainingAmount));
        } else {
            System.out.println("You are within your budget.");
            System.out.println("Remaining amount: " + remainingAmount);
        }

        sc.close();
    }
}
