package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        StringBuilder name = new StringBuilder();
        int counter = 0;
        while (counter < personArray.length) {
            Person currentPerson = personArray[counter];
            name.append(currentPerson);
            counter++;
        }

        return name.toString();
    }

    public String forLoop() {
        StringBuilder name = new StringBuilder();
        for (Person currentPerson : personArray) {
            name.append(currentPerson);
        }

        return name.toString();
    }

    public String forEachLoop() {
        StringBuilder name = new StringBuilder();
        for (Person firstLast : personArray) {
            name.append(firstLast);
        }

        return name.toString();
    }

    public Person[] getPersonArray() {
        return personArray;
    }
}