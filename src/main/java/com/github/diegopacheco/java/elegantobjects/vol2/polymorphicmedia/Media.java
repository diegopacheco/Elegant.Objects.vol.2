package com.github.diegopacheco.java.elegantobjects.vol2.polymorphicmedia;

public interface Media {
    Media with(String key,String value);
    byte[] toBytes();
}
