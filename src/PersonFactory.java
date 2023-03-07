import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {

        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        for(int i = 0; i < allPersons.size(); i++){
            if(person.getLastName().compareTo(allPersons.get(i).getLastName()) == -1){
                allPersons.add(i, person);
            }
            else if(person.getLastName().compareTo(allPersons.get(i).getLastName()) == 1){
                allPersons.add(i+1, person);
            }
        }

    }

    public ArrayList<Person> under18() {
        ArrayList<Person> under = new ArrayList<>();
        for(int i = 0; i < allPersons.size(); i++){
            if(allPersons.get(i).getAge() <= 18){
                under.add(allPersons.get(i));
            }
        }
        return under;
    }

    public boolean checkLastName(String lastName) {
        for(int i = 0; i < allPersons.size(); i++){
            if(allPersons.get(i).getLastName().equals(lastName)){
                return true;
            }
        }
        return false;

    }
}
