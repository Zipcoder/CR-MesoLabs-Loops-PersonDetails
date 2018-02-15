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
        int personCounter = 0;
        // while `counter` is less than length of array
        while (personCounter < personArray.length) {

            // begin loop

            // use `counter` to identify the `current Person` in the array
              result += personArray[personCounter].toString();
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            personCounter++;
            // end loop
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        for (int i = 0; i < personArray.length; i++){

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
        // identify array's type
        // identify array's variable-name
            for (Person personElement : personArray){

                result += personElement.toString();
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
