package educationCenter;

public interface Commands {
    String Exit = "0";
    String ADD_SUDENTS = "1";
    String ADD_LESSONS = "2";
    String PRINT_STUDENTS = "3";
    String PRINT_LESSONS = "4";
    String SEARCH_STUDENT_BY_NAME = "5";
    String SEARCH_LESSON_BY_NAME = "6";
    String SEARCH_STUDENT_BY_LESSON_NAME = "7";
    String CHANGE_STUDENT_LESSON = "8";
    String CHANGE_STUDENT_PHONE = "9";

    static void printCommands(){
        System.out.println("Pleace input " + Exit + " for Exit");
        System.out.println("Pleace input " + ADD_SUDENTS + " for ADD_SUDENTS");
        System.out.println("Pleace input " + ADD_LESSONS + " for ADD_LESSONS");
        System.out.println("Pleace input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Pleace input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Pleace input " + SEARCH_STUDENT_BY_NAME + " for SEARCH_STUDENT_BY_NAME");
        System.out.println("Please input " + SEARCH_LESSON_BY_NAME + " for SEARCH_LESSON_BY_NAME");
        System.out.println("Please input " + SEARCH_STUDENT_BY_LESSON_NAME + " for SEARCH_STUDENT_BY_LESSON_NAME");
        System.out.println("Please input " + CHANGE_STUDENT_LESSON + " for CHANGE_STUDENT_LESSON");
        System.out.println("Please input " + CHANGE_STUDENT_PHONE + " for CHANGE_STUDENT_PHONE");
    }

    }



