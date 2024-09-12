import java.util.Scanner;

public class CarTester{
    public static Car addCar(){
        Scanner carScan = new Scanner(System.in);
        System.out.println("Enter Car Name");
        String carName = carScan.nextLine();
        System.out.println("Enter Miles Driven");
        double mileDriven = carScan.nextDouble();
        System.out.println("Enter Gallons Used");
        double gallonsUsed = carScan.nextDouble();
        Car car1 = new Car(carName, mileDriven, gallonsUsed);
        return car1;
    }

    public static void main(String[] args) {
        Car car1 = addCar();
        Car car2 = addCar();
        String y = "";
        y = car2.toString();
        String x = "";
        x = car1.toString();
        System.out.println(x);
        System.out.println(y);

        
    }
}
