public class LaneDepartureWarningSystem extends ExteriorDecorator {
    private Car car;
    //þerit takip sistemi
    //görüþ kamerasý

    protected LaneDepartureWarningSystem(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription()+",Lane Departure Warning System";
    }

    public double cost() {
        return 9.111 + car.cost();
    }
}
