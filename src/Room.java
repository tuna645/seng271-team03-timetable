public class Room {
    private String id;
    private String type;
    private int capacity;

    public Room(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public boolean isSuitableFor(Session session) {
        if (this.capacity < session.getCourse().getStudents()) {
            return false;
        }

        if (session.getType() == 'T' && !this.type.equalsIgnoreCase("Classroom")) {
            return false;
        }
        if (session.getType() == 'L' && !this.type.equalsIgnoreCase("Laboratory")) {
            return false;
        }

        return true;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}
