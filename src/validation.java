import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validation {
    public static boolean Name( String firstName){
    Pattern pattern =Pattern.compile("^[a-zA-Z]{1,50}$");
        Matcher matcher = pattern.matcher(firstName);
        boolean matchfound=matcher.find();
        return matchfound;
    }

    public static boolean birthday( String birthday){
        Pattern pattern = Pattern.compile("^((19|2[0-9])[0-9]{2})/(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])$");
        Matcher matcher = pattern.matcher(birthday);
        boolean matchfound=matcher.find();
        return matchfound;
    }

    public static boolean course( String course){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(course);
        boolean matchfound=matcher.find();
        return matchfound;
    }
    public static boolean email( String email){
        Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher matcher = pattern.matcher(email);
        boolean matchfound=matcher.find();
        return matchfound;
    }



}
