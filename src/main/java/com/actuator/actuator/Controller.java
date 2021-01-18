package com.actuator.actuator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/person")
    @ResponseBody
    public ResponseEntity<List> getPerson(){
        Person person1 = new Person("Aziz","Alharthi", "25", "male");
        Person person2 = new Person("Aziz","Alharthi", "25", "male");
        Person person3 = new Person("Aziz","Alharthi", "25", "male");
        Person person4 = new Person("Aziz","Alharthi", "25", "male");
        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        return new ResponseEntity<List>(people, HttpStatus.CREATED);
    }
}
