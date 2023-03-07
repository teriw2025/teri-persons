public class Person {

    //properties
    private String firstName;
    private String lastName;
    private int age;

    //constructors
    public Person(String fN, String lN, int userAge){
        firstName = fN;
        lastName = lN;
        age = userAge;

    }

    //methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "firstname: " + firstName + " lastname: " + lastName + " age: " + age;
    }
    
}
