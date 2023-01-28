package lesson18;

import java.util.Objects;

public class OOP extends OOPOveride {

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
