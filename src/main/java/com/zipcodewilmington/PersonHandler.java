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
        // create a `counter`
        int counter =0;
        StringBuilder currentRep = new StringBuilder();
        // while `counter` is less than length of array
        while(counter < personArray.length) {
            // begin loop
            currentRep.append(personArray[counter].toString());
            // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
        counter++;
                // end loop
            }
        result = currentRep.toString();
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        StringBuilder currentRep = new StringBuilder();

        for(int i =0; i< personArray.length;i++) {
            // use the above clauses to declare for-loop signature
            // begin loop
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            currentRep.append(personArray[i].toString());

            // end loop
        }
        result = currentRep.toString();
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        StringBuilder currentRep = new StringBuilder();
        for (Person person  : personArray) {
            currentRep.append(person);

            // use the above discoveries to declare for-each-loop signature
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
        }
        result = currentRep.toString();
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
