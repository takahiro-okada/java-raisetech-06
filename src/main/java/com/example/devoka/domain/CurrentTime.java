package com.example.devoka.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {

    public static String getCurrentTime(){
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);
        DateTimeFormatter japaneseFormatDate = DateTimeFormatter.ofPattern("yyyy年MM月dd時");
        String formatCurrentTime = japaneseFormatDate.format(nowDate);
        return formatCurrentTime;
    }
}
