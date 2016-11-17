import java.util.ArrayList;
import java.util.Iterator;

public class ArrayArrayListExample {
    public static void main(String[] args) { 
        // ArrayList Example   
        ArrayList<String> arrlistobj = new ArrayList<String>();

        // assign by add method
        arrlistobj.add("Alive is awesome");
        arrlistobj.add("Love yourself");
        
        System.out.print("ArrayList object output :");  

        // walk by Iterator.hasNext() and while
        Iterator it = arrlistobj.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("");

        // Array Example
        // String[] arrayobj = new String[3];
        String[] arrayobj = new String[3];

        // assign by = operator
        arrayobj[0] = "Love yourself";  
        arrayobj[1] = "Alive is awesome";
        arrayobj[2] = "Alians!"; 

        System.out.print("Array object output :");

        // wolk by array.length and for
        for(int i=0; i < arrayobj.length ;i++) {
            System.out.print(arrayobj[i] + " ");   
        }

        System.out.println("");

        // Array pass by reference
        int[] scores1 = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
        int[] scores2 = scores1;
        scores2[0] = 99;
        System.out.printf("scores1[0] will be change to : %d", scores1[0]);
    }
}
