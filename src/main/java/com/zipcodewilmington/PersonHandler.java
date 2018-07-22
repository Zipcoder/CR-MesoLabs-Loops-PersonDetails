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
        // assume there is a `counter`
        int counter = 0;
        // while `counter` is less than length of array

        StringBuilder sb = new StringBuilder();

        while (counter < personArray.length) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            Person currentPerson = personArray[counter];
            // append `stringRepresentation` to `result` variable
            sb.append(personArray[counter]);
            counter++;

        }// end loop

        result = sb.toString();
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < personArray.length; i++) {

            // use the above clauses to declare for-loop signature
            // begin loop
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[i];
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            sb.append(currentPerson);

        }   // end loop

        result = sb.toString();

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

        StringBuilder sb = new StringBuilder();

        for (Person currentPerson : personArray) {
            sb.append(currentPerson);
        }

        result = sb.toString();

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
