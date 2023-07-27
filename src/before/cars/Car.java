package before.cars;

import before.interfaces.MovableInterface;

public abstract class Car implements MovableInterface {
    public Car() {
        for (int i = 0; i < 0x7FFFFFF; i++)
            System.out.print(""); // Heavy init
    }

    public abstract void move();
}
