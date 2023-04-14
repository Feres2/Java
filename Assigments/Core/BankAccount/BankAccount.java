public class BankAccount{
//! MEMBER VARIABLES
    private double cheking;
    private double savings;
    public static int numberOfAccounts = 0 ;
    public static double totalAmount = 0.0;
//! CONSTRUCTOR
public BankAccount (double cheking, double savings){
    this.cheking = cheking;
    this.savings = savings;
    numberOfAccounts++;
}
public static int accountCount(){
    return numberOfAccounts;

}
public static double amount(){
    return totalAmount;
}
public String deposit (double amount){
    totalAmount = totalAmount+amount;
    return "you deposit: "+ amount+"and your total is "+totalAmount ;
}
public String withdraw (double amount){
    totalAmount = totalAmount-amount;
    return "you withdraw: "+ amount ;
}









//! GETTERS AND SETTERS
    public double getCheking(){
        return this.cheking;
    }

    public void setCheking(double cheking){
        this.cheking = cheking;
    }
    public double getSavings(){
        return this.savings;
    }

    public void setSavings(double savings){
        this.savings = savings;
    }
}