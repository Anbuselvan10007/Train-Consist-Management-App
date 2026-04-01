import java.util.ArrayList;
import java.util.List;

public class Train {
    private final List<Bogie> bogies;

    public Train() {
        bogies = new ArrayList<>();
    }

    public void addBogie(Bogie bogie) {
        bogies.add(bogie);
    }

    public List<Bogie> getBogies() {
        return bogies;
    }
}
