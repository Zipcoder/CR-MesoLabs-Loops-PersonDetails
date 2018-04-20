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
        StringBuilder currentPerson = new StringBuilder();
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            currentPerson.append(personArray[counter]);
            // get `string Representation` of `currentPerson`

            // append `stringRepresentation` to `result` variable
            // end loop
            counter++;
        }
        return currentPerson.toString();
    }



    public String forLoop() {
        String result = "";
        StringBuilder currentPerson = new StringBuilder();
        // identify initial value
        // identify terminal condition
        // identify increment
        for (int i = 0; i < personArray.length; i++) {
            // use the above clauses to declare for-loop signature
            // begin loop
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            currentPerson.append(personArray[i]);
            // append `stringRepresentation` to `result` variable
            // end loop
        }

        return currentPerson.toString();
    }



    public String forEachLoop() {
        String result = "";
        StringBuilder feedCurrentPerson = new StringBuilder();
        // identify array's type
        // identify array's variable-name
        for (Person currentPerson : personArray){
            feedCurrentPerson.append(currentPerson);
        }
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return feedCurrentPerson.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
