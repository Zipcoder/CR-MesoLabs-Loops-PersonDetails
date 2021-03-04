package com.zipcodewilmington;

import com.sun.tools.javac.util.ArrayUtils;

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
        int i =0 ;// create a `counter`
        // while `counter` is less than length of array
        while (i < personArray.length) {

                                                              // begin loop
            result = result.concat(personArray[i].toString());// use `counter` to identify the `current Person` in the array
                                                              // get `string Representation` of `currentPerson`
            i++;                                              // append `stringRepresentation` to `result` variable
        }// end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        int value = 0;// identify initial value
        for(value = 0; value < personArray.length; value++){     // identify terminal condition

                                                                         // identify increment
                                                                         // use the above clauses to declare for-loop signature
            result = result.concat(personArray[value].toString());       // begin loop
                                                                         // use `counter` to identify the `current Person` in the array
                                                                         // get `string Representation` of `currentPerson`
                                                                         // append `stringRepresentation` to `result` variable
        } // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        for (Person person : personArray) {    // for each person in personArray
                     // identify array's variable-name
                     // use the above discoveries to declare for-each-loop signature
        result = result + person.toString();             // begin loop
                     // get `string Representation` of `currentPerson`
                     // append `stringRepresentation` to `result` variable
        } // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
