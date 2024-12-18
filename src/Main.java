import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input mode.");
        Character mode = in.next().charAt(0);
        if (mode.equals('D')||mode.equals('d')) {
            Date time = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("ddyyyyMM");
            int seed = (int) Math.sqrt(Integer.parseInt(sdf.format(time)) * 30 + 2 * 32);
            System.out.println(seed);
        } else if (mode.equals('K')||mode.equals('k')) {
            System.out.println("Please input key(25-bit string).");
            char[] key = in.next().toCharArray();
            for (int i = 0;i < 25;i++){
                int temp = key[i]*9/4+5-6;
                System.out.print((char) temp);
            }
        }
    }
}