public class Main {
    public static void main(String[] args) {
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("========================================");
        System.out.println();

        Train train = new Train();

        train.attachBogie("Engine");
        train.attachBogie("Sleeper");
        train.attachBogie("Cargo");
        train.attachBogie("Guard");
        train.attachBogie("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(train.getFormation());
        System.out.println();

        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        System.out.println();
        System.out.println("UC5 formation setup completed...");
    }
}
