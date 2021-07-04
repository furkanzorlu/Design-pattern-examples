
public class ViewCamera extends ExteriorDecorator{
    private Car car;
 
     protected ViewCamera(Car car) {
        this.car = car;
    }
    public String getDescription() {
       return car.getDescription()+",View Camera";
    }

    
    public double cost() {
         return 3.450 + car.cost();
    }
    
}
