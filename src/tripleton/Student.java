package tripleton;

/**
 * Name: Aditya Verma
 * Date: Mar 29, 2022
 * Description: Lab 09 "Singleton and Observer Patterns" Submission for CS321.
 */
public class Student implements java.util.Observer {

    //variables
    String name = null;
    int roomNumber;
    Course course = null;

    //Constructor

    /**
     * Student Constructor
     * @param name name of the student
     */
    public Student(String name) {
        super();
        this.name = name;
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
     * Getter method for roomNumber
     *
     * @return roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Adds Students to the course, getting
     * the Prof from the Course object
     *
     * @param course
     */
    public void registerCourse(Course course) {
        this.course = course;
        course.getProf().addObserver(this);

    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an Observableobject's
     * notifyObservers method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     *            method.
     */
    @Override
    public void update(java.util.Observable o, Object arg) {
        if (arg instanceof Integer) {
            roomNumber = (Integer) arg;
            System.out.println("Student " + name + " has a midterm in room number: " + roomNumber);
            return;
        }
        System.out.println("Student " + name + " says ..Doh got it dude!");
        System.out.println(((Prof) o).getName() + " says " + arg);
        ((Prof) o).takingTheMidterm(this);
    }
}
