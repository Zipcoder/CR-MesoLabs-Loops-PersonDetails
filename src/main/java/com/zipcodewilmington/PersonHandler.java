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
        int count = 0;
        while (count < personArray.length) {
            for (int i = 0; i < personArray.length; i++) {
                result += personArray[count].toString();
                count++;

            }   return result;
        }
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        //int count = 0;
        for (int counter = 0 ; counter < personArray.length; counter++) {
           // count++;
            String currentPerson = personArray[counter].toString(); //use counter to identify current person
            result += currentPerson;
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
        int i = 0;
        Person person = personArray[i];


        for (Person currentPerson : personArray) { //for each loop (variable , array)
           String newPerson = currentPerson.toString();
           result += newPerson;
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
