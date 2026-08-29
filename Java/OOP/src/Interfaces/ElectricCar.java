package Interfaces;

public class ElectricCar implements CarContract{

    public void turnLeft(){
        System.out.println("Electric left.");
    }

    public void turnRight(){
        System.out.println("Electric right.");
    }
    public void applyBrakes(){
        System.out.println("Electric brakes.");
    }

}
