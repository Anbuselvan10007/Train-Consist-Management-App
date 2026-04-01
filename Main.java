public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("========================================");
        System.out.println();

        Train train = new Train();

        train.addBogieCapacity("Sleeper", 72);
        train.addBogieCapacity("AC Chair", 56);
        train.addBogieCapacity("First Class", 24);
        train.addBogieCapacity("Cargo", 120);

        System.out.println("Bogie Capacity Details:");
        for (var entry : train.getCapacityMap().entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
        System.out.println("UC6 bogie-capacity mapping completed...");
    }
}
