package lesson8;

public class Phone {
    private int cores;
    private String color;

    Phone() {

    }

    Phone(int cores) {
        this.cores = cores;
    }

    Phone(String color) {
        this.color = color;
    }

    Phone(int cores, String color) {
        this.color = color;
        this.cores = cores;
    }

    public int getCores() {
        return cores;
    }

    public String getColor() {
        return color;
    }
}
