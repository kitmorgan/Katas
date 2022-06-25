import com.sun.jdi.IntegerValue;

import java.util.*;

public class GoogleKickstart2018KingCircle {
    // a Royal Parade will march its way through the streets of the capital.
    //The capital can be thought of as an infinite 2D plane, with infinitely many,
    //infinitely long, streets spaced one meter apart, running horizontally and vertically throughout.
    // The horizontal streets are labelled from negative infinity to infinity from top to bottom,
    // while the vertical streets are labelled from negative infinity to infinity from left to right.
    
    //N, V1, H1, A, B, C, D, E, F and M
    //Vi = (A × Vi-1 + B × Hi-1 + C) modulo M V - verticle roads(x axis)
    //Hi = (D × Vi-1 + E × Hi-1 + F) modulo M H - horizontal roads (y axis)

    // find cafe coordinates as int[][] save them in a list cafes;
    // iterate through the list first looking for matching x values, then difference in y is int line
    // look through the y values for a x line with same length, that is a route save route to int[6] sorted add to a map <int[6], 0> routes;
    // at the end count elements of routes for answer

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = Integer.parseInt(scanner.nextLine());
        List<String> problems = new ArrayList<>();
        for (int i = 0; i < tests; i++) {
            problems.add(scanner.nextLine());
        }

        for (int i = 0; i < 4; i++) {
            int answer = getRoutes(findCafes(problems.get(i)));
            System.out.printf("Case %d: %d\n", i+1, answer);
        }
    }
    // checked against test, works
    public static List<Integer[]> findCafes(String problem){
        String[] input = problem.split(" ");
        List<Integer[]> cafes = new ArrayList<>();
        Integer[] cafe = {Integer.valueOf(input[1]),Integer.valueOf(input[2])};
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
        for (int i = 0; i < n; i++) {
            int vCurr = (a * vPrev + b * hPrev + c) % m;
            int hCurr = (d * vPrev + e * hPrev + f) % m;
            cafe = new Integer[]{vCurr, hCurr};
            cafes.add(cafe);
            vPrev = vCurr;
            hPrev = hCurr;
        }
        return cafes;
    }

    public static int getRoutes(List<Integer[]> cafes){
        int counter = 0;
        HashSet<Integer[]> routes = new HashSet<>();
        // any two cafes on with matching x or y can make a 
        // cafe with any other cafe
        // adding them to a map as sorted integers should take care of doubles
        for (int i = 0; i < cafes.size() - 1; i++) {
            Integer[] currentCafe = cafes.get(i);
            for (int j = i + 1; j < cafes.size(); j++) {
                Integer[] comparedCafe = cafes.get(j);
                if(comparedCafe[0] == currentCafe[0]){
                    // xaxis same, add these two plus every other cafe to the map
                }else if(comparedCafe[1] == currentCafe[1]){
                    // yaxis same
                }
            }
        }
        return counter;
    }
}
