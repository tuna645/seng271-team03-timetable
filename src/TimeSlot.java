import java.util.Objects;

public class TimeSlot {
    private String day;
    private int startHour;

    public TimeSlot(String day, int startHour) {
        this.day = day;
        this.startHour = startHour;
    }

    public String getDay() {
        return day;
    }

    public int getStartHour() {
        return startHour;
    }

    @Override
    public String toString() {
        return String.format("%s %02d:00-%02d:00", day, startHour, startHour + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeSlot timeSlot = (TimeSlot) o;
        return startHour == timeSlot.startHour && Objects.equals(day, timeSlot.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, startHour);
    }
}
