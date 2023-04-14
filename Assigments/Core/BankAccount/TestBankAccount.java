public class TestBankAccount{
    public static void main(String[] args){
        //*bankaccounts
        BankAccount account1 = new BankAccount(1.3,2.6);
        BankAccount account2 = new BankAccount(7.2,3.5);
        BankAccount account3 = new BankAccount(9.1,8.8);
        System.out.println(BankAccount.accountCount());
        account1.withdraw(1.1);
    }
}