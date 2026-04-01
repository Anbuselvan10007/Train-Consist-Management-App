public class Main {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println();
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("====================================");

        Train train = new Train();

        train.addLastBogie("Engine");
        train.addLastBogie("Sleeper");
        train.addLastBogie("AC");
        train.addLastBogie("Cargo");
        train.addLastBogie("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(train.getConsist());
        System.out.println();

        train.insertBogie(2, "Pantry Car");
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(train.getConsist());
        System.out.println();

        train.removeFirstBogie();
        train.removeLastBogie();
        System.out.println("After Removing First and Last Bogie:");
        System.out.println(train.getConsist());
        System.out.println();

        System.out.println("UC4 ordered consist operations completed...");
    }
}
