package com.example.practice.Entity;
import lombok.Getter;
import lombok.Setter;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
public class People {
    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String phoneNumber;
    private Integer ssn;
    private String gender;
    private Address address;


}

@Getter
@Setter
class Address{
    private String street;
    private String city;
    private String state;
    private Integer zipCode;
}
