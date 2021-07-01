package com.zipcodewilmington;

//import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

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
        // while `counter` is less than length of array
            // begin loop
               // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        while(counter < personArray.length)
        {
            String currentPerson = personArray[counter].toString();
            result += currentPerson;
            counter++;

        }

        return result;
    }



    public String forLoop() {
        String result = "";
        String counter = "currentPerson";
        // identify initial value
        // identify terminal condition
        // identify increment
     for (int i = 0; i < personArray.length; i++){
         String currentPerson = personArray[i].toString();
         result += currentPerson;

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
        String counter = "currentPerson";

        for (Person peps : personArray){

           // String currentPerson = personArray[].toString();
            result += peps.toString();

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



