import java.awt.datatransfer.StringSelection;
import java.time.temporal.WeekFields;

public enum Weekday  {

    MONDAY("M"), TUESDAY("T"), WEDNESDAY("W"), THURSDAY("R"), FRIDAY("F");

    private String days;
    private Weekday(String days){
        if(days.equals(null)){
            throw new IllegalArgumentException("Error");
        }

        this.days=days;
    }



    public static Weekday fromString(String s){
        if (s.toLowerCase().equals("m")){
        return MONDAY;}

        else if (s.toLowerCase().equals("t")){
        return TUESDAY;}

        else if (s.toLowerCase().equals("w")){
            return WEDNESDAY;}

        else if (s.toLowerCase().equals("r")){
            return THURSDAY;}

        else if (s.toLowerCase().equals("f")){
            return FRIDAY;}

        else

    {
        throw new IllegalArgumentException("String does not match any enum value");}}

        public String toShortName(Weekday day) {
            switch (day) {
                case MONDAY:
                    return "M";
                case TUESDAY:
                    return "T";
                case WEDNESDAY:
                    return "W";
                case THURSDAY:
                    return "R";
                default:
                    return "F";


            }

        }
        public String toString() {

            if (this.days.equals("M")) {
                System.out.println("Monday");

            } else if (this.days.equals("T")) {
                System.out.println("Tuesday");

            } else if (this.days.equals("W")) {
                System.out.println("Wednesday");

            } else if (this.days.equals("R")) {
                System.out.println("Thursday");

            } else if (this.days.equals("F")) {
                System.out.println("Friday");
            }
        return null;
        }
}



