import java.util.ArrayList;
import java.util.List;

public class Train {
    private final List<Bogie> bogies;

    public Train() {
        bogies = new ArrayList<>();
    }

    public List<Bogie> getBogies() {
        return bogies;
    }

    public void displayInitialSummary() {
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial bogie count: " + bogies.size());
    }
}
