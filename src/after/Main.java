package after;

import java.util.ArrayList;
import java.util.Scanner;

import after.interfaces.MovableInterface;
import after.proto.CarRegistery;

public class Main {
    public static void main() {
        CarRegistery cr = new CarRegistery();
        ArrayList<MovableInterface> listOfCars = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("(1) BMW\n(2) MBenz\n(3)Chev\n(0) Start\n>> ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            listOfCars.add(cr.create(choice));
        }

        scanner.close();

        for (MovableInterface car : listOfCars) {
            car.move();
        }
    }
}
