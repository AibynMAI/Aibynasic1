import java.util.ArrayList;
import java.util.Comparator;

public class EventManager {
    private ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event e) {
        events.add(e);
    }

    // SEARCH
    public Event findByTitle(String title) {
        for (Event e : events) {
            if (e.getTitle().equalsIgnoreCase(title)) {
                return e;
            }
        }
        return null;
    }

    // FILTER
    public ArrayList<Event> filterByLocation(String location) {
        ArrayList<Event> result = new ArrayList<>();
        for (Event e : events) {
            if (e.getLocation().equalsIgnoreCase(location)) {
                result.add(e);
            }
        }
        return result;
    }

    // SORT
    public void sortByParticipants() {
        events.sort(Comparator.comparingInt(Event::getParticipantCount));
    }

    public void showAll() {
        for (Event e : events) {
            System.out.println(e);
        }
    }
}
