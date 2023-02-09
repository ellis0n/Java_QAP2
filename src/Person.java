public class Person {
    private String lastName;
    private String firstName;
    private Address address;

    public Person(String lastName, String firstName, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Address getAddress() {
        return address;
    }

    public String toString() {
        return firstName +" "+ lastName + ", " + address;
    }
}
