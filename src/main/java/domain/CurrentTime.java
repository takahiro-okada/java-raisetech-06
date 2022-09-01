package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

    public static String getCurrentTime(){
        Date nowDate = new Date();
        System.out.println(nowDate);
        SimpleDateFormat japaneseFormatDate = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分");
        String formatCurrentTime = japaneseFormatDate.format(nowDate);
        return formatCurrentTime;
    }
}
