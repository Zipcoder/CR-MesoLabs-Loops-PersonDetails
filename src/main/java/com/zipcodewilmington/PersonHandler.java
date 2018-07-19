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
        StringBuilder person = new StringBuilder();
        while (counter < personArray.length) {
            result = "\nMy first name is " + personArray[counter].getFirstName() + "\nMy last name is " + personArray[counter].getLastName();
            person.append(result);

            counter++;
        }

        // assume there is a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return person.toString();
    }



    public String forLoop() {
        String result = "";
        int counter = 0;
        StringBuilder person = new StringBuilder();
        for (counter = 0; counter < personArray.length; counter++) {
            result = "\nMy first name is " + personArray[counter].getFirstName() + "\nMy last name is " + personArray[counter].getLastName();
            person.append(result);
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

        return person.toString();
    }



    public String forEachLoop() {
        String result = "";
        int counter = 0;
        StringBuilder person = new StringBuilder();
        for (Person element: personArray) {

            result = "\n" + "My first name is " + personArray[counter].getFirstName()
                    + "\n" + "My last name is " + personArray[counter].getLastName();

            person.append(result);

            counter++;


        }
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return person.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
