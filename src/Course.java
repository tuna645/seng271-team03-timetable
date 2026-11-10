import java.util.ArrayList;
import java.util.List;

public class Course {
    private String code;
    private String title;
    private int year;
    private String instructorId;
    private int theoryHours;
    private int labHours;
    private int students;
    private List<Session> sessions;

    public Course(String code, String title, int year, String instructorId, int theoryHours, int labHours, int students) {
        this.code = code;
        this.title = title;
        this.year = year;
        this.instructorId = instructorId;
        this.theoryHours = theoryHours;
        this.labHours = labHours;
        this.students = students;
        this.sessions = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public int getTheoryHours() {
        return theoryHours;
    }

    public int getLabHours() {
        return labHours;
    }

    public int getStudents() {
        return students;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void addSession(Session session) {
        this.sessions.add(session);
    }
}
