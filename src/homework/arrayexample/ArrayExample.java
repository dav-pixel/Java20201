package homework.arrayexample;

public class ArrayExample {
    void printIsExists(int[] array) {
        int x = 44;
        boolean isExists = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                isExists = true;
            }
        }
        System.out.println(isExists);

    }


    void index(int[] array) {
        int x = 44;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
            }
        }
        System.out.println(index);

    }

    void pointIndex(int[] array) {
        int index = 4;
        if (index >= 0 && index < array.length) {
            System.out.println(array[index]);
        } else {
            System.out.println("Please input another index");
        }


    }

    void sameElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + " թիվը կրկնվում է");
                }
            }
        }
    }

    void sortArray1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();


    }

    void sortArray2(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


    }
    void secMax(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        System.out.println(array[array.length - 2]);

        int max = array[0];
        int secMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                secMax = max;
                max = array[i];
            } else {
                if (array[i] != max && array[i] > secMax) {
                    secMax = array[i];
                }
            }
        }
        System.out.println(secMax);


    }
}


