package ceng.anadolu.bim492;

public class BmwFactory implements CarFactory {
    public SportsCar createSportsCar() {
        return new bmw520();
    }
    public EconomyCar createEconomyCar() {
        return new Bmwi3();
    }
}
