package tripleton;

/**
 * Name: Aditya Verma
 * Date: Mar 29, 2022
 * Description: Lab 09 "Singleton and Observer Patterns" Submission for CS321.
 */
public class Course {

    //instance variables
    private String name = null;
    private Prof prof = null;

    //Constructor
    public Course(String name, Prof prof) {
        super();
        this.name = name;
        this.prof = prof;
    }

    /**
     * Getter method for name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for prof
     *
     * @return prof
     */
    public Prof getProf() {
        return prof;
    }
}
