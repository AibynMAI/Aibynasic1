public class Participant extends Person {

    public Participant(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "Participant";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Participant)) return false;
        Participant p = (Participant) o;
        return email.equals(p.email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
}
