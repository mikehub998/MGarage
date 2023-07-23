// extend plane class to vehicle class
public class Plane extends Vehicle {
    public int missiles;

    public boolean afterburner;

    public String jetProp;

    public Plane(int seat, float engine, String colour, int bill, int missiles, boolean afterburner, String jetProp) {
        super(seat, engine, colour, 4000000);
        this.missiles = missiles;
        this.afterburner = afterburner;
        this.jetProp = jetProp;

    }
}
