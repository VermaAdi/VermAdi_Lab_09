package tripleton;

/**
 * Name: Aditya Verma
 * Date: Mar 29, 2022
 * Description: Lab 09 "Singleton and Observer Patterns" Submission for CS321.
 */
public class TripletonTest {
    /**
     * Testing Tripleton Pattern Functioning
     *
     * @param args An array of String values
     */
    public static void main(String[] args) {

        //storing 5 consecutive instances of Tripleton
        Tripleton obj1 = Tripleton.getInstance();
        Tripleton obj2 = Tripleton.getInstance();
        Tripleton obj3 = Tripleton.getInstance();
        Tripleton obj4 = Tripleton.getInstance();
        Tripleton obj5 = Tripleton.getInstance();

        System.out.println("Testing getInstance(): ");

        //printing all Tripleton instances
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);

        //testing getInstanceN() by interchanging objN instances
        obj1 = Tripleton.getInstanceN(3);
        obj2 = Tripleton.getInstanceN(2);
        obj3 = Tripleton.getInstanceN(1);
        obj4 = Tripleton.getInstanceN(4);
        obj5 = Tripleton.getInstanceN(5);

        System.out.println();
        System.out.println("Testing getInstanceN(): ");

        //printing out the newly interchanged instances
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);

    }
}
