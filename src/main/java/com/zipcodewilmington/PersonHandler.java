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

        int counter = 0;

        String result = "";
        while (counter < personArray.length) {
            result += personArray[counter].toString();
            counter++;

        }

        return result;


    }

        // create a `counter`
        // while `counter` is less than length of array
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop





    public String forLoop() {

        int i = 0;
        String result = "";
        for (i = 0; i < personArray.length; i++) {
            result += personArray[i].toString();
        }
        return result;
        // identify initial value
        // identify terminal condition
        // identify increment

    }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop






   public String forEachLoop() {

        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        String result = "";



        for (Person i : personArray) {


            result += i.toString();
        }


        return result;
    }


    public Person[] getPersonArray() {



        return personArray;
    }
}
