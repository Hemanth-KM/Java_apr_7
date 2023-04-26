package April21;

public class AccountManager {
    public static void main(String[] args) {
        Account account1 = new Account(1,"Manoj",50000);
        //account 1 - Reference Variables  // Account - Primitive data type
        // the entire statement is an object
        account1.showDetails(); // Operations
        Account account2 = new Account(2,"Rishi",40000);
        account2.showDetails();
        account2.deposit(2000);
        account2.showDetails();
        account1.withdraw(2000);
        account1.showDetails();
    }
}
