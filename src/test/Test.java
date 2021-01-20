package test;        // Объекты допускается передавать методам
        // в качестве параметров

public class Test {
    int a,b;

    Test(int i,int j){
        a = i;
        b = j;
    }
    // возвратить логическое значение true, если в
    // качестве параметра о указан вызывающий объект
    boolean equalTo(Test o){
        if(o.a == a && o.b == b) return true;
        else  return  false;
    }
}
