import java.util.*;

public class GoogleKickstart2018KingCirclev2 {
// cafes
// find every combination add to hashset - masterList
// list of valid lines (2 cafes on line)
// add combinations to set - validCombination
// repeat through the list
// return count validCombination



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int tests = Integer.parseInt(scanner.nextLine());
            List<String> problems = new ArrayList<>();
            for (int i = 0; i < tests; i++) {
                problems.add(scanner.nextLine());
            }

            for (int i = 0; i < tests; i++) {
                int answer = getRoutes(findCafes(problems.get(i)));
                System.out.printf("Case %d: %d\n", i + 1, answer);
            }
        }

        public static List<Integer[]> findCafes(String problem) {
            String[] input = problem.split(" ");
            List<Integer[]> cafes = new ArrayList<>();
            Integer[] cafe = {Integer.valueOf(input[1]), Integer.valueOf(input[2])};
            cafes.add(cafe);

            int n = Integer.parseInt(input[0]);
            int vPrev = Integer.parseInt(input[1]);
            int hPrev = Integer.parseInt(input[2]);
            int a = Integer.parseInt(input[3]);
            int b = Integer.parseInt(input[4]);
            int c = Integer.parseInt(input[5]);
            int d = Integer.parseInt(input[6]);
            int e = Integer.parseInt(input[7]);
            int f = Integer.parseInt(input[8]);
            int m = Integer.parseInt(input[9]);
            for (int i = 0; i < n - 1; i++) {
                int vCurr = (a * vPrev + b * hPrev + c) % m;
                int hCurr = (d * vPrev + e * hPrev + f) % m;
                cafe = new Integer[]{vCurr, hCurr};
                cafes.add(cafe);
                vPrev = vCurr;
                hPrev = hCurr;
            }
            return cafes;
        }

        public static int getRoutes(List<Integer[]> cafes) {
            for (int i = 0, j = i + 1; i< cafes.size(); i++){
                if(j < cafes.size()){
                }
            }
            return 0;
        }
}
