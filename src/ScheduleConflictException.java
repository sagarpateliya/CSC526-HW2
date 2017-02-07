/**
 * Created by Sagar on 2/7/2017.
 */
public class ScheduleConflictException extends Exception {
    public ScheduleConflictException(){
    }
    public ScheduleConflictException(Course course,Course c) throws ScheduleConflictException {
        super(course.toString() + "Conflicts with" + c.toString());
        throw new ScheduleConflictException(course,c);
    }}



