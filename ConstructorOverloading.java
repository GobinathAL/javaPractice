class Coordinates {
    int x, y;
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Coordinates(Coordinates o) { //constructor which takes object as parameter
        x = o.x;
        y = o.y;
    }
    public boolean equals(Coordinates o) {      //function which takes object as parameter
        if(o.x == x && o.y == y) return true;
        else return false;
    }
    public boolean isGreaterThan(Coordinates o) { //function which takes object as parameter
        if(x > o.x && y > o.y) return true;
        else return false;
    }
    public Coordinates plusOne() {      //function which returns an object
        Coordinates temp = new Coordinates(x + 1, y + 1);
        return temp;
    }
    public String display() {
        String str = "(" + x + "," + y + ")";
        return str;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Coordinates A = new Coordinates(2, 3);
        Coordinates B = new Coordinates(1,2);
        Coordinates C = new Coordinates(B);
        if(A.equals(B))
            System.out.println(A.display() + " equals " + B.display());
        else if(A.isGreaterThan(B)) 
            System.out.println(A.display() + " is greater than " + B.display());
        else
            System.out.println(A.display() + "is less than " + B.display());

        System.out.println("Coordinate C is " + C.display());
        Coordinates D = A.plusOne();
        System.out.println("Coordinate D is " + D.display());
    }
}
