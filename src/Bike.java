// extend bike class to vehicle class
public class Bike extends Vehicle {
    public boolean sidecar;

    public int passengers;

    public Bike(int seat, float engine, String colour, int bill, boolean sidecar, int passengers) {
        super(seat, engine, colour, 4000);
        this.sidecar = sidecar;
        this.passengers = passengers;

    }

}
