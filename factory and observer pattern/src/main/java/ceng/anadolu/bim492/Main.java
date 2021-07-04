package ceng.anadolu.bim492;

public class Main {
    public static void main(String[] args) {
      BmwOrder bmw = new BmwOrder();
     MercedesOrder mercedes = new MercedesOrder();

     NoticeObservable noticeObservable = new NoticeObservable();

     mercedes.setObservable(noticeObservable);

     noticeObservable.addObserver(bmw);
    noticeObservable.addObserver(mercedes);
    //noticeObservable.removeObserver(mercedes);
      
     noticeObservable.notifyObserver(); 

        System.out.println("***********");


    CarFactory factory1 = new BmwFactory();
    CarFactory factory2 = new MercedesFactory();
   

    SportsCar car1 = factory1.createSportsCar();
    EconomyCar car2 = factory1.createEconomyCar();
    SportsCar car3 = factory2.createSportsCar();
    EconomyCar car4 = factory2.createEconomyCar();
    


    car1.driveFast();
    car2.driveSlow();
    car3.driveFast();
    car4.driveSlow();
    

     
     
    
    }
}
