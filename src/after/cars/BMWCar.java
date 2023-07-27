package after.cars;

import after.interfaces.MovableInterface;

public class BMWCar extends Car {
    private final String modelName;

    public BMWCar(String modelName) {
        for (int i = 0; i < 0x7FFFFFF; i++)
            System.out.print(""); // Heavy init
        this.modelName = modelName;
        System.out.println("BMWCar Done");
    }

    private BMWCar(BMWCar c) {
        this.modelName = c.modelName;
    }

    @Override
    public void move() {
        System.out.println("BMW " + modelName + " Car is Moving ...");
    }

    @Override
    public MovableInterface clone() {
        return new BMWCar(this);
    }
}
