public class Main {
    public static void main(String[] args) {

        Organizer org = new Organizer(1, "Dias", "dias@mail.com", "TechOrg");

        Participant p1 = new Participant(1, "Ali", "ali@mail.com");
        Participant p2 = new Participant(2, "Amir", "amir@mail.com");

        Event e1 = new Event("Tech Conference", "2026-01-6", "MVS", org);
        Event e2 = new Event("Startup Meetup", "2026-01-5", "Aitu", org);

        e1.addParticipant(p1);
        e1.addParticipant(p2);

        EventManager manager = new EventManager();
        manager.addEvent(e1);
        manager.addEvent(e2);

        System.out.println("=== ALL EVENTS ===");
        manager.showAll();

        System.out.println("\n=== ORGANIZER ===");
        System.out.println(org);


        System.out.println("\n=== SEARCH ===");
        System.out.println(manager.findByTitle("Tech Conference"));

        System.out.println("\n=== FILTER (MVS) ===");
        for (Event e : manager.filterByLocation("MVS")) {
            System.out.println(e);
        }

        System.out.println("\n=== SORT ===");
        manager.sortByParticipants();
        manager.showAll();
    }
}
