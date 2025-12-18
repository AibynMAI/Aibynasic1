public class Organizer {
    private int id;
    private String name;
    private String organization;

    public Organizer(int id, String name, String organization) {
        this.id = id;
        this.name = name;
        this.organization = organization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void displayInfo() {
        System.out.println("Organizer: " + name + ", Organization: " + organization);
    }
}

