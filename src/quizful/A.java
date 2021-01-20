package quizful;

public class A {
    {
        System.out.println("1");
    }
    A(){
        System.out.println("2");
    }
    static {
        System.out.println("3");
    }
    {
        System.out.println("4");
    }

    public static void main(String[] args) {
        new A();
    }

    }

