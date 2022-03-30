package tripleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.Observer;

/**
 * Name: Aditya Verma
 * Date: Mar 29, 2022
 * Description: Lab 09 "Singleton and Observer Patterns" Submission for CS321.
 */
public class Prof extends java.util.Observable {

    //instance variables
    private String name = null;
    private int roomNumber;
    private Date midterm = null;

    private ArrayList<Student> students; //collection of students

    //Constructor
    public Prof(String name) {
        super();
        this.name = name;
        students = new ArrayList();
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
     * Getter method for name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for midterm
     *
     * @return midterm
     */
    public Date getMidterm() {
        return midterm;
    }

    /**
     * Setter method for the midterm date.
     * Sets the status to changed and notifies its
     * observers with the Date.
     */
    public void setMidterm(Date date) {
        midterm = date;
        setChanged();
        notifyObservers(date);
    }

    /**
     * Setter method for the roomNumber.
     * Sets the status to changed and notifies its
     * observers with the roomNumber
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        setChanged();
        notifyObservers(roomNumber);
    }

    /**
     * Adding students to collection of students taking midterm.
     */
    public void takingTheMidterm(Observer observer) {
        this.students.add((Student) observer);
    }

    /**
     * Prints all the students taking the midterm
     */
    public void printStudentsTakingMidterm() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
