import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoogleKickStart2021AL {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] firstInput = new String[T];
        List<String[][]> gridList = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            String input = "";
            firstInput[i] = scanner.nextLine();
            String[] RC = firstInput[i].split(" ");
            int R = Integer.parseInt(RC[0]);
            int C = Integer.parseInt(RC[1]);
            String[][] grid = new String[R][C];
            // take in grid
            for (int j = 0; j < R; j++) {
                input = scanner.nextLine();
                String[] row = input.split(" ");
                // create grid
                for (int k = 0; k < C; k++) {
                    grid[j][k] = row[k];
                }
            }
            gridList.add(grid);
        }
        for (String[][] test : gridList) {
            solve(test);
        }
    }

    static void solve(String[][] grid) {
        // rows
        for (int i = 0; i < grid.length; i++) {
            // columns
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j].equals("1")){
                    // find valid segment
                    // save it in List<validSegments> horizontal segments
                    //
                    // go through it the other way (right now looking at horizontal)

                }
            }
        }
        System.out.printf("Case #%d: %d", 1, 1);
    }
}