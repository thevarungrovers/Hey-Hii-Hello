
package javaprojects;

import java.util.Scanner;


public class SwitchCase {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); // to take input
        
        System.out.print("Pick one of the following: \n 1.Hey\n 2.Hii\n 3.Hello\n");
        int choice = s.nextInt(); // taking input
        
//        switch case
        switch(choice){
            case 1: System.out.println("You selected Hey");
                break;
            case 2: System.out.println("You selected Hii"); 
                break; 
            case 3: System.out.println("You selected Hello"); 
                break;
            default: System.out.println("Please enter a valid number!"); 
        }
    }
}
