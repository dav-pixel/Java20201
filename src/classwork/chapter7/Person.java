package classwork.chapter7;

public class Person {

    public static  String  country = "Armenia";

    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  static void meth(){
        System.out.println(country);
        System.out.println("kuku");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
