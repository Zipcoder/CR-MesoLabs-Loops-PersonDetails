package com.zipcodewilmington;

import java.lang.reflect.Array;

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
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

        // created the code using 2 kinds of iteration -- why '.append' when this code works?
       /* for (int counter = 0; counter < personArray.length; counter++) {
            result += personArray[counter];
        } */
        int counter = 0;
        while (counter < personArray.length) {
            result += personArray[counter];
            counter++;
        }
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for (int counter = 0; counter < personArray.length; counter++) {
            result += personArray[counter];
        }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }

// how do you do forEachLoops

    public String forEachLoop() {
        String result = "";
        String stringRepresentation = "";
        // identify array's type
        // identify array's variable-name
       for (Person theEnd: personArray) {
            result += theEnd;
       }
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
