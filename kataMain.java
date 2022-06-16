public class kataMain {
    public static void main(String[] args) {
        kataGreenTicket kataGreenTicket = new kataGreenTicket();
        int[] blah = {1, 2, 1};
        System.out.println(kataGreenTicket.greenTicket(blah));
    }

    public static int greenTicket(int a, int b, int c) {
        int[] ticket = {a, b, c};
        int length = ticket.length;

        for (int i = 0; i < length; i++) {
            int counter = 0;
            for (int j = 0; j < length; j++) {
                if (ticket[i] == ticket[j]) {
                    counter++;
                }
                if (j == length - 1) {
                    if (counter == 3) {
                        return 20;
                    } else if (counter == 2) {
                        return 10;
                    }
                }
            }
        }
        return 0;
    }
}
