import java.util.ArrayList;
import java.util.List;

public class kataNo23 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        System.out.println(no23(input));
    }

    public static boolean no23(int[] input) {
        for (int i : input) {
            if (i == 2 || i == 3) {
                return false;
            }
        }
        return true;
    }
}
