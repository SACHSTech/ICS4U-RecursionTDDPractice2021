package recursiontdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursiontdd.Group3; //rename to reference proper class

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/

public class Group3Test { // rename class to refere proper class

    /**
     * An initial test
     */
    @Test
    public void Test1(){
      assertEquals(4, Group3.countX("xxhixx")); 
        // make assertion statement(s)
    }

   //Add additional tests
   @Test
   public void Test2() {
     assertEquals (3, Group3.countX("xhixhix"));
   }

   @Test
   public void Test3() {
     assertEquals (0, Group3.countX("hi"));
   }

   @Test
   public void Test4() {
     assertEquals (1, Group3.countX("x"));
   }

   @Test
   public void Test5() {
     assertEquals (0, Group3.countX(""));
   }
  
}
