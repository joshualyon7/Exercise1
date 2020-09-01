//Names: Michael DeSimone, Spencer Hanggodo, Josh Lyon
import java.util.*;

//q1
class Dog{

    //Fields
    public String name;

    //Constructor
    public Dog(String Name){
        name = Name;
    }

    //Methods
    public String toString(){
        return name;
    }

    public static void main(String[] args) {

        //q2
        Collection<Dog> dogCol = new ArrayList<>();
        dogCol.add(new Dog("Fido"));
        dogCol.add(new Dog("Spot"));
        dogCol.add(new Dog("Lucy"));

        //q3
        System.out.println(dogCol);

        //q4
        for (Dog d1 : dogCol) {
            if(d1.toString() == "Spot"){
                System.out.println(d1);
            }
        }

        //q5
        
        for(Iterator<Dog> dogIt = dogCol.iterator(); dogIt.hasNext(); ){
            /*if(dogIt.next().toString() == "Spot"){ //concurrent modification exception
                dogCol.add(new Dog("newDog"));
            }*/
            /*if(dogIt.next().toString() == "Spot"){ //iterators have no "add" method
                dogIt.add(new Dog("newDog"));
            }*/
            /*if (dogIt.next().toString() == "Spot"){ //concurrent modification exception
                dogCol.remove(dogIt.next());
            }*/
            if (dogIt.next().toString() == "Spot"){ //this works
                dogIt.remove();
                System.out.println(dogCol);
            }
            System.out.println("here");
        }

        //q6
        HashSet<Dog> dogSet = new HashSet<>();
        dogSet.add(new Dog("Fido"));
        dogSet.add(new Dog("Spot"));
        dogSet.add(new Dog("Lucy"));
        
        System.out.println(dogSet);

        for (Dog d1 : dogSet) {
            if(d1.toString() == "Spot"){
                System.out.println(d1);
            }
        }

        for(Iterator<Dog> dogIt = dogSet.iterator(); dogIt.hasNext(); ){
            /*if(dogIt.next().toString() == "Spot"){ //concurrent modification exception
                dogSet.add(new Dog("newDog"));
            }*/
            /*if(dogIt.next().toString() == "Spot"){ //iterators have no "add" method
                dogIt.add(new Dog("newDog"));
            }*/
            /*if (dogIt.next().toString() == "Spot"){ //concurrent modification exception
                dogSet.remove(dogIt.next());
            }*/
            if (dogIt.next().toString() == "Spot"){ //this works
                dogIt.remove();
                System.out.println(dogSet);
            }
        }
    }
}