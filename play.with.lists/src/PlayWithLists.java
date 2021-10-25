import com.sun.jdi.IntegerValue;
import com.sun.source.tree.Tree;

import java.util.*;

public class PlayWithLists implements Comparable{
    public static void main(String[] args) {
        ArrayList<Character> l = new ArrayList<>();
        Set<Character> s =new TreeSet<>();
        Set<Character> h = new HashSet<>();
        String str = "MANNY";
        for(int i=0;i<str.length();i++){
            l.add(str.charAt(i));
            s.add(str.charAt(i));
            h.add(str.charAt(i));
        }
        s.add('B');
        if(l.contains(10)){
            System.out.println("the list contains 10 at: " + l.indexOf(10));
        }
        if(l.contains(100)){
            System.out.println("the list contains 100 at: " + l.indexOf(100)+" and "+ l.lastIndexOf(100));
        }
       /* s.add(100);
        s.add(20);
        Character c='A';*/
        Set<Character> r = new LinkedHashSet<>(l);

        System.out.println("this is treeset:  " + s);
        System.out.println("This is a hashset: " +h);
        System.out.println("ArrayList " + l);
        System.out.println("Linked Hassh set" + r);
    }

    @Override
    public int compareTo(Object o) {
        return this.compareTo(o);
    }
}
