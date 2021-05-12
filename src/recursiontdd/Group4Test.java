package recursiontdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursiontdd.Group4; //rename to reference proper class

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/

public class Group4Test { // rename class to refere proper class

    /**
     * An initial test
     */
    @Test
    public void Test1(){
        assertEquals(0, Group4.bunnyEars2(0));
    }

    @Test 
    public void Test2(){
        assertEquals(2, Group4.bunnyEars2(1));
    }

    @Test
    public void Test3(){
        assertEquals(5, Group4.bunnyEars2(2));
    }

    @Test
    public void Test4(){
        assertEquals(7, Group4.bunnyEars2(3));
    }


  
}
