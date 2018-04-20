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
        while (counter < personArray.length) {
            String currentDude = personArray[counter].toString();
            result += currentDude;
            counter++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        for (int i = 0; i < personArray.length; i++) {
            String currentDude = personArray[i].toString();
            result += currentDude;
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        for (Person i : personArray) {
            String currentDude = i.toString();
            result += currentDude;
            }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
