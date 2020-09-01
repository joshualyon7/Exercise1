//Names: Michael DeSimone, Spencer Hanggodo, Josh Lyon

import java.util.*;
//q7
public class C {
    public static void main(String[] args){ //takes in arguments from the command line
        Set<String> s = new HashSet<String>(); //initializes hash set
        for (String a : args){ //for all arguments passed into main
            if (!s.add(a)){ //if element already exists in the set
                System.out.println("element already exists: " + a); //print the element
                System.out.println(s.size() + " elements in set: " + s); //print the size and contents of the set
            }
        }
    }
}