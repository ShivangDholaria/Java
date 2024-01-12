/**
 *  Exercise for chapter 5
 *  The code shows how the inner classes, anonymous class, OOPs concepts and interfaces work
 *  Along with object interaction and how classes are designed
 * @author Shivang Dholaria
 */
public class ExZoo {

    //Inner classes
    abstract class Animal {
        public abstract void speak();
        public abstract String getSpecies();
    }

    //Subclass
    class Lion extends Animal {
        
        public void speak() {
            System.out.print("roar");
        }

        //Ex 3
        //Added new method to get species of the animal subclass
        public String getSpecies() {
            return "lion";
        }
    }

    class Gibbon extends Animal {
        
        public void speak() {
            System.out.print("hoot");
        }

        public String getSpecies() {
            return "gibbon";
        }
    }

    // Ex 2
    // New Class added
    class Mouse extends Animal {
        
        public void speak() {
            System.out.print("squeak");
        }

        public String getSpecies() {
            return "mouse";
        }
    }

    public void listen() {

        //Object creation
        Lion lion = new Lion();
        Gibbon gibbon = new Gibbon();
        Mouse mouse = new Mouse();

        //Implementing the override functions
        System.out.println("Let's listen to some animals!");
        System.out.print("The lion goes \"");
        lion.speak();
        System.out.println("\"");

        System.out.print("The gibbon goes \"");
        gibbon.speak();
        System.out.println("\"");

        System.out.print("The mouse goes \"");
        mouse.speak();
        System.out.println("\"");
    
        System.out.println("\n");
        // Created animal array which stores the objects of its subclasses
        // As subtypes can inherit its supertype
        Animal[] myAnimals = { new Lion(), new Gibbon(), new Mouse() }; 
        
        for (Animal animal : myAnimals) {
            System.out.print("The ");
            System.out.print(animal.getSpecies());
            System.out.print(" goes \"");
            animal.speak();
            System.out.println("\"");
        }
    }

    public static void main(String args[]) {
        ExZoo myZoo = new ExZoo();
        myZoo.listen();
    }
}


