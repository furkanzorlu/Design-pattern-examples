package ceng.anadolu.bim492;

public class MercedesFactory implements CarFactory {
    public SportsCar createSportsCar() {
        return new Amg();
    }
    public EconomyCar createEconomyCar() {
        return new E250();
    }
}
