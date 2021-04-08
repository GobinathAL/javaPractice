import java.util.ArrayList;

class PGStudent extends Student {
    int rollno;
    double cgpa;
    ArrayList<String> coursesEnrolled, arrearCourses;
    String qualification = "ug complete", ugCollegeName;

    public PGStudent(int rollno, String name, double cgpa, ArrayList<String> coursesEnrolled,
            ArrayList<String> arrearCourses, String ugCollegeName) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
        this.coursesEnrolled = new ArrayList<String>(coursesEnrolled);
        this.arrearCourses = new ArrayList<String>(arrearCourses);
        this.ugCollegeName = ugCollegeName;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getNoOfArrears() {
        return arrearCourses.size();
    }

    public boolean hasEnrolledIn(String course) {
        if (coursesEnrolled.size() == 0)
            return false;
        for (String x : coursesEnrolled) {
            if (x.equals(course))
                return true;
        }
        return false;
    }

    public boolean hasArrearIn(String course) {
        if (arrearCourses.size() == 0)
            return false;
        for (String x : arrearCourses) {
            if (x.equals(course))
                return true;
        }
        return false;
    }

    public ArrayList<String> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public ArrayList<String> getArrearCourses() {
        return arrearCourses;
    }

    public double getcgpa() {
        return cgpa;
    }

    public String getugCollegeName() {
        return ugCollegeName;
    }

    public String toString() {
        return "PGStudent{\n" + "rollno=" + rollno + "\nname=" + name + "\naddress=" + address + "\nweight=" + weight
                + "\nheight=" + height + "\ncgpa=" + cgpa + "\ncouresEnrolled=" + coursesEnrolled.toString()
                + "\narrearCourses=" + arrearCourses.toString() + "\n" + "\nUG College Name=" + ugCollegeName;
    }
}