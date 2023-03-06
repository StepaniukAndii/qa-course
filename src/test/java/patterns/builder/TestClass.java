package patterns.builder;

public class TestClass {

    public static void main(String[] args) {

//        Person person = new Person("12", "kfmk", 12)

        Person p = new Person.Builder().withAge(12).build();

        Person pre = new Person.Builder().withAge(12).withHeight(123).build();

//        PersonLom p1 = new PersonLom("kmbf", kmkmb)
        PersonLom personLom = PersonLom.builder().email("hbhfkhbjknsbknb;a;kbjsn;kjfd").build();
//        System.out.println(personLom.getAge());
//        System.out.println(personLom.getHeight());
    }

    public void login(PersonLom personLom) {
        personLom.getEmail();
    }
}
