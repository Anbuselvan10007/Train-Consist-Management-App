import java.util.LinkedHashSet;
import java.util.Set;

public class Train {
    private final Set<String> formation;

    public Train() {
        formation = new LinkedHashSet<>();
    }

    public void attachBogie(String bogie) {
        formation.add(bogie);
    }

    public Set<String> getFormation() {
        return formation;
    }
}
