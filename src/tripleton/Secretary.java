package tripleton;

import java.util.Date;
import java.util.Observer;
import java.util.Random;

/**
 * Name: Aditya Verma
 * Date: Mar 29, 2022
 * Description: Lab 09 "Singleton and Observer Patterns" Submission for CS321.
 */
public class Secretary implements Observer {

    //Date object
    private Date date = null;

    //Constructor
    public Secretary() {
        super();
    }

    /**
     * Adds Secretary to the objects that the Prof
     * will notify
     *
     * @param p
     */
    public void registerToProf(Prof p) {
        p.addObserver(this);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an Observable object's
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
            return;
        }
        date = (Date) arg;
        Random random = new Random();
        int num = random.nextInt(1, 10);
        System.out.println("Secretary registered to " + ((Prof) o).getName() + " and Professor says " + date);
        ((Prof) o).setRoomNumber(num);

    }
}
