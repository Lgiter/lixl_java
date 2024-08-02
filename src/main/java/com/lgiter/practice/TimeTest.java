package com.lgiter.practice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 * Author: lixiaolong
 * Date: 2024/3/21
 * Desc:
 */
public class TimeTest {

    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10,20);
        ZoneId zoneId = ZoneId.of("Europe/London");

        ZonedDateTime dateTime = ZonedDateTime.of(LocalDate.of(2022, 10, 15), time, zoneId);
        System.out.println(dateTime);
        ZoneOffset offset = dateTime.getOffset();
        System.out.println(offset);

        // A winter date-time
        ZonedDateTime zdtWinter = ZonedDateTime.of(LocalDate.of(2022, 11, 15), time, zoneId);
        System.out.println(zdtWinter);
        System.out.println(zdtWinter.getOffset());
    }

}
