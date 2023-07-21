// extend car class to vehicle class
public class Car extends Vehicle {
    public boolean boot;

    public boolean wipers;



    public Car(int seat, float engine, String colour, boolean boot, boolean wipers) {
        super(seat, engine, colour, 6000);
        this.boot = boot;
        this.wipers = wipers;
    }
}
