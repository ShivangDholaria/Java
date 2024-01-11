/**
 *  Exercise for chapter 5
 *  The code shows how the inner classes, anonymous class, OOPs concepts and interfaces work
 *  Along with object interaction and how classes are designed
 * @author Shivang Dholaria
 */
import java.util.*;

public class ExZoo {

    //Inner classes
    abstract class Animal {
        public abstract void speak();
    }

    //Subclass
    class Lion extends Animal {
        public void speak() {
            System.out.print("roar");
        }
    }

    class Gibbon extends Animal {
        public void speak() {
            System.out.println("hoot");
        }
    }

    public void listen() {
        Lion lion = new Lion();
        Gibbon gibbon = new Gibbon();
        System.out.println("Let's listen to some animals!");
        System.out.print("The lion goes \"");
        lion.speak();
        System.out.println("\"");
        System.out.print("The gibbon goes \"");
        gibbon.speak();
        System.out.print(" \" \n");
    }

    public static void main(String args[]) {
        ExZoo myZoo = new ExZoo();
        myZoo.listen();
    }
}


