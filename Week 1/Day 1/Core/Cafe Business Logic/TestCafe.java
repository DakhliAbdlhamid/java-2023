import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        
        CafeUtil appTest = new CafeUtil(); // Instantiate the CafeUtil class

        // Streak Goal Test
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal()); // Expected output: 55

        // Order Total Test
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: $%.2f \n\n", appTest.getOrderTotal(lineItems)); // Expected output: 13.50
        
        // Display Menu Test
        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);
        
        // Add Customer Test
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("\n");
        }

        // Ninja Bonus: printPriceChart Test
        System.out.println("\n----- Print Price Chart Test-----");
        appTest.printPriceChart("Columbian Coffee Grounds", 15.0, 3);

        // Sensei Bonus: printPriceChart with discount Test
        System.out.println("\n----- Print Price Chart Test (with discount)-----");
        appTest.printPriceChart("Columbian Coffee Grounds", 2.0, 4, 0.50);

        // Sensei Bonus: overloaded displayMenu Test
        System.out.println("\n----- Display Menu Test (overloaded)-----");
        ArrayList<Double> prices = new ArrayList<Double>(Arrays.asList(1.50, 3.50, 4.50, 3.50));
        appTest.displayMenu(menu, prices);

        // Sensei Bonus: addCustomers Test
        System.out.println("\n----- Add Customers Test -----");
        appTest.addCustomers();
    }
}
