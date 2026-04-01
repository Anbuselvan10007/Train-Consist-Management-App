public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("========================================");
        System.out.println();

        Train train = new Train();

        train.addBogie(new Bogie("Sleeper", 72));
        train.addBogie(new Bogie("AC Chair", 56));
        train.addBogie(new Bogie("First Class", 24));
        train.addBogie(new Bogie("General", 90));

        System.out.println("Before Sorting:");
        for (Bogie bogie : train.getBogies()) {
            System.out.println(bogie);
        }
        System.out.println();

        train.getBogies().sort(Bogie.byCapacity());

        System.out.println("After Sorting by Capacity:");
        for (Bogie bogie : train.getBogies()) {
            System.out.println(bogie);
        }
        System.out.println();
        System.out.println("UC7 sorting completed...");
    }
}
