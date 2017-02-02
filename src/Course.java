/**
 * Created by Sagar on 2/1/2017.
 */
public class Course extends  {

        private String name;
        private int credits;
        private int duration;
        private Time startTime;
        private Weekday days;
        private String course;
        private int hour;

         Course (String name,int credits,int duration,Time startTime,Weekday days){

             this.name = name;
             this.credits = credits;
             this.duration = duration;
             this.startTime = startTime;
             this.days = days;


             if (days.equals(null) || credits >5)
                 throw new IllegalArgumentException("Error");

             }
        public boolean conflictsWith(int duration,Time startTime,Weekday days,Object o) {
                if (o !=null){
                  days other = (days) o; && startTime other = (duration) o;

                }
                return  false;
        }
        public boolean contains(Weekday days,Time startTime,Object o1){
             if (o1 !=null){
                    o1.contains(days) && o1.contains(startTime);

             }
             return false;
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
