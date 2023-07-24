//create a Menu class
public class Menu {

// create variables to run and strings to action further commands
    static String action;

    static String pressNumber = "Press the corresponding number to action a menu";

    public static void run() {
        menu();
    }

    public static void exitMenu() {
        System.out.println("Exiting");
    }


    public static void menu() {
        action = firstMenu();
        firstSelection(action);
    }

    public static void viewGarage() {
        action = seeVehicles();
        whichVehicles(action);
    }

    public static void sortCar() {
        action = carMenu();
        editCar(action);
    }

    public static String firstMenu() {
        String menuText = "Welcome to the garage what do you want to do?\n" +
                "1: Add a vehicle to garage\n" +
                "2: Delete vehicle from garage\n" +
                "3: Clear garage of vehicles\n" +
                "4: Remove vehicle by type\n" +
                "5: Exit\n";

        System.out.println(menuText + pressNumber);
        return Utility.returnText();
    }

    public static void firstSelection(String selection) {
        switch (selection.toLowerCase()) {
            case "1":
                viewGarage();
                break;
            case "2":
                System.out.println("nothing");
                break;
            case "3":
                System.out.println("This function is still a work in progress");
                break;
            case "4":
                System.out.println("This function is still a work in progress");
                break;
            case "5":
                exitMenu();
                break;

        }
    }

    public static String seeVehicles() {
        String whichVehicleMenu = "What vehicle would you like to add?\n" +
                "1: Car\n" +
                "2: Plane\n" +
                "3: Bike\n" +
                "4: Return to Opening Garage Menu\n";


        System.out.println(whichVehicleMenu + pressNumber);
        return Utility.returnText();

    }

    public static void whichVehicles(String selection) {
        switch (selection.toLowerCase()) {
            case "1":
                System.out.println("Adding a car");

                System.out.println("How many seats do you want in your car?");
                int seats = Utility.returnInt();

                System.out.println("What size engine do you want in your car?");
                Float engine = Utility.returnfloat();

                System.out.println("What colour is your car?");
                String colour = Utility.returnText();

                System.out.println("How much does it cost?\n" +
                        "£ ");
                int bill = Utility.returnInt();

                System.out.println("Would you like a boot?");
                Boolean boot = Utility.returnboolean();

                System.out.println("Would you like a car with wipers");
                Boolean wipers = Utility.returnboolean();

                Car car = new Car(seats, engine, colour, bill, boot, wipers);
                break;

            case "2":
                System.out.println("Adding a Plane");

                System.out.println("How many seats are in your plane?");
                int seats2 = Utility.returnInt();

                System.out.println("What size engine is in your plane?");
                Float engine2 = Utility.returnfloat();

                System.out.println("What colour is your plane?");
                String colour2 = Utility.returnText();

                System.out.println("How much does it cost?");
                int bill2 = Utility.returnInt();

                System.out.println("How many missile are on your plane?");
                int missiles = Utility.returnInt();

                System.out.println("Does your plane have an afterburner");
                Boolean afterburner = Utility.returnboolean();

                System.out.println("Is it a jet or propeller driven aircraft?");
                String jetProp = Utility.returnText();

                Plane plane = new Plane(seats2, engine2, colour2, bill2, missiles, afterburner, jetProp);
                break;

            case "3":
                System.out.println("Adding a bike");

                System.out.println("How many seats are on your bike?");
                int seats3 = Utility.returnInt();

                System.out.println("What size engine is on your bike?");
                Float engine3 = Utility.returnfloat();

                System.out.println("What colour is your bike?");
                String colour3 = Utility.returnText();

                System.out.println("How much does it cost?");
                int bill3 = Utility.returnInt();

                System.out.println("Does it have a sidecar?");
                Boolean sidecar = Utility.returnboolean();

                System.out.println("How many passengers can it carry?");
                int passengers = Utility.returnInt();

                Bike bike = new Bike(seats3, engine3, colour3, bill3, sidecar, passengers);
                break;


            case "4":
                firstMenu();
                break;
        }
    }

    public static String carMenu() {
        String carString = "How do you need to edit the car?\n" +
                "1: Add a car\n" +
                "2: Remove a car\n" +
                "3: Fix a car\n" +
                "4: Remove all cars\n" +
                "5: Return to Opening Garage Menu\n";

        System.out.println(carString + pressNumber);
        return Utility.returnText();
    }

    public static void editCar(String selection) {
        switch (selection.toLowerCase()) {
            case "1":
                seeVehicles();
                break;
            case "2":
                System.out.println("still working on how to remove");
                break;
            case "3":
                System.out.println("still working on how to remove");
                break;
            case "4":
                System.out.println("still working how to remove all cars");
                break;
            case "5":
                firstMenu();
                break;
        }
        System.out.println(Garage.listOfVehicles);
    }
}

