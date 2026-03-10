public class PersonalInformationCollection {
    private String firstName;
    private String lastName;
    private String identificationNumber;

    public PersonalInformationCollection(String firstName, String lastName, String identificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
    }

    public void getFirstName() {
        System.out.println(this.firstName);
    }
}
