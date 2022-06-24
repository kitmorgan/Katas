import java.util.HashMap;
import java.util.Map;

public class katNoTriples {
    public static void main(String[] args) {
        int[] input = {1,1,1,2};
        System.out.println(noTriples(input));
    }

    public static boolean noTriples(int[] nums){
        Map<Integer, Integer> counterMap = new HashMap<>();
        for(int num : nums){
            if(!counterMap.containsKey(num)){
                counterMap.put(num, 1);
            }else{
                counterMap.put(num, counterMap.get(num) + 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : counterMap.entrySet()){
            if(entry.getValue() >= 3){
                return false;
            }
        }
        return true;
    }
}
