package educationCenter.storage;

import educationCenter.model.Lesson;
import educationCenter.model.Student;

public class StudentStorage {

    private Student[] students = new Student[10];
    private int size = 0;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);

        }
    }

    public void searchByNameOrSurnam(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i].getName().contains(name) || students[i].getSurname().contains(name)) {
                System.out.println(students[i]);
            }
        }
    }

    public void searchByLesson(Lesson byName) {
        for (int i = 0; i < size; i++) {
            if (students[i].getLesson().equals(byName)) {
                System.out.println(students[i]);
            }
        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return  students[i];
            }
        }
        return null;
    }
}

