import java.util.scanner;
import java.util.*;

public class Animal {
    public static final double FAVNUMBER = 1.6180;
    //final classes cannot be subclassed.
    private String name;
    private int weight;
    private boolean hasOwner = false;
    private byte age;
    private long uniqueID;
    private char favouriteChar;
    private double speed;
    private float height;
    protected static int numberOfAnimals = 0;
    static Scannner userinput = new Scanner(System.in);

    public Animal() {
        numberOfAnimals++;
        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = " +sumOfNmubers);
    }
    public static void main(String[] args){
        Animal theAnimal = new Animal();
    }

}
