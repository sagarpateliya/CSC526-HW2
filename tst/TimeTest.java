/**
 * Created by Sagar on 1/30/2017.
 */
public class TimeTest {

    public static Time  fromString(String str) {
//12:03 PM
        String hours = str.substring(0, 2);
        String minutes = str.substring(3, 5);
        String PM = str.substring(6);

        int h = Integer.parseInt(hours);
        int m = Integer.parseInt(minutes);

        boolean ispm;
        if (PM == "PM") {
            ispm = true;
        } else
            ispm = false;

        return new Time(h, m, ispm);
    }}