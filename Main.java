public class Main {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println();
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("===================================");

        Train train = new Train();

        train.addPassengerBogie("Sleeper");
        train.addPassengerBogie("AC Chair");
        train.addPassengerBogie("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + train.getPassengerBogies());
        System.out.println();

        train.removePassengerBogie("AC Chair");
        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + train.getPassengerBogies());
        System.out.println();

        System.out.println("Checking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper?: " + train.hasPassengerBogie("Sleeper"));
        System.out.println();

        System.out.println("Final Train Passenger Consist:");
        System.out.println(train.getPassengerBogies());
        System.out.println();
        System.out.println("UC2 operations completed successfully...");
    }
}
