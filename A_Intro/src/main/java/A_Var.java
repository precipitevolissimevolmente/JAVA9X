import java.util.ArrayList;
import java.util.List;

public class A_Var {

    public static void main(String[] args) {
        //only for local variables!!!

        //try Control + q on var name
        //http://openjdk.java.net/projects/amber/LVTIstyle.html Guidelines for var
        var a = "Some data of type: ";
        System.out.println(a + a.getClass().getName());

        var b = myMethod();
        ArrayList<String> strings = new ArrayList<>();
    }

    private static String myMethod() {
        return "dummy";
    }
}
