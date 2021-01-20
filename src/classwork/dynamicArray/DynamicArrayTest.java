package classwork.dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(12);
        da.add(15);
        da.add(42);
        da.add(18);
        da.add(6);
        da.add(9);
        da.add(66);
        da.add(63);
        da.add(35);
        da.add(647);
        da.add(15);
        da.add(68);
        da.print();
        System.out.println();
        int[] result= da.subArray(2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }


    }
}


