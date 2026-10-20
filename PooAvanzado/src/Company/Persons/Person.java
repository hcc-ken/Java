package Company.Persons;

public class Person {
    protected String name;
    protected int age;
    protected int ID;

    final String DEFAULT_NAME = "";
    final int DEFAULT_AGE = 0;
    final int DEFAULT_ID = 0;

    public Person() {
        name = DEFAULT_NAME;
        age = DEFAULT_AGE;
        ID = DEFAULT_ID;
    }

    public Person(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
