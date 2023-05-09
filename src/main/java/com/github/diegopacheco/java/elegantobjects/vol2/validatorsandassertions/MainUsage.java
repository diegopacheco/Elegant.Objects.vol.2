package com.github.diegopacheco.java.elegantobjects.vol2.validatorsandassertions;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;

public class MainUsage {
    public static void main(String[] args) {
        Day end = new JDKDay(
                Date.from(
                        LocalDate.parse("2007-12-03")
                                .atStartOfDay()
                                .toInstant(ZoneOffset.UTC)
                )
        );
        Day day = new StrictDate(new JDKDay(new Date()));
        try{
            int days = day.distanceTo(end);
            System.out.println(days);
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
