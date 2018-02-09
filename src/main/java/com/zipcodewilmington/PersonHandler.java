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

        String result = "";
        int counter = 0;

        while(counter < personArray.length) {
            Person currentPerson = personArray[counter];
            currentPerson.toString();
            result += currentPerson;
            counter++;
        }

        return result;
    }



    public String forLoop() {
        String result = "";

        for(int i = 0; i < personArray.length; i++) {
            Person currentPerson = personArray[i];
            currentPerson.toString();
            result += currentPerson;
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";

        for(Person firstLast: personArray) {
            firstLast.toString();
            result += firstLast;
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
