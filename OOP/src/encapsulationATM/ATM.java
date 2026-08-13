package encapsulationATM;

public class ATM {
    private long accountNumber ;
    private int pinNumber ;
    private String accHolder;
    private double accBalance;

    ATM(long accountNumber , String accHolder, int pinNumber, double accBalance ){
        System.out.println("constructor class has executed:");
        this.accountNumber = accountNumber;
        this.pinNumber = pinNumber;
        this.accHolder = accHolder;
        this.accBalance = accBalance;

    }

    //varify pin :::
    public boolean verifyPin(int pinNumber){
        if(pinNumber<1000|| pinNumber>9999){
            System.out.println("Invalid PIN. PIN must be exactly 4 digits.");
            return false;
        }
        if(this.pinNumber==pinNumber){
            System.out.println("Correct Pin number!");
            return true;
        }else{
            System.out.println("Incorrect Pin number!");
            return false;
        }

    }

    //check Balance:::

    public void checkBalance(){
        System.out.println("Your Account Balance is :" + accBalance);
    }

    //deposited Balance method:::

    public void depositBalance(double amount){
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }
        accBalance+= amount;
        System.out.println("Account Balance after deposited:" + accBalance);

    }

    //withdraw balance from account method:

    public void withdrawBalance(double amount){
        if(amount<=0){
            System.out.println("Invalid withdrawal Amount!");
            return;
        }
        if(amount>accBalance){
            System.out.println("Insufficient Balance.Thank you!!!");
            return;
        }

        accBalance-=amount;
        System.out.println("Account Balance after withdraw:" + accBalance);

    }


    //Change account pin number:

    public void changePin(int oldpinNum, int newpinNum){

        if(oldpinNum!= pinNumber){
            System.out.println("Your old pin number is incorrect.");
            return;
        }
        if(newpinNum<1000|| newpinNum>9999){
            System.out.println("Invalid new pin number.It should 4 digit.");
            return;
        }

        pinNumber = newpinNum;
        System.out.println("PIN changed successfully.");
    }


    }


