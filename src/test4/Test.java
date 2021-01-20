package test4;

public class Test {
    int a;
    Test(int i){
         a=i;

    }
    Test incriByten(){
        Test temp = new Test(a+10);
        return temp;
    }

}
