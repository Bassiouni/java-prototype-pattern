package after.proto;

import after.cars.BMWCar;
import after.cars.ChevCar;
import after.cars.MBenzCar;
import after.interfaces.MovableInterface;

public class CarRegistery {
    private final MovableInterface[] prototypes = { null, new BMWCar("ModelX"), new MBenzCar("ModelY"), new ChevCar("ModelZ") };

    public MovableInterface create(int id) {
        return this.prototypes[id].clone();
    }
}
