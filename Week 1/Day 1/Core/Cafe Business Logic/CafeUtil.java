import java.util.ArrayList;

public class CafeUtil {
    
    // Method 1: getStreakGoal
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // Method 2: getOrderTotal
    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    // Method 3: displayMenu
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    // Method 4: addCustomer
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        int numAhead = customers.size();
        System.out.println("There are " + numAhead + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

    // Ninja Bonus: printPriceChart
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            double totalPrice = price * i;
            System.out.printf("%d - $%.2f\n", i, totalPrice);
        }
    }

    // Sensei Bonus: printPriceChart with discount
    public void printPriceChart(String product, double price, int maxQuantity, double discount) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            double totalPrice = price * i - discount * (i - 1);
            System.out.printf("%d - $%.2f\n", i, totalPrice);
        }
    }

    // Sensei Bonus: overloaded displayMenu
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i) + " -- $" + prices.get(i));
        }
        return true;
    }

    // Sensei Bonus: addCustomers
    public void addCustomers() {
        ArrayList<String> customers = new ArrayList<>();
        String input = "";
        while (!input.equals("q")) {
            System.out.println("Please enter a customer name (or 'q' to quit):");
            input = System.console().readLine();
            if (!input.equals("q")) {
                customers.add(input);
            }
        }
        System.out.println(customers);
    }
}
