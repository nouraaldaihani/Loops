public class WeekdaysPrinter {
    public static void main(String[] args) throws Exception {
        String[] weekdays = { "Sun.", "Mon.", "Tue.", "Wed.", "Thu." , "Fri." , "Sat."};

        for (int i = 0; i < weekdays.length; i++){
                if(i>=5)break;
                System.out.println(weekdays[i]);
            }
        }
        
    }
