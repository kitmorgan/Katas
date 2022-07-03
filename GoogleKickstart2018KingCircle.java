import com.sun.jdi.IntegerValue;

import java.util.*;

public class GoogleKickstart2018KingCircle {

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
        Set<Integer> routes = new HashSet<>();
        for (int i = 0; i < cafes.size() - 1; i++) {
            Integer[] currentCafe = cafes.get(i);
            for (int j = i + 1; j < cafes.size(); j++) {
                Integer[] comparedCafe = cafes.get(j);
                int x1 = currentCafe[0];
                int y1 = currentCafe[1];
                int x2 = comparedCafe[0];
                int y2 = comparedCafe[1];

                if (x1 == x2) {
                    int height = Math.abs(y1 - y2);

                    for (int k = 0; k < cafes.size(); k++) {
                        if (k != i && k != j) {
                            Integer[] lastCafe = cafes.get(k);
                            int x3 = lastCafe[0];
                            if (Math.abs(x3 - x1) >= height || (x3 - x1 == 0 && !Arrays.equals(lastCafe, comparedCafe) || !Arrays.equals(lastCafe, currentCafe))) {
                                Integer[] route = new Integer[6];
                                System.arraycopy(currentCafe, 0, route, 0, 2);
                                System.arraycopy(comparedCafe, 0, route, 2, 2);
                                System.arraycopy(lastCafe, 0, route, 4, 2);
                                Arrays.sort(route);
                                Integer routeCode = Arrays.hashCode(route);
                                routes.add(routeCode);
                            }
                        }
                    }
                }else if (y1 == y2) {
                    // yaxis same
                    int width = Math.abs(x1 - x2);
                    for (int k = 0; k < cafes.size(); k++) {
                        if (k != i && k != j) {
                            Integer[] lastCafe = cafes.get(k);
                            int y3 = lastCafe[1];
                            if (Math.abs(y3 - y1) >= width || (y3 - y1 == 0 && !Arrays.equals(lastCafe, comparedCafe) || !Arrays.equals(lastCafe, currentCafe))) {
                                Integer[] route = new Integer[6];
                                System.arraycopy(currentCafe, 0, route, 0, 2);
                                System.arraycopy(comparedCafe, 0, route, 2, 2);
                                System.arraycopy(lastCafe, 0, route, 4, 2);
                                Arrays.sort(route);
                                Integer routeCode = Arrays.hashCode(route);
                                routes.add(routeCode);
                            }
                        }
                    }
                }

            }
        }
        return routes.size();
    }
}
