package lesson13;

public abstract class Man implements Person {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public void head() {

    }

    @Override
    public void body() {

    }

    @Override
    public void lags() {

    }
}
