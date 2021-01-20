package homework.charexample;

public class CharExampleTest {
    public static void main(String[] args) {
        char[] text = {' ',' ','b','a','r','e','v',' ',' ',' '};
        CharExample ch = new CharExample();
        ch.result(text);
        System.out.println();
        ch.count(text);
        System.out.println();
        ch.middleTwo(text);
        System.out.println();
        ch.trueOrfalse(text);

    }
}
