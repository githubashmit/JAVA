import java.time.LocalDate;

public class T46_dateand_time {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2020,3,31);
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        int dayOfYear = date.getDayOfYear();
        int dayOfWeek = date.getDayOfWeek().getValue();

        System.out.println("Date: "+ date);
        System.out.println("Year: "+year);
        System.out.println("Month:"+month);
        System.out.println("Day:"+day);
        System.out.println("Day of Year: "+dayOfYear);
        System.out.println("day of week: "+dayOfWeek);
    }
}
