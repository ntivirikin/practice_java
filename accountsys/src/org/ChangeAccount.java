package accountsys.src.org;

public class ChangeAccount {

    public void main(String... args) {

        // Create two accounts with different balances
        Account accOne = new Account("Thomas Sheldon", 500);
        Account accTwo = new Account("Velma Yellowstone", 1500);

        System.out.println("Before transfer:");
        System.out.println(accOne.getAccHolder());
        System.out.println(accOne.getAccValue());
        System.out.println(accTwo.getAccHolder());
        System.out.println(accTwo.getAccValue());

        // Transfer 500 from accOne to accTwo
        System.out.println("---------------TRANSACTION OCCURRING---------------");
        transferAccounts(accOne, accTwo, 500);

        // Expect 0 in accOne and 2000 in accTwo after transfer; object has been modified
        // Object reference is passed by value, therefore we can still interact with the object in another function
        // Since passed by value, the reference cannot be changed to another object and expect to hold outside function
        System.out.println("After transfer:");
        System.out.println(accOne.getAccHolder());
        System.out.println(accOne.getAccValue());
        System.out.println(accTwo.getAccHolder());
        System.out.println(accTwo.getAccValue());

        // Let's try swapping the accounts instead
        swapAccounts(accOne, accTwo);

        System.out.println("Outside swap function:");
        System.out.println(accOne.getAccHolder());
        System.out.println(accOne.getAccValue());
        System.out.println(accTwo.getAccHolder());
        System.out.println(accTwo.getAccValue());

    }

    // Transfer money between two accounts
    public void transferAccounts(Account sender, Account recvr, Integer amntSend) {

        // Retrieve current balances
        Integer currSend = sender.getAccValue();
        Integer currRecv = recvr.getAccValue();

        // Check if the account has enough money
        if (currSend < amntSend) {
            System.out.println("Can't process request, insufficient funds in sender's account!");
        }

        // Calculate new balances
        Integer newBalSend = currSend - amntSend;
        Integer newBalRecv = currRecv + amntSend;
        
        // Set new balances
        sender.setAccValue(newBalSend);
        recvr.setAccValue(newBalRecv);
    }
    
    // Replace account with another account
    public void swapAccounts(Account accOne, Account accTwo) {

        // Replace account and check member variables
        accOne = accTwo;
        System.out.println("During swap:");
        System.out.println(accOne.getAccHolder());
        System.out.println(accOne.getAccValue());
        System.out.println(accTwo.getAccHolder());
        System.out.println(accTwo.getAccValue());
    }
}
