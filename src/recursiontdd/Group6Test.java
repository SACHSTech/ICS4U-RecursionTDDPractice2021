package recursiontdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursiontdd.Group6; //rename to reference proper class

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/

public class Group6Test { // rename class to refere proper class

    /**
     * An initial test
     */
    @Test
    public void Test1(){
        assertEquals(true, Group6.array6(new int[]{1, 6, 4}, 0));
    }

    public void Test2(){
        assertEquals(true, Group6.array6(new int[]{1, 6}, 0));
    }

    public void Test3(){
        assertEquals(false, Group6.array6(new int[]{1, 4}, 0));
    }

   //Add additional tests
  
}
