import java.io.Serializable;

public class Structure implements Serializable{
    char a;
    int b;
    float c;
    public Structure(char a, int b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString() {
        return "char: " + a + ", int: " + b + ", float: " + c;
    }
}