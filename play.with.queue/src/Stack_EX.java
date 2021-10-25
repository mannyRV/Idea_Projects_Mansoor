
import com.sun.jdi.CharValue;

import java.util.Collection;
import java.util.Stack;

public class Stack_EX {
    public static void main(String[] args) {
        String str= "ABCDEFGHJKLMNOPQRSTUVWXYZ";
        Stack<Character> st= new Stack<>();
        char[] c = new char[str.length()];
        for (int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }
        for (int i=0; i<str.length(); i++){
            c[i]=st.pop();
        }
        String rev = String.valueOf(c);
        System.out.println(rev);
        Stack<String> stre= new Stack<>();
        stre.push(str);
        stre.push(rev);
        System.out.println(stre);
    }
}
