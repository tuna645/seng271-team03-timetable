public class Session {
    private Course course;
    private char type;
    private int hours;
    private TimeSlot assignedSlot;
    private Room assignedRoom;

    public Session(Course course, char type, int hours) {
        this.course = course;
        this.type = type;
        this.hours = hours;
        this.assignedSlot = null;
        this.assignedRoom = null;
    }

    public String getName() {
        return course.getCode() + "-" + type;
    }

    public boolean isScheduled() {
        return assignedSlot != null && assignedRoom != null;
    }

    public Course getCourse() {
        return course;
    }

    public char getType() {
        return type;
    }

    public int getHours() {
        return hours;
    }

    public TimeSlot getAssignedSlot() {
        return assignedSlot;
    }

    public void setAssignedSlot(TimeSlot assignedSlot) {
        this.assignedSlot = assignedSlot;
    }

    public Room getAssignedRoom() {
        return assignedRoom;
    }

    public void setAssignedRoom(Room assignedRoom) {
        this.assignedRoom = assignedRoom;
    }
}
