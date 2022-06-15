public class kataHas12 {
    public static void main(String[] args) {
        int[] input = {1, 3, 4, 2, 5};
        boolean output = has12(input);
        System.out.println(output);
    }

    public static boolean has12(int[] nums) {
        boolean has1 = false;
        for(int num : nums){
            has1 = num == 1 || has1;
            if(has1 && num == 2){
                return true;
            }
        }
        return false;
    }
}

