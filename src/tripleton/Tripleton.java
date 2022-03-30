package tripleton;

/**
 * Name: Aditya Verma
 * Date: Mar 29, 2022
 * Description: Lab 09 "Singleton and Observer Patterns" Submission for CS321.
 */
public class Tripleton {

    //static variables
    public static Tripleton tripleton;
    public static int count = 0;
    public static int maxObjects = 10;
    public static Tripleton[] instanceArray = new Tripleton[maxObjects];

    //constructor
    private Tripleton() {
        count++;
    }

    /**
     * Create new instances while it can,
     * and once it has created all three of them,
     * it will return the 3rd instance.
     *
     * @return tripleton
     */
    public static Tripleton getInstance() {
        if (count < 3) {
            tripleton = new Tripleton();
        }
        instanceArray[count] = tripleton;
        return tripleton;
    }

    /**
     * Returns the Nth instance of Tripleton
     *
     * @return tripleton
     */
    public static Tripleton getInstanceN(int n) {
        if (n >= 3) {
            return tripleton;
        }
        return instanceArray[n];
    }
}
