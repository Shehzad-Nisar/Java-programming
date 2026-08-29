package encapsulationATM;

public class ATM_Main {

    static void main() {
        ATM atm1 = new ATM(111124,"Zeeshan Haider",6147,10000);
        atm1.verifyPin(6147);
        atm1.checkBalance();
        atm1.depositBalance(5000);
        atm1.withdrawBalance(2000);
        atm1.changePin(6147,4444);
        atm1.verifyPin(4444);


    }
}
