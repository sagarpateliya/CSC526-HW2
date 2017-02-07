/**
 * Created by Sagar on 1/30/2017.
 */
public class Time implements Cloneable {

   private int minutes;
   private int hour;
   private  boolean PM;
   public Time (int hour,int minutes,boolean PM){
        this.hour = hour;
        this.minutes = minutes;
        this.PM = PM;
   }


    public static Time  fromString(String str){
        //12:03 PM
        String hours = str.substring(0,2);
        String minutes = str.substring(3,5);
        String PM = str.substring(6);

        int h = Integer.parseInt(hours);
        int m = Integer.parseInt(minutes);

        boolean ispm;
        if (PM == "PM")
            ispm = true;
        else
            ispm = false;

        return new Time(h,m,ispm);
    }


    public Time clone(){
            Time copy = new Time(this.hour,this.minutes,this.PM);
            return copy;
    }

        public int compareTo(Time t){
            int h1 = this.getHour();
            int h2 = t.getHour();
            if(h1 == 12){
                h1 = 0;
            }
            if (h2 == 12){
                h2 = 0;
            }

            if (this.PM == t.PM){
               if( this.hour == t.hour){
                   if (this.minutes == t.minutes){
                       return 0;
                   }else if(this.minutes<t.minutes){
                       return -1;
                   }else{
                       return 1;
                   }
               }else if (h1<h2){
                   return -1;

                }else{
                   return 1;
               }

            }else if (this.PM && !t.PM){
                return 1;
            }else {
                return -1;
            }



    @Override
    public boolean equals(Object obj) {
        if(obj != null && getClass() == obj.getClass()){
            Time other = (Time) obj;
            return hour == other.hour && minutes == other.minutes && PM == other.PM;
        }
        return false;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
            return minutes;
    }
    public boolean isPM(){
            return PM;
    }
    public void shift(int minutes){
//`           if (int minute > 59){
//            return hour++;}
//            else if  {
//            return null;}

    }

    public String toString(String str){
        //String.format
        return hour + ":" + minutes + " " + (PM ? "PM" : "AM");
    }
}





