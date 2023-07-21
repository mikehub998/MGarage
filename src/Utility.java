import java.util.Scanner;


    public class Utility {
        int num1;
        int num2;
        String operation;
        // Charlie - does this need to be static as you're using it as an object
        static Scanner scan = new Scanner(System.in);


        public static int returnInt() {
            return Integer.parseInt(scan.nextLine().trim());

        }

        public static String returnText() {
            if (scan.hasNextLine()) return scan.nextLine();
          return null;
        }


        public static Float returnfloat() {
            return Float.parseFloat(scan.nextLine());
        }

        public static Boolean returnboolean() {

            if (scan.nextLine().trim().equals("yes")) {
                System.out.println("you have a boot");
                return true;
            } else {
                System.out.println("no boot then");
            return false;


        }
    }

    }
