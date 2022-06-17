import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoogleKickStart2022ASpeedTyping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        List<String[]> problems = new ArrayList<>();
        List<String> answers = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            String I = scanner.nextLine();
            String P = scanner.nextLine();
            String[] problem = {I, P};
            problems.add(problem);
        }


        for (int j = 0; j < T; j++) {
            String answer = getAnswer(problems.get(j));
            System.out.printf("Case #%d: %s\n", j + 1, answer);
        }
    }

    public static String getAnswer(String[] problem) {
        List<String> input = new ArrayList<>();
        List<String> produced = new ArrayList<>();
        for (char ch : problem[1].toCharArray()) {
            produced.add(String.valueOf(ch));
        }
        for (char ch : problem[0].toCharArray()) {
            input.add(String.valueOf(ch));
        }
        int match = 0;
        int inputIndex = 0;
        for (int i = 0; i < input.size(); i++) {
            int counter = 0;
            do {
                if (input.get(i).equals(produced.get(counter))) {
                    match++;
                    produced.remove(counter);
                    break;
                }
                counter++;
            } while (counter < produced.size());

        }
        if (match < input.size()) {
            return "IMPOSSIBLE";
        } else {
            return String.valueOf(produced.size());

            // look through I and P for same characters,
            // if p doesn't have at least I.length similarities return impossible
        }
    }
}
