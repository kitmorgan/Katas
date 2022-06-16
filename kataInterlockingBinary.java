import java.util.Scanner;

public class kataInterlockingBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number: ");
        int one = scanner.nextInt();
        System.out.println("Second Number: ");
        int two = scanner.nextInt();

        System.out.println(isInterlocking(one, two));
    }
    static public boolean isInterlocking(int one, int two){
        do {
            int bitOne = one % 2;
            int bitTwo = two % 2;
            one = one / 2;
            two = two / 2;
            if (bitOne == 1 && bitTwo == 1){
                return false;
            }
        }while(one > 0 || two > 0);
        return true;
    }
}
