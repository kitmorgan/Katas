public class kataSwapEnds {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = swapEnds(input);
        for(int i : output){
            System.out.println(i);
        }
    }

    static public int[] swapEnds(int[] primary){
        int last_tmp = primary[primary.length - 1];
        int first_tmp = primary[0];
        int[] output = primary;
        output[0] = last_tmp;
        output[output.length - 1] = first_tmp;
        return output;
    }
}
