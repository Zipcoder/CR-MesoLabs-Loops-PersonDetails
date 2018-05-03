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
        StringBuilder result = new StringBuilder();
        int counter = 0;
        while(counter < personArray.length) {
            Person currentPerson = personArray[counter];
            result.append(currentPerson.toString());
            counter++;
        }
        return result.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < personArray.length; i++) {
            Person currentPerson = personArray[i];
            result.append(currentPerson.toString());
        }
        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        for(Person firstLast: personArray) {
           result.append(firstLast.toString());
        }
        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }


}
