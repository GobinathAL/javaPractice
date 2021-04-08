import java.util.ArrayList;
class UGStudent extends Student {
    int rollno;
    String name, address;
    double cgpa;
    ArrayList<String> coursesEnrolled = new ArrayList<String>(), arrearCourses = new ArrayList<String>();

    public UGStudent(int rollno, String name,String address,double weight, double height, double cgpa, ArrayList<String> coursesEnrolled, ArrayList<String> arrearCourses) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.weight = weight;
        this.height = height;
        this.cgpa = cgpa;
        for(int i = 0; i < coursesEnrolled.size(); i++) {
            this.coursesEnrolled.add(coursesEnrolled.get(i));
        }
        for(int i = 0; i < arrearCourses.size(); i++) {
            this.arrearCourses.add(arrearCourses.get(i));
        }
    }

    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public int getNoOfArrears() {
        if(arrearCourses == null) return 0;
        return arrearCourses.size();
    }
    public boolean hasEnrolledIn(String course) {
        if(coursesEnrolled == null) return false;
        for(String x : coursesEnrolled) {
            if(x.equals(course))
                return true;
        }
        return false;
    }

    public boolean hasArrearIn(String course) {
        if(arrearCourses == null) return false;
        for(String x : arrearCourses) {
            if(x.equals(course))
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

    public String toString() {
        return "UGStudent{\n" + "rollno=" + rollno + "\nname=" + name + "\ncgpa=" + cgpa + "\ncouresEnrolled=" + coursesEnrolled.toString() + "\narrearCourses=" + arrearCourses.toString() + "\n"; 
    }
}