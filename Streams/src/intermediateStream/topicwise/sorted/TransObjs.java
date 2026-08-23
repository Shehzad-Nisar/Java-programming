package intermediateStream.topicwise.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TransObjs {

    static void main() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("TXN001", "DEPOSIT", 5000.00),
                new Transaction("TXN002", "WITHDRAW", 2500.00),
                new Transaction("TXN003", "TRANSFER", 7500.00),
                new Transaction("TXN004", "DEPOSIT", 5000.00),
                new Transaction("TXN005", "WITHDRAW", 1200.00),
                new Transaction("TXN006", "TRANSFER", 9000.00),
                new Transaction("TXN007", "DEPOSIT", 3000.00),
                new Transaction("TXN008", "WITHDRAW", 7500.00),
                new Transaction("TXN009", "TRANSFER", 1500.00),
                new Transaction("TXN010", "DEPOSIT", 9000.00),

                new Transaction("TXN011", "WITHDRAW", 5000.00),
                new Transaction("TXN012", "TRANSFER", 3200.00),
                new Transaction("TXN013", "DEPOSIT", 1200.00),
                new Transaction("TXN014", "WITHDRAW", 7500.00),
                new Transaction("TXN015", "TRANSFER", 2500.00),
                new Transaction("TXN016", "DEPOSIT", 6500.00),
                new Transaction("TXN017", "WITHDRAW", 3000.00),
                new Transaction("TXN018", "TRANSFER", 9000.00),
                new Transaction("TXN019", "DEPOSIT", 1500.00),
                new Transaction("TXN020", "WITHDRAW", 6500.00),

                new Transaction("TXN021", "TRANSFER", 5000.00),
                new Transaction("TXN022", "DEPOSIT", 3200.00),
                new Transaction("TXN023", "WITHDRAW", 1200.00),
                new Transaction("TXN024", "TRANSFER", 7500.00),
                new Transaction("TXN025", "DEPOSIT", 2500.00),
                new Transaction("TXN026", "WITHDRAW", 9000.00),
                new Transaction("TXN027", "TRANSFER", 3000.00),
                new Transaction("TXN028", "DEPOSIT", 6500.00),
                new Transaction("TXN029", "WITHDRAW", 1500.00),
                new Transaction("TXN030", "TRANSFER", 5000.00)
        );

        List<Transaction> highestToLowTransAmount = transactions.stream()
                .sorted().toList();
        System.out.println(highestToLowTransAmount);

    }
}
