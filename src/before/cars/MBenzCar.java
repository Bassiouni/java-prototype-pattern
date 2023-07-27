package before.cars;

public class MBenzCar extends Car {
    private final String modelName;

    public MBenzCar(String modelName) {
        super();
        this.modelName = modelName;

        System.out.println("MBenzCar Done"); // Heavy Initialization
    }

    @Override
    public void move() {
        System.out.println("MBenz " + modelName + " Car is Moving ...");
    }
}
