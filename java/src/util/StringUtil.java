package util;

import java.text.SimpleDateFormat;
import java.util.Date;

import util.model.DateTimeFormat;

public class StringUtil {
	
    public static final String EMPTY = "";

    public static String getCurDateTime(DateTimeFormat dtf ){
        return new SimpleDateFormat(dtf.getFormat()).format(new Date());
    }//getCurDate

    public static boolean isNullOrEmpty(String data){
        return (data==null||EMPTY.equals(data.trim()));
    }//isNullOrEmpty

}//class
