package classwork.chapter8;

public class DynamicArrayForStudent {
    private Student[] students = new Student[10];
    private int size = 0;

    public void add(Student student){
        if(students.length == size){
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
//        for (int i = 0; i < students.length; i++) {
//            tmp[i] = students[i];
//
//        }
        System.arraycopy(students,0,tmp,0,students.length);
        students = tmp;
    }

    public  void searchByName(String name){
        for (int i = 0; i < size; i++) {
            if(students[i].getName().contains(name)){
                System.out.println(students[i]);
            }

        }
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);

        }
    }
}
