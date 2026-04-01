import java.util.HashSet;
import java.util.Set;

public class Train {
    private final Set<String> bogieIds;

    public Train() {
        bogieIds = new HashSet<>();
    }

    public void addBogieId(String bogieId) {
        bogieIds.add(bogieId);
    }

    public Set<String> getBogieIds() {
        return bogieIds;
    }
}
