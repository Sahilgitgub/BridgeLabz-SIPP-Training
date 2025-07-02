import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st = sc.nextLine();
        String str=" ";
          for(int i=st.length()-1;i>=0;i--)
          {
              str+=st.charAt(i);
          }
        System.out.println(str);
    }
}
