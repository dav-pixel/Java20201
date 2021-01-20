package educationCenter;

import educationCenter.exeption.DuplicateLessonExeption;
import educationCenter.model.Lesson;
import educationCenter.model.Student;
import educationCenter.storage.LessonStorage;
import educationCenter.storage.StudentStorage;

import java.util.Scanner;

public class EducationCenter implements Commands {

    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case Exit:
                    isRun = false;
                    break;
                case ADD_SUDENTS:
                    addStudent();
                    break;
                case ADD_LESSONS:
                    addLesson();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case SEARCH_STUDENT_BY_NAME:
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    studentStorage.searchByNameOrSurnam(name);
                    break;
                case SEARCH_LESSON_BY_NAME:
                    System.out.println("Please input name");
                    String lessonName = scanner.nextLine();
                    lessonStorage.searchByName(lessonName);
                    break;

                case SEARCH_STUDENT_BY_LESSON_NAME:
                    searchStudentByLesson();
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLesson();
                    break;
                case CHANGE_STUDENT_PHONE:
                    changeStudentPhone();
                    break;

                default:
                    System.out.println("Wrong Command!!!");


            }
        }
    }

    private static void changeStudentPhone() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            System.out.println("Please input new phone");
            String phone = scanner.nextLine();
            student.setPhone(phone);
        } else {
            System.out.println("student does not exists");
        }

    }

    private static void changeStudentLesson() {
        System.out.println("Please input stutend's email");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            System.out.println("Please choos new lesson");
            lessonStorage.printNames();
            String lessonName = scanner.nextLine();
            Lesson lesson = lessonStorage.getByName(lessonName);
            if (lesson != null) {
                student.setLesson(lesson);
                System.out.println("Student lesson was changed");


            } else {
                System.out.println("Student does not exists");
            }

        } else {
            System.out.println("lesson does not exists");

        }
    }


    private static void searchStudentByLesson() {
        System.out.println("Please input lesson name");
        String lessonName = scanner.nextLine();
        Lesson byName = lessonStorage.getByName(lessonName);
        if (byName == null) {
            System.out.println("lesson does not exists");
        } else {
            studentStorage.searchByLesson(byName);
        }
    }


    private static void addLesson() {
        System.out.println("Please name,duration,price,lecturarName");
        try {
            String lessonDataStr = scanner.nextLine();
            String[] lessonData = lessonDataStr.split(",");

                if (lessonData.length == 4) {
                    String name = lessonData[0];
                    int duration = Integer.parseInt(lessonData[1]);
                    double price = Double.parseDouble(lessonData[2]);
                    String lecturarName = lessonData[3];
                    Lesson lesson = new Lesson(name, duration, price, lecturarName);
                    lessonStorage.add(lesson);
                    System.out.println("Lesson was added!!");

                } else {
                    System.out.println("Please input valid data!!!");
                    addLesson();
                }


        }catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Incorrect value! Please try again");
            addLesson();
        }catch (DuplicateLessonExeption e){
            System.out.println(e.getMessage());
        }
    }

    private static void addStudent() {
        if (lessonStorage.isEmpty()) {
            System.out.println("Please add lesson first");
            addLesson();
        }
        try {

                System.out.println("Please select lesson name from list");
                lessonStorage.printNames();
                String lessonName = scanner.nextLine();
                Lesson lesson = lessonStorage.getByName(lessonName);
                if (lesson == null) {
                    System.out.println("Please select lesson from list");
                    addStudent();
                } else {
                    System.out.println("Pleace input name,surname,email,phone");
                    String studentDataStr = scanner.nextLine();
                    String[] studentData = studentDataStr.split(",");
                    Student byEmail = studentStorage.getByEmail(studentData[3]);
                    if (byEmail != null) {
                        System.out.println("Duplicate student!");
                        addStudent();
                    }

                    Student student = new Student(studentData[0], studentData[1], studentData[2], studentData[3], lesson);
                    studentStorage.add(student);
                    System.out.println("Student was added!!");

                }


        }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Invalid data!please try again ");
            addStudent();
        }
    }


}
