package com.ltp.gradesubmission;

import java.util.UUID;

public class Grade {
    private String name;
    private String subject;
    private String score;
    private Number age;
    private String id;

    public Grade(String name, String subject, String score, Number age) {
        this.name = name;
        this.subject = subject;
        this.score = score;
        this.age = age;
    }

    public Grade(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Number getAge() {
        return this.age;
    }

    public void setAge(Number age) {
        this.age = age;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
