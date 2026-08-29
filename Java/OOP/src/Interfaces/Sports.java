package Interfaces;

public class Sports implements CarContract{
    public void turnLeft(){
        System.out.println("Sports left.");
    }

    public void turnRight(){
        System.out.println("sports right.");
    }
    public void applyBrakes(){
        System.out.println("sports brakes.");
    }

}
