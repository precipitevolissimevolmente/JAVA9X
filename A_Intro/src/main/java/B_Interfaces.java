public class B_Interfaces {

    public static void main(String[] args) {

        MathUtil myInterface = new MathA();
        System.out.println(myInterface.abs(-5));
        System.out.println(myInterface.max(-5, 5));
        System.out.println(myInterface.getPI());
    }
}
