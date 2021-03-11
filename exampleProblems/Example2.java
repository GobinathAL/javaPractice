/*
Create a class STUDENT with following members: Regno, name, mark1,mark2,mark3, total, average and class
Write functions for the following:
1)Get()
2)total()
3)average()
4)class()
5)display()
*/
import java.util.Scanner;

class Student {
    private int regno, mark1, mark2, mark3, total;
    private String Class, name;
    private double average;
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("regno:");
        this.regno = sc.nextInt();
        System.out.println("name:");
        this.name = sc.next();
        System.out.println("Enter mark1, mark2, mark3:");
        this.mark1 = sc.nextInt();
        this.mark2 = sc.nextInt();
        this.mark3 = sc.nextInt();
    }
    public void total() {
        this.total = this.mark1 + this.mark2 + this.mark3;
    }
    public void average() {
        this.average = (this.mark1 + this.mark2 + this.mark3) / 3;
    }
    public void Class() {
        if(this.average > 75)
            this.Class = "Distinction";
        else if(this.average > 60 && this.average <= 75)
            this.Class = "First Class";
        else if(this.average <=60)
            this.Class = "Second Class";
    }
    public void display() {
        System.out.println("\nRegno :" + this.regno + "\nName: " + this.name + "\nmark1: " + this.mark1 + "\nmark2: " + this.mark2 + "\nmark3: " + this.mark3 + "\ntotal: " + this.total + "\naverage: " + this.average + "\nclass: " + this.Class + "\n");
    }
}
public class Example2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.get();
        s1.total();
        s1.average();
        s1.Class();
        s1.display();
    }
}
