import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class tryksdjf extends FilterInputStream{

    protected tryksdjf(InputStream in) {
        super(in);
        //TODO Auto-generated constructor stub
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(3);

        arrayList.add(1);
        System.out.println(arrayList.toString());
    }
    
}
