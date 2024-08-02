package com.lgiter.practice.spring.timezone;

import com.lgiter.practice.spring.anno.TimezoneConvert;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * Author: lixiaolong
 * Date: 2024/1/18
 * Desc:
 */
@Component
public class DateFieldTypeProcesser extends FieldTypeProcesser<Date> {

    @Override
    LocalDateTime read(Field field, Object o, TimezoneConvert fieldAnnotation) {
        try {
            Date date = (Date) field.get(o);
            Instant instant = date.toInstant();
            return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    Date write(LocalDateTime localDateTime, TimezoneConvert fieldAnnotation) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static void main(String[] args) {
        FieldTypeProcesser processer = new DateFieldTypeProcesser();
        System.out.println(processer.getType().getTypeName());
    }
}
