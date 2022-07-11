package br.com.foo.services;

import br.com.foo.models.PersonModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();

    public PersonModel findById(String id) {
        PersonModel personModel = new PersonModel();
        personModel.setId(counter.incrementAndGet());
        personModel.setFirstName("Rodrigo");
        personModel.setLastName("Rech");
        personModel.setAddress("Capinzal - SC");
        personModel.setGender("Male");
        return personModel;
    }

    public List<PersonModel> findAll() {
        List<PersonModel> persons = new ArrayList<PersonModel>();
        for (int i = 0; i < 8; i++) {
            PersonModel person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public PersonModel create(PersonModel person) {
        person.setId(counter.incrementAndGet());
        return person;
    }

    private PersonModel mockPerson(int i) {
        PersonModel personModel = new PersonModel();
        personModel.setId(counter.incrementAndGet());
        personModel.setFirstName("PersonName" + i);
        personModel.setLastName("LastName" + i);
        personModel.setAddress("Address" + i);
        personModel.setGender("Gender");
        return personModel;
    }

    public PersonModel update(String id, PersonModel person) {
        return person;
    }

    public PersonModel delete(String id) {
        return new PersonModel();
    }
}
