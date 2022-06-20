import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoogleKickStart2022ASpeedTyping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine());
        List<String[]> problems = new ArrayList<>();

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
        char[] perfectArray = problem[0].toCharArray();
        char[] producedArray = problem[1].toCharArray();
        int counter = 0;
        if(producedArray.length < perfectArray.length){
            return "IMPOSSIBLE";
        }
        for(int i = 0, j = 0; j < producedArray.length; j++) {
            try {
                if (perfectArray[i] == producedArray[j]) {
                    i++;
                    counter++;
                }
            }catch (ArrayIndexOutOfBoundsException ob){
                break;
            }
        }
        if (counter < perfectArray.length) {
            return "IMPOSSIBLE";
        }else{
            return String.valueOf(producedArray.length - perfectArray.length);
        }
    }
}
