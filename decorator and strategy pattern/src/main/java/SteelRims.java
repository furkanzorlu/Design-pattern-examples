public class SteelRims extends ExteriorDecorator {
    private Car car;
    //çelik jants
    public SteelRims(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() +",Steel Rims";
    }

    public double cost() {
        return 2.672 + car.cost();
    }
}
