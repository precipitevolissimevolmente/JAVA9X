import java.lang.*;

/**
 * Created by CG on 4/5/2016.
 */
public class MathB implements MathUtil {
    @Override
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    @Override
    public int abs(int element) {
        return element > 0 ? element : -element;
    }
}
