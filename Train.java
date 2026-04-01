import java.util.ArrayList;
import java.util.List;

public class Train {
    private final List<String> passengerBogies;

    public Train() {
        passengerBogies = new ArrayList<>();
    }

    public void addPassengerBogie(String bogieType) {
        passengerBogies.add(bogieType);
    }

    public boolean removePassengerBogie(String bogieType) {
        return passengerBogies.remove(bogieType);
    }

    public boolean hasPassengerBogie(String bogieType) {
        return passengerBogies.contains(bogieType);
    }

    public List<String> getPassengerBogies() {
        return passengerBogies;
    }
}
