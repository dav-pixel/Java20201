package educationCenter.exeption;

public class DuplicateLessonExeption extends Exception {
    public DuplicateLessonExeption() {
    }

    public DuplicateLessonExeption(String message) {
        super(message);
    }

    public DuplicateLessonExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateLessonExeption(Throwable cause) {
        super(cause);
    }

    public DuplicateLessonExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
