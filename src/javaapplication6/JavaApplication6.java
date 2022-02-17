package javaapplication6;
import java.util.regex.*;

public class JavaApplication6 {

  public static void main(String[] args) {
        
           String test= "aaabbbb";
        Pattern even = Pattern.compile("(aa|bb|(ab|ba)(aa|bb)*(ab|ba))*");
        Pattern odd = Pattern.compile("(aa|bb|(ab|ba)(aa|bb)*(ab|ba))*(ba|ab)(aa|bb)*");
        Pattern eo = Pattern.compile("(aa|bb|(ab|ba)(aa|bb)*(ab|ba))*a(ba|ab)(aa|bb)*");
        Pattern oe = Pattern.compile("(a|b(aa|bb)*(ab|ba))(aa|bb|(ab|ba)(aa|bb)*(ab|ba))*");
         Matcher evenmatch = even.matcher(test);
         Matcher oddmatch = odd.matcher(test);
        Matcher eomatch = eo.matcher(test);
         Matcher oematch = oe.matcher(test);
          boolean b = evenmatch.matches();
          boolean c = oddmatch.matches();   
           boolean d = eomatch.matches();
            boolean e = oematch.matches();
          if(b==true){
          System.out.println("even");
          }
         
           if(c==true){
          System.out.println("odd ");
          }
            if(d==true){
          System.out.println("eo ");
          }
            if(e==true){
          System.out.println("oe ");
          }

   else{
          System.out.println("in valid ");
          }
            
  }
      
        
    }
