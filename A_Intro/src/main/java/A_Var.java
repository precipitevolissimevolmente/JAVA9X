import java.util.ArrayList;

public class A_Var {

    public static void main(String[] args) {
        //only for local variables!!!

        //try Control + q on var name
        //http://openjdk.java.net/projects/amber/LVTIstyle.html Guidelines for var! like Optional :)
        var var = "Some data of type: ";
        System.out.println(var + var.getClass().getName());

        var b = myMethod();
        ArrayList<String> strings = new ArrayList<>();
    }

    private static String myMethod() {
        return "dummy";
    }
}
