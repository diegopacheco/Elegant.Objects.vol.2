package com.github.diegopacheco.java.elegantobjects.vol2.polymorphicmedia;

import org.json.simple.JSONObject;
import java.nio.charset.StandardCharsets;

public class ToJson implements Media {

    private final JSONObject obj;

    public ToJson() {
        this.obj = new JSONObject();
    }

    public ToJson(JSONObject obj) {
        this.obj = obj;
    }

    @Override
    public Media with(String key, String value) {
        this.obj.put(key,value);

        // Diego: makes the object immutable (principle from volume 1)
        return new ToJson(obj);

        // Diego: we could also make it less "GC intensive" by doing this
        // however then the object would not be immutable, will be mutable.
        // but it would be more GC friendly - creating less trash.
        // return this;
    }

    @Override
    public byte[] toBytes() {
        return obj.toJSONString().getBytes(StandardCharsets.UTF_8);
    }
}
