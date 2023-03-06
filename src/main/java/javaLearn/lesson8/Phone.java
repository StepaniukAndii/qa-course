package javaLearn.lesson8;

public class Phone {
    private int cores;
    private String color;

    Phone() {
        System.out.println("kjsnlkjfnkjbnlkdbfn");
    }

    Phone(int cores) {
        this.cores = cores;
    }

    Phone(String color) {
        this.color = color;
    }

    Phone(int cores, String color) {
        System.out.println("jldbnlkjfdnb;kjfd;bn;kjf");
        this.color = color;
        this.cores = cores;
    }

    int getCores() {
        return cores;
    }

    public String getColor() {
        return color;
    }
}
