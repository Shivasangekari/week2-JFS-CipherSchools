
import java.util.ArrayList;
import java.util.List;

public class Lecture14 {
    public static void main(String[] args) {
        ArrayList<String> states= new ArrayList<String>();
        states.add("california");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");
        System.out.println("ArrayList: "+states);
        String s = states.get(2);
        System.out.println("I got "+s);
        System.out.println("ArrayList size "+states.size());
        for(int i=0;i<states.size();i++)
        {
            System.out.println(states.get(i) );
            
        }
        
    }
}

