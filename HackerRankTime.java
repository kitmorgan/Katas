public class HackerRankTime {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }

    public static String timeConversion(String s) {
        // Write your code here
        String ampm = s.substring(8, 10);
        String[] time = s.split(":");
        time[2] = s.substring(6, 8);
        if (time[0].equals("12")) {
            if(ampm.equals("AM")) {
                return "00:" + time[1] + ":" + time[2];
            }
            return s.substring(0,8);
        }
        if (ampm.equals("AM")) {
            return s.substring(0, 8);
        }

        time[0] = String.valueOf(Integer.parseInt(time[0]) + 12);
        return time[0] + ":" + time[1] + ":" + time[2];
    }

}
