package com.rest.mock.util.module;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.rest.mock.util.deserializer.DateTimeDeserializer;
import com.rest.mock.util.serializer.DateTimeSerializer;

import java.time.LocalDateTime;

/**
 * Created by deshanchathusanka on 4/5/18.
 */
public class DateTimeModule extends SimpleModule {
    public DateTimeModule() {
        super();
        addSerializer(LocalDateTime.class, new DateTimeSerializer());
        addDeserializer(LocalDateTime.class, new DateTimeDeserializer());
    }
}
