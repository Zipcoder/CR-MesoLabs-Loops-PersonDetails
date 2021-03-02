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
        // create a `counter`
        double counter = 0;
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            Person newStr = personArray[(int) counter];
            result.append(newStr);
            counter ++;
        }
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        String output = result.toString();
        return output;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        for (int i = 0; i < personArray.length; i++) {
            Person newStr = personArray[i];
            result = result + newStr;
        }
        return result;
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for (Person person : personArray) {
            result = result + person;
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
