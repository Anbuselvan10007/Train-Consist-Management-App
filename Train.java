import java.util.LinkedList;
import java.util.List;

public class Train {
    private final LinkedList<String> consist;

    public Train() {
        consist = new LinkedList<>();
    }

    public void addFirstBogie(String bogie) {
        consist.addFirst(bogie);
    }

    public void addLastBogie(String bogie) {
        consist.addLast(bogie);
    }

    public void insertBogie(int index, String bogie) {
        consist.add(index, bogie);
    }

    public void removeFirstBogie() {
        consist.removeFirst();
    }

    public void removeLastBogie() {
        consist.removeLast();
    }

    public List<String> getConsist() {
        return consist;
    }
}
