package functionalInterface;

import java.util.Optional;

@FunctionalInterface
interface operation{
    void add(int a , int b);
}

class Main{
    static void main() {
        operation op1 = (int a, int b)->{
            System.out.println("sum of a and b :" + (a+b));

        };
        op1.add(2,3);

        operation op2 = (int a , int b)-> System.out.println("sum of a and b " + (a+b));
        op2.add(10,20);

    }
}