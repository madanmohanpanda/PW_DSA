/*Q1. Implement a Map in java which takes the input and print the list in sorted order based on key.
Input:
Output:
5- Rahul, 7 Lakshman, 1 Ram, 4 Krrish, 2 Lakshay,
{1=Ram, 2=Lakshay, 4=Krrish, 5=Rahul, 7=lakshman}
 */
package PW_DSA;
import java.util.*;

class SortValue{
    public static void main(String[] args) {
        Map<Integer, String> l = new TreeMap<>();
        l.put(5,"Rahul");
        l.put(7,"Lakshman");
        l.put(1,"Ram");
        l.put(4, "Krrish");
        l.put(7, "Lakshman");

        System.out.println(l);
    }
}