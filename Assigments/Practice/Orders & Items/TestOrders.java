
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item();
        item1.make = "mocha";
        item1.price = 5.9;
//!==================================================
        Item item2 = new Item();
        item2.make = "latte";
        item2.price = 8.2;
//!==================================================
        Item item3 = new Item();
        item3.make = "drip coffe";
        item3.price = 4.2;
//!==================================================
        Item item4 = new Item();
        item4.make = "capuccino";
        item4.price = 7.2;
//!==================================================

        // Order variables -- order1, order2 etc.
Order order1 = new Order();
        System.out.println(order1.total);
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";
        // Application Simulations
        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item4);
        order3.total += item4.price;

        order4.items.add(item2);
        order4.total += item2.price;

        order4.ready = true;

        order4.items.add(item2);
        order4.total += item2.price;

        order2.ready = true;

        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
    }
}