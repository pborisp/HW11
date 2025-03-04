import org.w3c.dom.DOMStringList;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
    }

}
