public class LaneDepartureWarningSystem extends ExteriorDecorator {
    private Car car;
    //�erit takip sistemi
    //g�r�� kameras�

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
