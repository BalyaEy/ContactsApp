package org.example.contacts.service;

import org.example.contacts.model.Person;

import java.util.ArrayList;
import java.util.List;

public class ContactsService {
    private List<Person> persons;

    public ContactsService(){
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person person){
        persons.add(person);
    }

    public void removePerson(String number){
        persons.removeIf(p -> p.getNumber().equals(number));
    }

    public Person findPersonByPhone(String number){
        for (Person p : persons){
            if (p.getNumber().equals(number)){
                return p;
            }
        }
        return null;
    }

    public List<Person> listAll(){
        return persons;
    }
}
