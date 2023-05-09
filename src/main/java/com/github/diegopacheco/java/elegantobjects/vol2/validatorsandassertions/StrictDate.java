package com.github.diegopacheco.java.elegantobjects.vol2.validatorsandassertions;

import java.util.Date;

public class StrictDate implements Day{

    private final Day origin;

    public StrictDate(Day d){
        this.origin = d;
    }

    @Override
    public int distanceTo(Day end) {
        if (end.getDate().compareTo(origin.getDate()) < 0){
            throw new IllegalArgumentException(
                String.format("Start (%s) must be earlier than end (%s)",
                origin.getDate(),
                end.getDate()
                )
            );
        }
        return this.origin.distanceTo(end);
    }

    @Override
    public Date getDate() {
        return origin.getDate();
    }
}
