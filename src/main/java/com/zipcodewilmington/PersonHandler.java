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
        Integer counter = 0;

        while (counter < personArray.length) {
            String firstName = personArray[counter].getFirstName();
            String lastName = personArray[counter].getLastName();
            counter++;


            result.append("\nMy first name is " + firstName + "\n" +
                    "My last name is " + lastName);
        } return result.toString();


        // create a `counter`

        // while `counter` is less than length of array
        // begin loop

        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop


    }

    public String forLoop() {
        StringBuilder result = new StringBuilder();

        for (int counter = 1; counter < personArray.length; counter++) {
            String firstName = personArray[counter].getFirstName();
            String lastName = personArray[counter].getLastName();
            result.append("\nMy first name is " + firstName + "\n" +
                    "My last name is " + lastName);
        } return result.toString();
        // identify initial value
        // identify terminal condition
        // identify increment

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
