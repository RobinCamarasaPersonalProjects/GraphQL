public class PersonRepository {

    private final List<Person> persons;

    public LinkRepository() {
        persons = new ArrayList<>();
        //add some links to start off with
        persons.add(new Person("Robin", "men"));
        persons.add(new Person("Sylvain", "men"));
    }

    public List<Person> getAllPerson() {
        return persons;
    }

    public void savePerson(Person person) {
        persons.add(person);
    }
}