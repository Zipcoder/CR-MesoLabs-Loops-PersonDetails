package com.zipcodewilmington;

import java.util.Arrays;

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
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while(counter< personArray.length){
            // begin loop

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result.append(personArray[counter].toString());
            counter++;

        }// end loop
        return result.toString();
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
        for(int i=0;i< personArray.length;i++)
            {
            result+=personArray[i].toString();
            }

        return result;
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for(Person strArray: personArray){
            result.append(strArray);
        }

        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
