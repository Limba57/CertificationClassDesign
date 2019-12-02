package ThisKeywordVSThisCall;

public class Person {

    private String firstname;
    private String lastname;

    public Person() {
        this("Seb", "Jean");
    }

    public Person(String firstname, String last) {
        // this(); // no compilation: no up constructors
        this.firstname = firstname;
        lastname = last;
    }

    public static void main(String[] args) {



    }
}
