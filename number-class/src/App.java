import java.math.BigInteger;

public class App {
    public static void main(String[] args) throws Exception {
        Number x = Integer.valueOf(3);
        System.out.println(x.intValue());

         System.out.println(((Integer)x).compareTo(1));
    }
}
