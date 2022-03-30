package tripleton;

import java.util.Date;

/**
 * Name: Aditya Verma
 * Date: Mar 29, 2022
 * Description: Lab 09 "Singleton and Observer Patterns" Submission for CS321.
 */
public class University {
    /**
     * Testing Observer Patterns using University Elements
     *
     * @param args An array of String values
     */
    public static void main(String[] args) throws Exception {
        //a prof
        Prof prof = new Prof("BAdams");

        //a course
        Course course = new Course("Intro to Java Programming", prof);

        //4 students
        Student s1 = new Student("Kramer");
        Student s2 = new Student("Elaine");
        Student s3 = new Student("Jerry");
        Student s4 = new Student("George");

        //a secretary
        Secretary secretary = new Secretary();
        //registering secretary to prof
        secretary.registerToProf(prof);

        //registering students to course
        s1.registerCourse(course);
        s2.registerCourse(course);
        s3.registerCourse(course);
        s4.registerCourse(course);

        //setting midterm date
        prof.setMidterm(new Date());

        System.out.println();

        //printing students taking midterm.
        prof.printStudentsTakingMidterm();
    }
}
