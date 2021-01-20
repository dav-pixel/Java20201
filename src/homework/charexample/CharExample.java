package homework.charexample;

public class CharExample {
    void result(char[] array) {
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ', ' '};
        int beginIndex = 0;
        int endIndex = text.length - 1;
        while (beginIndex < endIndex && text[beginIndex] == ' ') {
            beginIndex++;
        }
        while (beginIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - beginIndex) + 1];
        int index = 0;
        for (int i = beginIndex; i < endIndex + 1; i++) {
            result[index++] = text[i];

        }
        for (int i = 0; i < result.length; i++) {

        }
        System.out.println(result);


    }

    void count(char[] array) {
        char[] text = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;

        for (int i = 0; i < text.length; i++) {

            if (text[i] == c) {
                count++;
            }

        }
        System.out.println("count of " + c);
        System.out.println(count);

    }

    void middleTwo(char[] array) {

        char[] text = {'b', 'o', 'l', 'o', 'l', 'a'};
        int x = text.length;
        System.out.print(text[x / 2]);
        System.out.print(text[x / 2 - 1]);

    }

    void trueOrfalse(char[] array) {

        char[] text = {'b', 'o', 'l', 'o', 'l', 'a'};
        if (array[array.length - 2] == 'l' && array[array.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
    }
      


        //        boolean bobthere = false;
//        char[] array = {'b','a','b','o','l','a'};
//        for (int i = 0; i < array.length-2; i++) {
//            if(array[i] == 'b' && array[i+2] == 'b' ){
//                bobthere=true;
//        }
//        }
//        System.out.println(bobthere);
        }


    }
