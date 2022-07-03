import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoogleKickstartPracticeCandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String[]> problems = new ArrayList<>();
        int T = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < T; i++) {
            String firstLine = scanner.nextLine();
            String secondLine = scanner.nextLine();
            String[] problem = {firstLine, secondLine};
            problems.add(problem);
        }
        for (int i = 0; i < T; i++) {
            int answer = answer(problems.get(i));
            System.out.printf("\nCase #%d: %d", i+1, answer);
        }
    }
    public static int answer(String[] problem){
        String[] lineOne = problem[0].split(" ");
        String[] lineTwo = problem[1].split(" ");
        int numBags = Integer.parseInt(lineOne[0]);
        int numKids = Integer.parseInt(lineOne[1]);
        int totalCandy = 0;
        for(String bag : lineTwo){
            totalCandy += Integer.parseInt(bag);
        }
        return totalCandy % numKids;
    }
}
