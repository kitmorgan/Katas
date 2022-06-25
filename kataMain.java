import java.util.Arrays;

public class kataMain {
    public static void main(String[] args) {
        int[] a = {1, 78, 3};
        int[] b = {4, 5, 1};
        int[] out = new int[6];
        System.arraycopy(a, 0, out, 0, 3);
        System.arraycopy(b, 0, out, 3, 3);
        Arrays.sort(out);
        int[] compare = {1,1,3,4,5,78};
        System.out.println(Arrays.hashCode(out));
        System.out.println(Arrays.hashCode(compare));
        System.out.println(Arrays.toString(out));
    }
}
