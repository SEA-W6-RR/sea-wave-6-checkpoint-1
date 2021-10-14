package dev.wilders;

import java.util.ArrayList;
import java.util.List;

/**
 * Bonus: Add another class GenericITPersonStorage, which restricts its usage for ITPerson and its subclasses.
 * => That's done by this class.
 */
public class GenericITPersonStorage<T extends ITPerson> {

    List<T> persons = new ArrayList();

    public boolean storePerson(T person) {
        return persons.add(person);
    }

    public T getLastStoredPerson() {
        return persons.get(persons.size()-1);
    }

    public T getFirstStoredPerson() {
        return persons.get(0);
    }
}
