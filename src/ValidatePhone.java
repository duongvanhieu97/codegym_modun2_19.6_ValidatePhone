import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_REGEX = "^\\(\\d{2}\\)\\s*-\\s*\\(0\\d{9}\\)";

    public ValidatePhone() {
        pattern = Pattern.compile(PHONE_REGEX);
    }
    public boolean validate(String string) {
        matcher = pattern.matcher(string);
        return matcher.matches();
    }
}