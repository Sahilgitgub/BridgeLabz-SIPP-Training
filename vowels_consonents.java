import java.util.*;
public class vowels_consonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st= sc.nextLine();
        int vow=0;
        int cons=0;
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U')
            {
                vow++;
            }
            else {
                cons++;
            }
        }
        System.out.println(vow);
        System.out.println(cons);
    }
}
