import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by Sagar on 2/5/2017.
 */
public  class Schedule implements Cloneable, Comparator {

    ArrayList<Course> obj;// = new ArrayList<Course>();

    public Schedule(){
        obj = new ArrayList<Course>();
    }



    public void add(Course course) {

        ArrayList<Course> obj = new ArrayList<Course>();
        //obj.add(String course);
        Iterator<Course> it = obj.iterator();
        while(it.hasNext()){
            Course c = it.next();
            if (c.conflictsWith(course)) {
                throw new ScheduleConflictException

            }

           }
    }





    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private String[] getcourse(Weekday days, Time starttime) {
        return course;
        if (String course = null){
            return null;
        }
    }


