public class SeatHeater extends InteriorDecorator {
    Car car;
    //koltuk ýsýtýcý

    public SeatHeater(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription()+",Seat Heater";
    }

    public double cost() {
        return 5.550 + car.cost();
    }
}
