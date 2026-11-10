import java.util.ArrayList;
import java.util.List;

public class Timetable {
    private List<Session> scheduledSessions;

    public Timetable() {
        this.scheduledSessions = new ArrayList<>();
    }

    public void assign(Session session, TimeSlot slot, Room room) {
        session.setAssignedSlot(slot);
        session.setAssignedRoom(room);
        if (!scheduledSessions.contains(session)) {
            scheduledSessions.add(session);
        }
    }

    public void remove(Session session) {
        session.setAssignedSlot(null);
        session.setAssignedRoom(null);
        scheduledSessions.remove(session);
    }

    
    public boolean isRoomFree(Room room, TimeSlot slot, int hours) {
        for (Session s : scheduledSessions) {
            if (s.getAssignedRoom() != null && s.getAssignedRoom().getId().equals(room.getId())) {
                TimeSlot assignedSlot = s.getAssignedSlot();
                if (assignedSlot != null && assignedSlot.getDay().equalsIgnoreCase(slot.getDay())) {
                    int existingStart = assignedSlot.getStartHour();
                    int existingEnd = existingStart + s.getHours();
                    int newStart = slot.getStartHour();
                    int newEnd = newStart + hours;
                    if (Math.max(existingStart, newStart) < Math.min(existingEnd, newEnd)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    
    public boolean isInstructorFree(Instructor instructor, TimeSlot slot, int hours) {
        for (Session s : scheduledSessions) {
            if (s.getCourse().getInstructorId().equals(instructor.getId())) {
                TimeSlot assignedSlot = s.getAssignedSlot();
                if (assignedSlot != null && assignedSlot.getDay().equalsIgnoreCase(slot.getDay())) {
                    int existingStart = assignedSlot.getStartHour();
                    int existingEnd = existingStart + s.getHours();
                    int newStart = slot.getStartHour();
                    int newEnd = newStart + hours;
                    if (Math.max(existingStart, newStart) < Math.min(existingEnd, newEnd)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    
    public boolean isYearGroupFree(int year, TimeSlot slot, int hours) {
        for (Session s : scheduledSessions) {
            if (s.getCourse().getYear() == year) {
                TimeSlot assignedSlot = s.getAssignedSlot();
                if (assignedSlot != null && assignedSlot.getDay().equalsIgnoreCase(slot.getDay())) {
                    int existingStart = assignedSlot.getStartHour();
                    int existingEnd = existingStart + s.getHours();
                    int newStart = slot.getStartHour();
                    int newEnd = newStart + hours;
                    if (Math.max(existingStart, newStart) < Math.min(existingEnd, newEnd)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public List<Session> getScheduledSessions() {
        return scheduledSessions;
    }
}
