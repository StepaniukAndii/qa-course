package javaLearn.lesson18;

import org.openqa.selenium.WebDriver;

import java.util.Objects;
import java.util.function.Consumer;

public class OOP extends OOPOveride {
    public WebDriver driver;

    public int a;
    protected int b;
    int c;
    private int d;

    public void assertEquals(int a, int b) {
        assert a == b;
    }

    void assertEquals(Integer a, Integer b) {
        assert Objects.equals(a, b);
    }

    protected void assertEquals(int a, Integer b) {
        assert Objects.equals(a, b);
    }

    @Override
    public void over() {
        System.out.println("fksmkfmv");
    }
}
