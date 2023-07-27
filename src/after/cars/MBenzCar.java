package after.cars;

import after.interfaces.MovableInterface;

public class MBenzCar extends Car {
    private final String modelName;

    public MBenzCar(String modelName) {
        for (int i = 0; i < 0x7FFFFFF; i++)
            System.out.print(""); // Heavy init

        this.modelName = modelName;

        System.out.println("MBenzCar Done");
    }

    private MBenzCar(MBenzCar c) {
        this.modelName = c.modelName;
    }

    @Override
    public void move() {
        System.out.println("MBenz " + modelName + " Car is Moving ...");
    }

    @Override
    public MovableInterface clone() {
        return new MBenzCar(this);
    }
}
