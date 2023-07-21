public class Vehicle {
    public int seat;

    public float engine;

    public String colour;

    public int bill;



    public Vehicle(int seat, float engine, String colour, int bill) {
        this.seat = seat;
        this.engine = engine;
        this.colour = colour;
        this.bill = bill;

        Garage.addToList(this);




    }
}
