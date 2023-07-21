// import array list
import java.util.ArrayList;
import java.util.List;

// create a list with car and vehicle classes together garage contains all the vehicles

public class Garage {
    static List<Vehicle> listOfVehicles = new ArrayList<>();



    public static void addToList(Vehicle auto) {


        listOfVehicles.add(auto);
        System.out.println(String.format("Added vehicle %s to list", auto));

    }

    public static void removeFromList(Vehicle auto) {
        listOfVehicles.remove(auto);
        System.out.println(String.format("Removed individual vehicle %s from list", auto));
    }

    public static void emptyList(Vehicle auto) {
        listOfVehicles.clear();
        System.out.println(String.format("Empty vehicles %s from list", auto));

    }
    public static void removeByType(Vehicle auto) {

        System.out.println("Which vehicle type needs removing?");
        listOfVehicles.remove(auto);
        System.out.println(String.format("Removed type of vehicle %s from list", auto));

    }




}
