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
        // while `counter` is less than length of array
            // begin loop
        int i = 0;
        while (i< personArray.length) {
            // use `counter` to identify the `current Person` in the array
            personArray[i].getFirstName();
            personArray[i].getLastName();
            // get `string Representation` of `currentPerson`
            String addName = personArray[i].toString();
            // append `stringRepresentation` to `result` variable
            result += addName;
            i++;
        }
            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        int initial = 0;
        // identify terminal condition
        int terminal = personArray.length;
        // identify increment
        //i++

        // use the above clauses to declare for-loop signature
            // begin loop
        for (int i = initial; i < terminal ; i++) {
            personArray[i].getFirstName();
            personArray[i].getLastName();
            String addName = personArray[i].toString();
            result += addName;

        }
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

        // use the above discoveries to declare for-each-loop signature
            // begin loop
        for (Person peeps: personArray ) {
            peeps.getFirstName();
            peeps.getLastName();
            String addName = peeps.toString();
            result += addName;

            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
