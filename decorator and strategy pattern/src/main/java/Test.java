import static java.lang.Math.round;

public class Test {
    public static void main(String[] args) {
        Car car = new SportsCar(new UsedCar());
        ((SportsCar) car).setPrice(car.cost());
        car = new SeatHeater(car);
        car = new SteelRims(car);
        car = new SoundSystem(car);
        car=new LaneDepartureWarningSystem(car);
        car=new ViewCamera(car);
        System.out.println(car.getDescription());
        System.out.println("The amount you have to pay : " + round(car.cost())+" Turkish Lira");
        
    }
}