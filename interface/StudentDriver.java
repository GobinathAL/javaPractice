import java.util.Scanner;
import java.util.ArrayList;

public class StudentDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for UG Student");
        System.out.print("rollno:");
        int rollno = sc.nextInt();
        System.out.print("Name:");
        String name = sc.next();
        System.out.print("Address:");
        String address = sc.next();
        System.out.print("Weight:");
        double weight = sc.nextDouble();
        System.out.print("Height:");
        double height = sc.nextDouble();
        System.out.print("cgpa:");
        double cgpa = sc.nextDouble();
        System.out.println("Courses:");
        ArrayList<String> coursesEnrolled = new ArrayList<String>();
        while (true) {
            String s = sc.next();
            if (s.equals("exit"))
                break;
            coursesEnrolled.add(s);
        }
        System.out.println("arrear courses:");
        ArrayList<String> arrearCourses = new ArrayList<String>();
        while (true) {
            String s = sc.next();
            if (s.equals("exit"))
                break;
            arrearCourses.add(s);
        }

        UGStudent ugS = new UGStudent(rollno, name, address, weight, height, cgpa, coursesEnrolled, arrearCourses);
        System.out.println("\n" + ugS.toString() + "\n");
        System.out.println("No of arrears:" + ugS.getNoOfArrears());
        System.out.println("Enter a course to check if the student has enrolled in it");
        String course = sc.next();
        ugS.hasEnrolledIn(course);
        if (ugS.hasEnrolledIn(course)) {
            System.out.println("Student has enrolled in " + course);
        } else {
            System.out.println("Student has not enrolled in " + course);
        }
        System.out.println("Enter a course to check if the student has arrear in it");
        course = sc.next();
        if (ugS.hasArrearIn(course)) {
            System.out.println("Student has arrear in " + course);
        } else {
            System.out.println("Student has not arrear in " + course);
        }
        System.out.println(ugS.name + "'s BMI: " + ugS.calculateBMI());
        System.out.println("Enter details for PG Student");
        System.out.print("rollno:");
        rollno = sc.nextInt();
        System.out.print("name:");
        name = sc.next();
        System.out.print("address:");
        address = sc.next();
        System.out.print("weight:");
        weight = sc.nextDouble();
        System.out.print("height:");
        height = sc.nextDouble();
        System.out.print("cgpa:");
        cgpa = sc.nextDouble();
        System.out.println("courses:");
        coursesEnrolled.clear();
        while (true) {
            String s = sc.next();
            if (s.equals("exit"))
                break;
            coursesEnrolled.add(s);
        }
        System.out.println("arrear courses:");
        arrearCourses.clear();
        while (true) {
            String s = sc.next();
            if (s.equals("exit"))
                break;
            arrearCourses.add(s);
        }
        System.out.print("UG College Name:");
        String ugCollegeName = sc.next();
        PGStudent pgS = new PGStudent(rollno, name, address, weight, height, cgpa, coursesEnrolled, arrearCourses, ugCollegeName);

        System.out.println(pgS.toString());
        System.out.println("No of arrears:" + pgS.getNoOfArrears());
        System.out.println("Enter a course to check if the student has enrolled in it");
        course = sc.next();
        if (pgS.hasEnrolledIn(course)) {
            System.out.println("Student has enrolled in " + course);
        } else {
            System.out.println("Student has not enrolled in " + course);
        }
        System.out.println("Enter a course to check if the student has arrear in it");
        course = sc.next();
        if (pgS.hasArrearIn(course)) {
            System.out.println("Student has arrear in " + course);
        } else {
            System.out.println("Student has not arrear in " + course);
        }

        System.out.println("Student has completed UG in " + pgS.getugCollegeName());
        System.out.println(pgS.name + "'s BMI: " + pgS.calculateBMI());
        sc.close();
    }
}