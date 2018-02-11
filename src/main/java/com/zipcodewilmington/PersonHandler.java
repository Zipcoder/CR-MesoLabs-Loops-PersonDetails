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

        String name = "";
        int counter = 0;
        while (counter < personArray.length) {
            Person currentDude = personArray[counter];
            currentDude.toString();
            name += currentDude;
            counter++;
        }

        return name;
    }


    public String forLoop() {

        String name = "";
        for (int i = 0; i < personArray.length; i++) {
            Person currentDude = personArray[i];
            currentDude.toString();
            name += currentDude;
        }

        return name;
    }




        public String forEachLoop() {

            String name = "";
            for (Person firstLast : personArray) {
                firstLast.toString();
                name += firstLast;
            }

            return name;
        }


        public Person[] getPersonArray () {

            return personArray;
        }
    }

