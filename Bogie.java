import java.util.Comparator;

public class Bogie {
    private final String name;
    private final int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public static Comparator<Bogie> byCapacity() {
        return Comparator.comparingInt(Bogie::getCapacity);
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}
