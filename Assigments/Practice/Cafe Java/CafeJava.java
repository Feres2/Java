public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly, ";
        String readyMessage = ", your order is ready ";
        String displayTotalMessage = "Your total is $";
        String youOwes = "You need more $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 5.5;
        double lattePrice = 7.8;
        double cappuccinoPrice = 9 ; 
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(pendingMessage + customer1);
        System.out.println(isReadyOrder4? readyMessage+customer4 : pendingMessage+customer4);
        System.out.println(isReadyOrder2? displayTotalMessage + (cappuccinoPrice *2) : pendingMessage);
        System.out.println(youOwes + (lattePrice-dripCoffeePrice));
    	// ** Your customer interaction print statements will go here ** //
    }
}
