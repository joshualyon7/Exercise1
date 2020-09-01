//Names: Michael DeSimone, Spencer Hanggodo, Josh Lyon
import java.util.*;

class Dog{

    //Fields
    public String name;

    //Constructors
    public Dog(){

    }
    public Dog(String Name){
        name = Name;
    }

    //Methods
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        Collection<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Fido"));
        dogs.add(new Dog("Spot"));
        dogs.add(new Dog("Lucy"));
        System.out.println(dogs);
        for (Dog d1 : dogs) {
            if(d1.toString() == "Spot"){
                System.out.println(d1);
            }
        }

        for(Iterator<Dog> dogIt = dogs.iterator(); dogIt.hasNext(); ){
            /*if(dogIt.next().toString() == "Spot"){
                dogs.add(new Dog());
            }*/
            /*if(dogIt.next.toString() == "Spot"){
                dogIt.add(new Dog());
            }*/
            /*if (!(dogIt.next().toString() == "Spot")){
                dogIt.remove();
            }*/
            
        }
    }


}