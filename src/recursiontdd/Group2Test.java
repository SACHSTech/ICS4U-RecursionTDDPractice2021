package recursiontdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursiontdd.Group2; //rename to reference proper class

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/

public class Group2Test { // rename class to refere proper class

    /**
     * An initial test
     */
    @Test
    public void Test1(){
        // make assertion statement(s)
        assertEquals(9, Group2.sumDigits(126));
    }

   //Add additional tests
    @Test
      public void Test2(){
          // make assertion statement(s)
          assertEquals(13, Group2.sumDigits(49));
      }
    @Test
    public void Test3(){
          // make assertion statement(s)
          assertEquals(3, Group2.sumDigits(12));
      }
      @Test
    public void Test4(){
          // make assertion statement(s)
          assertEquals(18, Group2.sumDigits(42156));
      }
      @Test
    public void Test5(){
          // make assertion statement(s)
          assertEquals(44, Group2.sumDigits(47239874));
      }
}
