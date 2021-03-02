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
        double counter = 0;
        while (counter < personArray.length) {
            Person newStr = personArray[(int) counter];
            result.append(newStr);
            counter ++;
        }
        String output = result.toString();
        return output;
    }



    public String forLoop() {
        String result = "";
        for (int i = 0; i < personArray.length; i++) {
            Person newStr = personArray[i];
            result = result + newStr;
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        for (Person person : personArray) {
            result = result + person;
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
