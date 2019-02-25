/**
 * Created by CG on 4/5/2016.
 */
public interface MathUtil {
    int max(int a, int b);

    int abs(int element);

    default double getPI() {
        privateMethod();
        return Math.PI;
    }

    private void privateMethod() {
        System.out.println("I am a private method called from Interface");
    }
}
