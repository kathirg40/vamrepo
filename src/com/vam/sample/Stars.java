package com.vam.sample;

public class Stars {
	
public void PrintStars() {
	
	int row, numberOfStars;
	 
    for (row = 1; row <= 10; row++) {
      for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
        System.out.print("*");
      }
      System.out.println(); // Go to next line
    }
}
	
    public void PrintPercentage() {
    	
    	int row, numberOfStars;
    	 
        for (row = 1; row <= 10; row++) {
          for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
            System.out.print("%%");
            System.out.println("#");
            System.out.print("$");
          }
          System.out.println(); // Go to next line
        }
    	
	
}

}
