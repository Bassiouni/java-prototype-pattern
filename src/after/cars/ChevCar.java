package after.cars;

import after.interfaces.MovableInterface;

public class ChevCar extends Car {
    private final String modelName;

    public ChevCar(String modelName) {
        for (int i = 0; i < 0x7FFFFFF; i++)
            System.out.print(""); // Heavy init

        this.modelName = modelName;

        System.out.println("ChevCar Done");
    }

    private ChevCar(ChevCar c) {
        this.modelName = c.modelName;
    }

    @Override
    public void move() {
        System.out.println("Chev " + modelName + " Car is Moving ...");
    }

    @Override
    public MovableInterface clone() {
        return new ChevCar(this);
    }
}
