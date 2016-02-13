package Application;

//  Created by Clayton Paplaczyk
//  Description: Allows user to enter number and reads number to user as output. 

import java.util.Scanner;  // use the Scanner class located in the "java.util" directory
import java.io.FileInputStream;
import java.io.IOException; 

public class Application {
  public static void main (String[] args) {
	  
	  try{
		  System.setIn(new FileInputStream("./test/input4.txt"));
		  }catch(IOException e){
			  e.printStackTrace();
		  } 

     int number;

     Scanner console = new Scanner(System.in);

     number = console.nextInt();     // read an integer entered by a user

    // display the number with other messages
    System.out.print("This program reads an integer from a keyboard,\n"
                   + "and prints it out on the display screen.\n"
                   + "The number is " + number + ".\n"
                   + "Make sure that you get the exact same output as the expected one.\n");
  }
}