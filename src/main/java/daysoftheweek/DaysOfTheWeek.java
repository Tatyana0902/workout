package daysoftheweek;

public class DaysOfTheWeek {
    public static String daysOfTheWeek(int n){
        switch (n){
            case 1:
            return "Monday";
            //break;
            case 2:
                return "Tuesday";
           // break;
            case 3:
                return "Wednesday";
            //break;
            case 4:
                return "Thursday";
            //break;
            case 5:
                return "Friday";
            //break;
            case 6:
                return "Saturday";
            //break;
            case 7:
                return "Sunday";
            //break;
            default:
                return "Days like this don't exist";
                //break;

        }
    }
}
