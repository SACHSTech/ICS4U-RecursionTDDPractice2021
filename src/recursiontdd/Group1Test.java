package recursiontdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursiontdd.Group1; //rename to reference proper class

/**
* See https://github.com/mrfabroa/Fabroa-ICS4U-NotesExamples/blob/main/src/tdd/TDDExampleTest.java for an example
*/

public class Group1Test { // rename class to refere proper class

@Test
public void Test1(){
  assertEquals(0, Group1.triangle(0)); 
}

@Test
public void Test2(){
  assertEquals(1, Group1.triangle(1));
}

@Test
public void Test3(){
  assertEquals(3, Group1.triangle(2));
}

 
}

 
  
