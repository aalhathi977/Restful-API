package com.actuator.actuator;


public class Person {
    private String fname;
    private String lname;
    private String age;
    private String gender;

    public Person(String fname, String lname, String age, String gender) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
