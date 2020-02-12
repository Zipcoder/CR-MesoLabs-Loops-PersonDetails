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
        String currentPerson = "";

        int counter = 0;
        while (counter < personArray.length) {
            currentPerson += personArray[counter].toString();

            counter++;
        }
        return currentPerson;
    }
    // create a `counter`
    // while `counter` is less than length of array
    // begin loop

    // use `counter` to identify the `current Person` in the array
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable

    // end loop



    public String forLoop() {
        String result = "";
        int counter = 0;

        for (counter = 0; counter < personArray.length; counter++) {
            result += personArray[counter].toString();
        }

        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop



        return result;
    }



    public String forEachLoop() {
        String result = "";
        int counter = 0;

        for (Person currentPerson: personArray) {
            result += currentPerson;
        }

        // identify array's type
        // identify array's variable-name

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
