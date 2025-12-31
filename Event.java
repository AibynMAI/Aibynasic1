import java.util.ArrayList;
import java.util.Objects;

public class Event {
    private String title;
    private String date;
    private String location;
    private Organizer organizer;
    private ArrayList<Participant> participants = new ArrayList<>();

    public Event(String title, String date, String location, Organizer organizer) {
        this.title = title;
        this.date = date;
        this.location = location;
        this.organizer = organizer;
    }

    public void addParticipant(Participant p) {
        participants.add(p);
    }

    public int getParticipantCount() {
        return participants.size();
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Event: " + title +
                ", Date: " + date +
                ", Location: " + location +
                ", Participants: " + participants.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event e = (Event) o;
        return title.equals(e.title) && date.equals(e.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, date);
    }
}
