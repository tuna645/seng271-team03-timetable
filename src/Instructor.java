import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String id;
    private String name;
    private List<TimeSlot> unavailableSlots;
    private String preferredSlots;

    public Instructor(String id, String name, String preferredSlots) {
        this.id = id;
        this.name = name;
        this.preferredSlots = preferredSlots;
        this.unavailableSlots = new ArrayList<>();
    }

    public boolean isAvailable(TimeSlot slot) {
        for (TimeSlot unavailable : unavailableSlots) {
            if (unavailable.equals(slot)) {
                return false;
            }
        }
        return true;
    }

    public void addUnavailableSlot(TimeSlot slot) {
        this.unavailableSlots.add(slot);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<TimeSlot> getUnavailableSlots() {
        return unavailableSlots;
    }

    public String getPreferredSlots() {
        return preferredSlots;
    }
}
