import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TKK2 {
   private static final String regex = "^(.+)@(.+)$";

   public static void main(String args[]) {
       List<String> emails = new ArrayList<String>();
       // valid email addresses
       emails.add("anugrah@example.co.id");
       emails.add("anugrah.mi@example.id");
       //invalid email addresses
       emails.add("alice.example.com");
       emails.add("alice#example.com");
       emails.add("@example.me.org");

       //initialize the Pattern object
       Pattern pattern = Pattern.compile(regex);

       //searching for occurrences of regex
       for (String value : emails) {
           Matcher matcher = pattern.matcher(value);

           System.out.println("The Email address " + value + " is " + (matcher.matches() ? "valid" : "invalid"));
       }
   }
}