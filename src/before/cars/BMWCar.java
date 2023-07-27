package before.cars;

public class BMWCar extends Car {
    private final String modelName;

    public BMWCar(String modelName) {
        super();
        this.modelName = modelName;
        System.out.println("BMWCar Done"); // Heavy Initialization
    }

    @Override
    public void move() {
        System.out.println("BMW " + modelName + " Car is Moving ...");
    }
}
