public class Menu {
    //show garage

    public static void menuRun(){
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
        }

        if (Utility.returnText().equals("2")) {
            System.out.println("Adding Plane..");

            System.out.println("How many seats are in your plane?");
            int seats2 = Utility.returnInt();

            System.out.println("What size engine is in your plane?");
            Float engine2 = Utility.returnfloat();

            System.out.println("What colour is your plane?");
            String colour2 = Utility.returnText();

            System.out.println("How many missile are on your plane?");
            int missiles = Utility.returnInt();

            System.out.println("Does your plane have an afterburner");
            Boolean afterburner = Utility.returnboolean();

            System.out.println("Is it a jet or propellor driven aircraft?");
            String jetProp = Utility.returnText();

            Plane plane = new Plane(seats2, engine2, colour2, missiles, afterburner, jetProp);
        }


        if (Utility.returnText().equals("1")) {
            System.out.println("Adding bike..");

            System.out.println("How many seats are on your bike?");
            int seats3 = Utility.returnInt();

            System.out.println("What size engine is on your bike?");
            Float engine3 = Utility.returnfloat();

            System.out.println("What colour is your bike?");
            String colour3 = Utility.returnText();

            System.out.println("Would you like a boot?");
            Boolean sidecar = Utility.returnboolean();

            System.out.println("Would you like a car with wipers");
            int passengers = Utility.returnInt();

            Bike bike = new Bike(seats3, engine3, colour3, sidecar, passengers);
        }

        else System.out.println(("nothing added"));




            System.out.println(Garage.listOfVehicles);


//            // Case
//            case 2:
//                dayString = "Tuesday";
//                break;
        }
    }

