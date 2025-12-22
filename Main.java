public class Main {
    public static void main(String[] args) {

        Event event1 = new Event(1, "Tech Conference", "2025-12-15", "Aiu");
        Event event2 = new Event(2, "Startup Meetup", "2025-12-10", "Aitu");

        Participant p1 = new Participant(1, "Ali", "ali@gmail.com");
        Participant p2 = new Participant(2, "Dias", "dias@gmail.com");
        Participant p3 = new Participant(3, "Amir", "amir@gmail.com");

        Organizer organizer = new Organizer(1, "Aibyn M", "Tech Group");

        event1.addParticipant(p1);
        event1.addParticipant(p2);
        event2.addParticipant(p3);


        System.out.println("(>-<)<3 EVENTS INFO (>-<)<3");
        event1.displayInfo();
        System.out.println();
        event2.displayInfo();
        System.out.println("\n(✯◡✯) ORGANIZER (✯◡✯)");
        organizer.displayInfo();


        System.out.println("\n(＾▽＾) COMPARISON (＾▽＾)");
        if (event1.getParticipantCount() > event2.getParticipantCount()) {
            System.out.println(event1.getTitle() + "Info: has more participants");
        } else {
            System.out.println(event2.getTitle() + "Info: has more participants");
        }

        if (event1.getDate().equals(event2.getDate())) {
            System.out.println("Info: Events are on the same date");
        } else {
            System.out.println("Info: Events are on different dates");
        }
    }
}
