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
        // create a `counter`
        // while `counter` is less than length of array
        while (counter < personArray.length) { // begin loop

            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];

            // get `string Representation` of `currentPerson`
            String personString = currentPerson.toString();

            // append `stringRepresentation` to `result` variable
            result += personString;
            counter += 1;
        } // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value   0
        // identify terminal condition  i < personArray.length
        // identify increment  += 1

        for (int i = 0; i < personArray.length; i++) {
            result += personArray[i].toString();
        }

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
        // identify array's type Person
        // identify array's variable-name personArray

        for(Person p : personArray) {
            result += p.toString();
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
