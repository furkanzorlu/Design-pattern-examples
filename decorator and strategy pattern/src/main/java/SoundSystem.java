public class SoundSystem extends InteriorDecorator {
    private Car car;
     //ses sistemi
    protected SoundSystem(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription()+",Sound System";
    }

    public double cost() {
        return 4.350+car.cost();
    }
}
