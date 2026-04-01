public class Main {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println();
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("============================");

        Train train = new Train();

        train.addBogieId("BG101");
        train.addBogieId("BG102");
        train.addBogieId("BG103");
        train.addBogieId("BG104");
        train.addBogieId("BG101");
        train.addBogieId("BG102");

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(train.getBogieIds());
        System.out.println();

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println("UC3 uniqueness validation completed...");
    }
}
