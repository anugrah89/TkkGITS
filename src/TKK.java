import java.util.*; 
public class TKK{
 public static void main(String[] args)
 {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("\n%d: Hello World",i);
            } else if (i % 5 == 0) {
                System.out.printf("\n%d: World",i);
            } else if (i % 3 == 0) {
                System.out.printf("\n%d: Hello",i);
            } 
        }
        System.out.printf("\n");
    }
}