import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GKS2018F_anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tests = Integer.parseInt(scanner.nextLine());
        List<String[]> problems = new ArrayList<>();

        for (int i = 0; i < tests; i++) {
            scanner.nextLine();
            String A = scanner.nextLine();
            String B = scanner.nextLine();
            String[] problem = {A, B};
            problems.add(problem);
        }

        for (int i = 0; i < tests; i++) {
            int answer = getSolution(problems.get(i));
            System.out.printf("Case #%d: %d\n", i + 1, answer);
        }

    }

    public static int getSolution(String[] problem) {
        int counter = 0;
        /** it worked but the wrong way so I flipped A and B */
        String A = problem[0];
        String B = problem[1];
        List<String> substringsOfB = new ArrayList<>();
        List<String> substringsOfA = new ArrayList<>();
        //create list of substrings
        for (int i = 0; i < B.length(); i++) {
            for (int j = i + 1; j < B.length() + 1; j++) {
                String pieceB = B.substring(i, j);
                String pieceA = A.substring(i, j);
                substringsOfB.add(pieceB);
                substringsOfA.add(pieceA);
            }
        }

        // iterate through our substring lists checking to see if piece A is contained in ANY of pieceB regardless of the order as long as sizes are the same
        for (String pieceA : substringsOfA) {
            char[] pieceAarray = pieceA.toCharArray();

            for (String pieceB : substringsOfB) {
                int matchingLetters = 0;
                char[] pieceBarray = pieceB.toCharArray();
                List<Character> pieceAList = new ArrayList<>();
                List<Character> pieceBList = new ArrayList<>();
                // check to see if sizes are equal
                if (pieceAarray.length == pieceB.length()) {
                    for (char chA : pieceAarray) {
                        pieceAList.add(chA);
                    }
                    for (char chB : pieceBarray) {
                        pieceBList.add(chB);
                    }
                    for(int aIndex = 0; aIndex < pieceAList.size(); aIndex++){
                        for(int bIndex = 0; bIndex < pieceBList.size(); bIndex++){
                            if(pieceAList.get(aIndex) == pieceBList.get(bIndex)){
                                matchingLetters++;
                                pieceBList.remove(bIndex);
                                break;
                            }
                        }
                    }
                    if (matchingLetters == pieceB.length()){
                        counter++;
                        break;
                    }
                }

            }
        }
        return counter;
    }
}
