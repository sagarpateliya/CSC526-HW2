/**
 * Created by Sagar on 1/30/2017.
 */
public class Time implements Cloneable {


   private int minutes;
   private int hour;
   private  boolean PM;

    private Time (int hour,int minutes,boolean PM){
        this.hour = hour;
        this.minutes = minutes;
        this.PM = PM;}

        public static Time  fromString(String str){
//12:03 PM
                String hours = str.substring(0,2);
                String minutes = str.substring(3,5);
                String PM = str.substring(6);

                int h = Integer.parseInt(hours);
                int m = Integer.parseInt(minutes);

                boolean ispm;
                if (PM == "PM")
                {
                    ispm = true;
                }
                else
                    ispm = false;

                return new Time(h,m,ispm);
        }


        public Time clone(){
                Time copy = new Time(this.hour,this.minutes,this.PM);
                return copy;
        }

        public int compareTo(int t){
            return t;


        }
        public static boolean equals(int s){
            if (int s == int s){
                s = true;}
                else {
                s = false;}
            }

        }
        public static int getHour(int hour){
                return hour;

        }
        public static int getMinute(int minutes){
                return minutes;
        }
        public static boolean isPM(boolean PM){
                return PM;
        }
        public static int shift(int minutes){
`               if (int minute > 59){
                return hour++;}
                else if  {
                return null;}

        }
        public String toString(String str){
            System.out.println(hour + ":" + minutes + PM);
                    return null;

        }
}





