import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("========================================");
        System.out.println();

        Train train = new Train();

        train.addBogie(new Bogie("Sleeper", 72));
        train.addBogie(new Bogie("AC Chair", 56));
        train.addBogie(new Bogie("First Class", 24));
        train.addBogie(new Bogie("General", 90));

        System.out.println("All Bogies:");
        for (Bogie bogie : train.getBogies()) {
            System.out.println(bogie);
        }
        System.out.println();

        List<Bogie> filteredBogies = train.getBogies()
                .stream()
                .filter(bogie -> bogie.getCapacity() > 60)
                .toList();

        System.out.println("Filtered Bogies (Capacity > 60):");
        for (Bogie bogie : filteredBogies) {
            System.out.println(bogie);
        }
        System.out.println();
        System.out.println("UC8 filtering completed...");
    }
}
