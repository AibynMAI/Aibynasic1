import java.util.ArrayList;

public class Event {
    private int id;
    private String title;
    private String date;
    private String location;
    private ArrayList<Participant> participants;

    public Event(int id, String title, String date, String location) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.location = location;
        this.participants = new ArrayList<>();
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public int getParticipantCount() {
        return participants.size();
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Event: " + title);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
        System.out.println("Participants count: " + participants.size());

        for (Participant p : participants) {
            p.displayInfo();
        }
    }
}
