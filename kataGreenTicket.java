public class kataGreenTicket {
    public int greenTicket(int[] ticket){
        int length = ticket.length;

        for (int i = 0; i < length; i ++){
            int counter = 0;
            for(int j = 0; j < length; j++){
                if (ticket[i] == ticket[j]){
                    counter ++;
                }
                if(j==length-1) {
                    if (counter == 3) {
                        return 20;
                    }else if (counter == 2){
                        return 10;
                    }
                }
            }
        }
        return 0;
    }
}
