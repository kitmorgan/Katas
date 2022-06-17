import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoogleKickstart2021AK {
    public static void main(String[] args) {

        // input
        Scanner scanner = new Scanner(System.in);
        int T = Integer.parseInt(scanner.nextLine()); //T test cases
        List<String> firstInput = new ArrayList<>();
        List<String> listOfS = new ArrayList<>();

        for(int i = 0; i < T; i++) {
            String nk = scanner.nextLine(); // contains 2 ints n, k
            firstInput.add(nk);
            String S = scanner.nextLine(); // string S of length N all capital
            listOfS.add(S);
        }

        // output Case #x: y

        for (int i = 0; i < T; i++) {
            char[] charArray = listOfS.get(i).toCharArray();
            int N = charArray.length;
            String[] splitNK = firstInput.get(i).split(" ");
            int K = Integer.parseInt(splitNK[1]);
            int score = 0;
            for (int j = 0; j < charArray.length / 2; j++){
                if (charArray[j] != charArray[N-j-1]){
                    score++;
                }
            }
            int yMin = 0;
            if (K > score){
                yMin = K - score;
            }
            if (K < score){
                yMin = score - K;
            }
            System.out.printf("Case #%d: %d\n",i+1, yMin);
        }
    }

}
