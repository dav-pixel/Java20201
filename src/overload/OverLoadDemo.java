package overload;

public class OverLoadDemo {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }
    // Перегружаемый метод, проверяющий наличие
    // одного целочисленного параметра
    void tes(int a){
        System.out.println("a: " + a);
    }
    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a,int b){
        System.out.println("a и Ь: " + a + " " + b);
    }
    // Перегружаемый метод, проверяющий наличие
    //параметра типа douЫe
    double test(double a){
        System.out.println("double a:" + a);
        return a*a;
    }
}

