package lesson16;

public class FunctionalInterface {

    public static void main(String[] args) {

        Class cl = new Class();
        cl.sum(1, 2);

//        or

        IFunIn iFunIn = new IFunIn() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        iFunIn.sum(1, 2);

        IFunIn iFunIn2 = (a, b) -> a + b;
        iFunIn.sum(1, 2);
    }

}

@java.lang.FunctionalInterface
interface IFunIn {
    int sum(int a, int b);
}

class Class implements IFunIn {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
