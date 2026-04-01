public class Bogie {
    private final String bogieId;

    public Bogie(String bogieId) {
        this.bogieId = bogieId;
    }

    public String getBogieId() {
        return bogieId;
    }

    @Override
    public String toString() {
        return bogieId;
    }
}
