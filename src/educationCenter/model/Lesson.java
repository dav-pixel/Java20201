package educationCenter.model;

import java.util.Objects;

public class Lesson {
    private String name;
    private int duration;
    private double price;
    private String lecturarName;

    public Lesson(String name, int duration, double price, String lecturarName) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.lecturarName = lecturarName;
    }

    public Lesson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLecturarName() {
        return lecturarName;
    }

    public void setLecturarName(String lecturarName) {
        this.lecturarName = lecturarName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return duration == lesson.duration &&
                Double.compare(lesson.price, price) == 0 &&
                Objects.equals(name, lesson.name) &&
                Objects.equals(lecturarName, lesson.lecturarName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, price, lecturarName);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", price='" + price + '\'' +
                ", lecturarName='" + lecturarName + '\'' +
                '}';
    }
}
