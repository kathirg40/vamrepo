package com.vam.sample;

public class Stars {
	
public void printStars() {
	
	int row, numberOfStars;
	 
    for (row = 1; row <= 10; row++) {
      for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
        System.out.print("*");
      }
      System.out.println(); // Go to next line
      System.out.println(); // Go to next line
    }
}

public void printPercentage() {
	
	int row, numberOfStars;
	 
    for (row = 1; row <= 10; row++) {
      for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
        System.out.print("%");
      }
      System.out.println(); // Go to next line
      System.out.println(); // Go to next line
    }
}

public void printDollor() {
	
	int row, numberOfStars;
	 
    for (row = 1; row <= 10; row++) {
      for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
        System.out.print("$");
      }
      System.out.println(); // Go to next line
      System.out.println(); // Go to next line
    }
}
      
   
}
