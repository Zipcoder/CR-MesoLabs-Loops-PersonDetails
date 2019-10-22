package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }
    //String myFirstName = "\nMy first name is ";
    //String myLastName = "\nMy last name is ";

    public String whileLoop() {
        String result = "";
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
            int loopLength = 0;

            while  (loopLength < personArray.length)
            {
                //result = result + myFirstName + personArray[loopLength].getFirstName() + myLastName + personArray[loopLength].getLastName();
                result += personArray[loopLength].toString();
                loopLength++;
            }


        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop


        for ( int i=0 ; i<personArray.length; i++)
        {
            //result = result + myFirstName + personArray[i].getFirstName() + myLastName + personArray[i].getLastName();
            result = result + personArray[i].toString();
        }

        return result;
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
        for (Person pers: personArray)
        {
        //result = result + myFirstName + pers.getFirstName() + myLastName + pers.getLastName();
            result = result + pers.toString(); //calling toString method from Person Class to display the concat string

        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
