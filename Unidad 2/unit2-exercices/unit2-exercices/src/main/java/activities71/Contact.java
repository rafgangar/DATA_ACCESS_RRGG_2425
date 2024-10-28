package activities71;

public class Contact {
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String description;

    public Contact(String name, String surname, String email, String phoneNumber, String description) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.description = description;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
