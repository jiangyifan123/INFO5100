public class Person {
    private String name;
    private PersonType type = PersonType.Person;
    public String getName() {
        return name;
    }

    Person(String name){
        this.name = name;
    }
}
