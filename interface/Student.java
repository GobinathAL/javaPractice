import java.util.ArrayList;
abstract class Student implements Person {
    String name, address;
    double weight, height;
    public double calculateBMI() {
        return (weight / (height * height)) / 10000;
    }

    @Override
    public abstract String toString();

    public abstract int getNoOfArrears();

    public abstract boolean hasEnrolledIn(String course);

    public abstract boolean hasArrearIn(String course);

    public abstract ArrayList<String> getCoursesEnrolled();
    public abstract ArrayList<String> getArrearCourses();
    public abstract double getcgpa();
}