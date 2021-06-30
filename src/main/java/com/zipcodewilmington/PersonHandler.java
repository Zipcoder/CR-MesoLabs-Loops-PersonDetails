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
        StringBuilder names = new StringBuilder();
        int counter = 0;
        while (counter < personArray.length){
            String currentPerson = personArray[counter].toString();
            result += currentPerson;
            counter++;
            }
        return result;
    }




    public String forLoop() {
        String result = "";
        StringBuilder names = new StringBuilder();
        for (int counter = 0; counter < personArray.length; counter++){
            String currentPerson = personArray[counter].toString();
            result += currentPerson;
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        int i = 0;
        Person currentPerson = personArray[i];
        for(Person name : personArray) {
            currentPerson = name;
            result += currentPerson;
            i++;
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
