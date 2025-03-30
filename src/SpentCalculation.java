import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class SpentCalculation {
    private final ArrayList<Expense> spends;

    public SpentCalculation(){
        spends = new ArrayList<>();
    }
    public void addExpense(){
        Scanner capture = new Scanner(System.in);
        capture.useLocale(Locale.US);
        String choice;
        do {
            double amount =0;
            String description = null;
            String date = null;
            boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the amount spent: ");
                amount = capture.nextDouble();
                if (amount < 0 ) {
                    System.out.println("❌ Invalid amount entered. Please enter a valid amount for the expense.");
                } else {
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("❌ Invalid amount entered. Please enter a number.");
                capture.next(); //Clean buffer to avoid infinite loop
            }
        }
        capture.nextLine();
            do {
                System.out.print("Enter the description for the amount spent: ");
                description = capture.next();
                if (!description.matches(".{3,}")) {
                    System.out.println("❌ Invalid description length entered. Please enter a description of 3 or more characters for the expense.");
                }

            } while (!description.matches(".{3,}")); // Repite hasta que sea válida
            capture.nextLine();
            validInput = false;
            while (!validInput){
                try {
                    System.out.print("Enter the date in which the amount was spent (DD/MM/YYYY): ");
                    date = capture.next();
                    if (date.matches("\\d{2}/\\d{2}/\\d{4}")) {
                        validInput = true;
                    } else {
                        throw new Exception("❌ Invalid date format entered. Please enter a date with the format (DD/MM/YYYY) for the expense.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            spends.add(new Expense(amount, description, date));
            System.out.println("Added: "+spends.get(spends.size()-1));

            System.out.print("\nDo you want to add another expense? (yes/no): ");
            choice = capture.next();
        } while (choice.equalsIgnoreCase("yes")) ;
        System.out.println("\nTotal expenses recorded: " + spends.size());
        capture.close();
    }

    public double calculateTotal(){
        double total =0;
        for (Expense expense:spends){
            total+=expense.getAmount();
        }
        return total;
    }
    public void showExpenses(){
        System.out.println("\nExpenses list: \n");
        for (Expense spend : spends) {
            System.out.println(spend);
        }
        System.out.printf("\nTotal: $%.2f\n",calculateTotal());

    }
}