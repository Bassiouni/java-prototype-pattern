package before;

import java.util.ArrayList;
import java.util.Scanner;

import before.cars.BMWCar;
import before.cars.Car;
import before.cars.ChevCar;
import before.cars.MBenzCar;

public class Main {
    public static void main() {
        ArrayList<Car> listOfCars = new ArrayList<Car>();
        Scanner scanner = new Scanner(System.in);

        choice_loop: while (true) {
            System.out.print("(1) BMW\n(2) MBenz\n(3)Chev\n(0) Start\n>> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    break choice_loop;

                case 1:
                    listOfCars.add(new BMWCar("ModelX"));
                    break;

                case 2:
                    listOfCars.add(new MBenzCar("ModelY"));
                    break;

                case 3:
                    listOfCars.add(new ChevCar("ModelZ"));
                    break;
            }
        }

        scanner.close();

        for (Car car : listOfCars) {
            car.move();
        }
    }
}
