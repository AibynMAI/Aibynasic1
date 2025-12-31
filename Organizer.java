public class Organizer extends Person {
    private String organization;

    public Organizer(int id, String name, String email, String organization) {
        super(id, name, email);
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Organizer: " + name + ", Organization: " + organization;
    }

    @Override
    public String getRole() {
        return "Organizer";
    }
}
