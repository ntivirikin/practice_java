package accountsys.src.org;

import java.util.ArrayList;

public class PrintGenericLedger {

    public void main(String... args) {

        // Create accounts
        Account accOne = new Account("James Soldington", 600);
        Account accTwo = new Account("Lucy Grover", 800);

        // Create settlement cases
        Settlement settOne = new Settlement("Connor Hardy", "Juliet Wilson", 1500);
        Settlement settTwo = new Settlement("George Placing", "Jennifer Douglas", 850);

        // Add to ledger with array
        Ledger<Account> accBox = new Ledger<Account>(new Account[] {accOne, accTwo});
        Ledger<Settlement> settBox = new Ledger<Settlement>(new Settlement[] {settOne, settTwo});

        // Print information of each element in the ledger
        accBox.printList();
        settBox.printList();

    }

    // Ledger can either be an account or settlement case listing
    public class Ledger<T extends Balance> {
        ArrayList<T> theList;

        // When using varargs, we receive heap pollution warning
        public Ledger(T[] objList) {
            theList = new ArrayList<T>();
            for (T item : objList) {
                theList.add(item);
            }
        }

        // Print the information of every member of the list
        public void printList() {
            for (T item : theList) {
                item.printInfo();
            }
        }
    }

}
