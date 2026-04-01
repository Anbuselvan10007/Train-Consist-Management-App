import java.util.HashMap;
import java.util.Map;

public class Train {
    private final Map<String, Integer> capacityMap;

    public Train() {
        capacityMap = new HashMap<>();
    }

    public void addBogieCapacity(String bogie, int capacity) {
        capacityMap.put(bogie, capacity);
    }

    public Map<String, Integer> getCapacityMap() {
        return capacityMap;
    }
}
