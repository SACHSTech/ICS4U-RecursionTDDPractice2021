package recursiontdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursiontdd.Group5;
 //rename to reference proper class

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/

public class Group5Test { 
    /**
     * An initial test
     */
    @Test
    public void Test1(){
        assertEquals("codey", Group5.changeXY("codex")); 
    }
    @Test
    public void Test2(){
        assertEquals("yyhiyy", Group5.changeXY("xxhixx"));
    }

    @Test
    public void Test3(){
        assertEquals("yhiyhiy", Group5.changeXY("xhixhix"));
    }

    @Test
    public void Test4(){
        assertEquals("yyy", Group5.changeXY("xxx"));
    }
  
}
