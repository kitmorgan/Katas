import java.util.*;

public class GoogleKickStart2018Fanagram {
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
        String A = problem[0];
        String B = problem[1];
        int counter = 0;
        // create substring A[i,j]
        for (int i = 0; i < A.length(); i++) {
            for (int j = i + 1; j < A.length() + 1; j++) {
                String piece = A.substring(i, j);
                // check it against b, add to counter
                // is each character uniquely contained in B
                if (B.contains(piece)) {
                    counter++;
                } else {
                    int hasLetter = 0;
                    char[] pieceArray = piece.toCharArray();
                    char[] bArray = B.toCharArray();
                    /** For sure there is a better way to do this */
                    List<Character> pieceList = new ArrayList<>();
                    List<Character> bList = new ArrayList<>();
                    for (char ch : pieceArray) {
                        pieceList.add(ch);
                    }
                    for(char ch : bArray) {
                        bList.add(ch);
                    }

                    for (int bIndex = 0; bIndex < bList.size(); bIndex++) {
                        for (int pieceIndex = 0; pieceIndex < pieceList.size(); pieceIndex++) {
                            if (bList.get(bIndex) == pieceList.get(pieceIndex)) {
                                pieceList.remove(pieceIndex);
                                bList.remove(bIndex);
                                break;
                            }
                        }
                        if (pieceList.size() == 0) {
                            counter++;
                        }
                    }
                }
            }
        }
        // return counter
        return counter;
    }
}
