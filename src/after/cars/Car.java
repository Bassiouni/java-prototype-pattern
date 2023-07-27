package after.cars;

import after.interfaces.MovableInterface;

public abstract class Car implements MovableInterface {
    public abstract void move();

    public abstract MovableInterface clone();
}
