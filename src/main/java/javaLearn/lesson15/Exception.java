package javaLearn.lesson15;

public class Exception {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(4000);
    }

    public static void sleep() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void newException() throws java.lang.Exception {
        throw new java.lang.Exception();
    }

    public void tryCatchFinally() {
        try {
            newException();
        } catch (java.lang.Exception e) {
            System.out.println("what");
        } finally {
            System.out.println("I WILL FOREVER");
        }
    }
}
