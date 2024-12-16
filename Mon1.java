
import java.util.*;
public class Mon1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n=Integer.parseInt(line);
        n*=10;
        n+=100;
        System.out.println(n);
    }
}
