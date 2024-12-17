import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date time = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        int seed = (int) Math.sqrt(Integer.parseInt(sdf.format(time))*30+2*32);
        System.out.println(seed);
    }
}