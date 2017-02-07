import java.util.Iterator;
import java.util.Set;

/**
 * Created by Sagar on 2/1/2017.
 */
public class Course {

        private String name;
        private int credits;
        private int duration;
        private Time startTime;
        private Set<Weekday> days;
        private String course;
        private int hour;

         Course (String name,int credits,int duration,Time startTime,Set<Weekday> days){

             this.name = name;
             this.credits = credits;
             this.duration = duration;
             this.startTime = startTime;
             this.days = days;


             if (days.equals(null) || credits >5)
                 throw new IllegalArgumentException("Error");

             }
        public boolean conflictsWith(Course c) {

            Iterator<Weekday> wd = c.getDays().iterator();
                while (wd.hasNext()){
                    Weekday days = wd.next();
                    if (this.days.contains(days)){
                        if(this.startTime.compareTo(c.getEndTime())<0 && c.startTime.compareTo(this.getEndTime())<0){
                            return true;
                        }
                    }
                }
            return false;
        }

        public Set<Weekday> getDays(){
             return days;
        }
        public boolean contains(Weekday days,Time startTime,Object o1){
             if (o1 !=null){
                    o1.contains(days) && o1.contains(startTime);

             }
             return false;
        }
    public Time getEndTime(){
        Time t = this.startTime.clone();
        t.shift(duration);
        return t;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            Course other = (Course) obj;
            return true;
        }
            return false;
        }



      public int getCredits (){
             return credits;
    }
       public int getDuration(){
          return duration;
       }
       public String getName(){
           return name;
       }
       public Time getStartTime(){
           return startTime;
       }
       public Time getEndtime(){
           return startTime + int hour;
           hour = 1;
       }


    @Override
    public String toString(String str) {
        return "" +name + "" + credits +"," + days+","+ startTime+"'"+ ""+ duration;

    }
}
