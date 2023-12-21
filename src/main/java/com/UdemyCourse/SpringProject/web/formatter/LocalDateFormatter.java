package com.UdemyCourse.SpringProject.web.formatter;

import org.springframework.context.annotation.Bean;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Component
public class LocalDateFormatter implements Formatter<LocalDate> {

//    private int a;
//
//
//    public LocalDateFormatter(int a) {
//        this.a = a;
//        System.out.println(a);
//    }

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd,yyyy");

    @Override
    public LocalDate parse(String text, Locale locale) throws ParseException {
        return LocalDate.parse(text,DateTimeFormatter.ISO_LOCAL_DATE);
//        return null;

    }

    @Override
    public String print(LocalDate object, Locale locale) {

        return object.format(formatter);

    }
}
