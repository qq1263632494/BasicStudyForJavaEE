package formatters;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {

    private String pattern;
    private SimpleDateFormat dateFormat;

    public DateFormatter(String pattern){
        this.pattern = pattern;
        this.dateFormat = new SimpleDateFormat(pattern);
    }
    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        try{
            return dateFormat.parse(text);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String print(Date object, Locale locale) {
        return dateFormat.format(object);
    }
}
