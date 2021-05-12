package recursiontdd;

// Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

public class Group3 {
  public static int countX(String str) {
    if (str.length() == 0) { // base case
      return 0;
    } 
    
    if (str.charAt(0) == 'x') { // recursive case
      return 1 + countX(str.substring(1));
    } 

    return countX(str.substring(1));
  }
}

/**
  String temp;
  temp = str.replaceAll("x", "");
  return str.length() - temp.length();
*/

/**
  if(str.length()==0)
    return 0;
  if(str.charAt(0)=='x')
    return 1+countX(str.substring(1)); 
  return countX(str.substring(1));
*/

// c++
/**
  int countX(std::string str){
    if(str.substr(0,1)=="x")
      return 1+countX(str.substr(1));
    if(str!="")
      return countX(str.substr(1));
    return 0;
  }
*/