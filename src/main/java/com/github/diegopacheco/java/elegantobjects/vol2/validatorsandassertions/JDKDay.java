package com.github.diegopacheco.java.elegantobjects.vol2.validatorsandassertions;

import java.util.Date;

public class JDKDay implements Day {

    private final Date date;

    public JDKDay(Date d){
        this.date = d;
    }

    @Override
    public int distanceTo(Day end) {
        return (int) ((end.getDate().getTime() - this.date.getTime()) / (24*60*60*1000L));
    }

    @Override
    public Date getDate() {
        return date;
    }
}
