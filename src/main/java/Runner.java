import air.Plane;
import air.Jet;
import products.Product;
import vehicles.Bicycle;
import vehicles.Car;
import vehicles.Engine;
import vehicles.Kayak;

public class Runner {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(10, 20, new Product(350, 5, "BMX"));
        System.out.println(bicycle.getWheelCount());
        System.out.println(bicycle.getPrice());
        System.out.println(bicycle.getTitle());

        Car car = new Car(200, 120, new Product(10000, 3, "2015 Dacia Duster"), new Engine(100, 150));

        car.startEngine();
        Engine betterEngine = new Engine(300, 400);

        Kayak kayak = new Kayak(10, 5, new Product(100, 70, "Rosie's Kayak"), "streamlined500");
        System.out.println(kayak.getHullType());
        System.out.println(kayak.getPrice());
        System.out.println(kayak.getInventory());


        Plane plane = new Plane(1000, 5000, new Product(10_000_000, 1, "Tom's plane"), "Big wings", new Engine(1000, 1500), new Jet("Fast jet"));
        System.out.println(plane.getJetType());
        System.out.println(plane.getPrice());
        System.out.println(plane.getFuel());
        plane.startJet();
    }
}
