package com.infotech.batch.mapper;

import com.infotech.batch.model.Person;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;

public class RawStringFieldSetMapper implements FieldSetMapper<Person> {

    @Override
    public Person mapFieldSet(FieldSet fieldSet) {
        Person person = new Person();
        person.setFirstName(fieldSet.readRawString(0));
        person.setLastName(fieldSet.readRawString(1));
        person.setEmail(fieldSet.readRawString(2));
        person.setAge(fieldSet.readInt(3));
        return person;
    }
}