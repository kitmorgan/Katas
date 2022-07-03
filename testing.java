import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testing {
    public static void main(String[] args) {
        String answer = "www";
        System.out.println(answer.substring(0,2));
        List<Integer> blah = new ArrayList<>();
        blah.add(3);
        blah.add(20);
        blah.add(0);
        Collections.sort(blah);
        System.out.print(blah.get(0));
   }

    public static String gameWinner(String colors) {
        // Write your code here
        int playerUp = 0;
        String board = colors;

        while(true){
            if(playerUp % 2 == 0){
                //wendy
                for(int i = 1; i < board.length() - 1; i++){
                    if(board.substring(i-1,i+2).equals("www")){
                        //move found
                        String newBoard = board.substring(0,i) + board.substring(i+1);
                        board = newBoard;
                        break;
                    }else if (i == board.length() -1){
                        return "bob";
                    }
                }
            }else{
                //bob
                for(int i = 1; i < board.length() - 1; i++){
                    if(board.substring(i-1,i+2).equals("bbb")){
                        //move found
                        String newBoard = board.substring(0,i) + board.substring(i+1);
                        board = newBoard;
                        break;
                    }else if (i == board.length() -1){
                        return "wendy";
                    }
                }
            }
            playerUp++;
        }
    }

}
