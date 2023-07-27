package before.cars;

public class ChevCar extends Car {
    private final String modelName;

    public ChevCar(String modelName) {
        super();
        this.modelName = modelName;

        System.out.println("ChevCar Done"); // Heavy Initialization
    }

    @Override
    public void move() {
        System.out.println("Chev " + modelName + " Car is Moving ...");
    }
}
