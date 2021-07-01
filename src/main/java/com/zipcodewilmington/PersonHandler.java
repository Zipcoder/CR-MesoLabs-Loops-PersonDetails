package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {

        // create a `counter`
        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop

        String result = "";
        int i = 0;
        while (i < personArray.length) {

            String currentPerson = personArray[i].toString();
            result += currentPerson;

            i++;
        }

        return result;
    }


    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        for (int i = 0; i < personArray.length; i++) {
            String currentPerson = personArray[i].toString();
            result += currentPerson;
        }
        return result;
    }


    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        for (Person people : personArray) {
       String currentPeople = people.toString();
       result+=currentPeople;

        }
        return result;

    }
}

