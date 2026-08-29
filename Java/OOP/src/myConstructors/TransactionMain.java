package myConstructors;

public class TransactionMain {

    static void main() {
        Transaction t1 = new Transaction(
                1122,
                1001,
                1002,
                5000.20);
        t1.display();

        Transaction t2= new Transaction(
                1123,
                1001,
                1010,
                567800.20,
                "Completed!");

        t2.display();




    }





}
