package recursiontdd; 

public class Group4{
  public static int bunnyEars2(int bunnies){
    


    // Base case
    if (bunnies == 0) {
      return 0;
    }

    // Recursive case
    // if number of bunnies is even
    else if (bunnies % 2 == 0) {
      return bunnyEars2(bunnies - 1) + 3;
    }
    
    else {
      return bunnyEars2(bunnies - 1) + 2;
    }
     
  }

}
