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
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < this.personArray.length){
            result.append(this.personArray[i]);
            i++;
        }
            // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder();
        // identify initial value
        // identify terminal condition
        // identify increment

        for(int i = 0; i < this.personArray.length; i++){
            result.append(this.personArray[i]);
        }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        // identify array's type
        // identify array's variable-name


        for (Person person : this.personArray){
            result.append(person.toString());
        }
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
