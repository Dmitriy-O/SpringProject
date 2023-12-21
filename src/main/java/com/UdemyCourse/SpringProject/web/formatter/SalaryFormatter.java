package com.UdemyCourse.SpringProject.web.formatter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

@Component
public class SalaryFormatter implements Formatter<BigDecimal> {

    private final NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);

    @Override
    public BigDecimal parse(String text, Locale locale) throws ParseException {
        return BigDecimal.valueOf(Long.valueOf(text));
//        return BigDecimal.ONE;
    }

    @Override
    public String print(BigDecimal object, Locale locale) {
        return numberFormat.format(object);
    }
}
