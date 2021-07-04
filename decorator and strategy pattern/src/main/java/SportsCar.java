public class SportsCar extends Car {
    FirstorSecond firstorSecond;
    double price;

    public void setPrice(double price) {
        this.price = firstorSecond.addingForYear(price);
    }

    public SportsCar(FirstorSecond firstorSecond) {
        this.firstorSecond = firstorSecond;
        description = "Your car properties is a"+firstorSecond.description();
    }

    public double cost() {
        return price + 50000.05;
    }
}
