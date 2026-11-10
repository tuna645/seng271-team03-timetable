import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    private List<Course> courses;
    private List<Instructor> instructors;
    private List<Room> rooms;
    private Timetable timetable;
    private List<Session> unscheduledSessions;

    public Scheduler() {
        this.courses = new ArrayList<>();
        this.instructors = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.timetable = new Timetable();
        this.unscheduledSessions = new ArrayList<>();
    }

    public void generateTimetable() {
        scheduleFixedSessions();
        scheduleRemainingSessions();
    }

    public void scheduleFixedSessions() {
    }

    public void scheduleRemainingSessions() {
    }

    public boolean checkHardConstraints(Session session, TimeSlot slot, Room room) {
        return true;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public List<Session> getUnscheduledSessions() {
        return unscheduledSessions;
    }
}
