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
        int counter = 0;
        // while `counter` is less than length of array
            // begin loop
        while (counter < personArray.length){
            // use `counter` to identify the `current Person` in the array
            Person person = personArray[counter];
            // get `string Representation` of `currentPerson`
            String currentPerson = person.toString();
            // append `stringRepresentation` to `result` variable
            result += currentPerson ;

            // end loop
            counter++;

        }
        System.out.println(result);
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        int counter = 0;
        // identify terminal condition
        //(i > personArray.length);
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
        for (counter = 0; counter < personArray.length; counter++) {
            // use `counter` to identify the `current Person` in the array
            Person person = personArray[counter];
            // get `string Representation` of `currentPerson`
            String currentPerson = person.toString();
            // append `stringRepresentation` to `result` variable
            result += currentPerson;
            // another answer result += personArray[counter].toString();

            // end loop
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type

        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
        for (Person i : personArray) {
            // get `string Representation` of `currentPerson`
             result +=i.toString();
            // append `stringRepresentation` to `result` variable

            // end loop
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
