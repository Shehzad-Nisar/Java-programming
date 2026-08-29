package Interfaces;

import java.io.CharArrayReader;

public class Main {
    static void main() {
        CarContract a = new ElectricCar();
        a.turnLeft();

        CarContract b = new Sports();
        b.turnLeft();

    }
}
