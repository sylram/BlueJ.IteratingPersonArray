 
import java.lang.String;
import java.util.Arrays;
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
        // while `counter` is less than length of array
            // begin loop
            int i=0;
              while(i<personArray.length){
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
                result = result + personArray[i];
                //{result =(String)personArray[i];
                i++;}
            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
            for (int i=0; i<personArray.length;i++){
        // use the above clauses to declare for-loop signature
            // begin loop 
            result = result+ personArray[i];
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
            }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
            for (Person item: personArray){
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
           result = result+item;
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
