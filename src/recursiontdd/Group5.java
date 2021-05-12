package recursiontdd;
import java.io.*;

public class Group5{
  
  public static String changeXY(String str){
    int length = str.length();

  // when to stop the thing
    if(length == 0){
      return str; 
    }

  //hmm idk what im trying to do here / idek if this is legal.... how do we write the test?
    else if(str.charAt(0) == 'x'){
      return 'y' + changeXY(str.substring(1)); 
    }
    return str.charAt(0) + changeXY(str.substring(1));
  } 
}
