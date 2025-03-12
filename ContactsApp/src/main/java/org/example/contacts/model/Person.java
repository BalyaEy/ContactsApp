package org.example.contacts.model;

public class Person {
    private String name;
    private String number;
    private String email;

    public  Person(String name,String email,String number){
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getName(){return name;}
    public void setName(String name) {this.name = name;}

    public String getNumber(){return number;}
    public void setNumber(String number){this.number = number;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


