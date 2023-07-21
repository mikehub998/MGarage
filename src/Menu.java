public class Menu {
    //show garage
    public static void run() {
    }

    public static void menu(){
        System.out.println("Welcome to the garage what do you want to do?");
        System.out.println("1: Add a vehicle to garage, 2: Delete vehicle from garage...");

        // Switch statement with int data type
        // Case
        if (Utility.returnText().equals("1")) {
            System.out.println("Adding car..");
            System.out.println("How many seats do you want in your car?");
            int seats = Utility.returnInt();

            System.out.println("What size engine do you want in your car?");
            Float engine = Utility.returnfloat();

            System.out.println("What colour is your car?");
            String colour = Utility.returnText();

            System.out.println("Would you like a boot?");
            Boolean boot = Utility.returnboolean();

            System.out.println("Would you like a car with wipers");
            Boolean wipers = Utility.returnboolean();

            Car car = new Car(seats, engine, colour, boot, wipers);




            System.out.println(Garage.listOfVehicles);


//            // Case
//            case 2:
//                dayString = "Tuesday";
//                break;
        }
    }
}