package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Explains the riddle to the user
        System.out.println("The Hallway riddle consists of someone walking down a hallway containing a finite number ");
        System.out.println("of doors number sequentially with door #1 being the one closest to you. the person in");
        System.out.println("the hallway walks from one end to the other a set number of times and every time they 'interact'");
        System.out.println("with a door they open/close. The person in the hallway interacts only with doors that are multiples of");
        System.out.println("The number of times they've walked up the hallway. For example on their first walk up the hallway they open/close");
        System.out.println("every door because every number is a multiple of 1, ont heir second walk up the hallway they interact with ");
        System.out.println("every other door because every other door is a multiple of 2 and so on until they complete the set number ");
        System.out.println("of loops which you determine. This program will help you to determine the state (open or close) of a door, you pick");
        System.out.println("which one, in a hallway with a certain number doors you decide, after a certain number of walks up the hallway which you decide.");
        System.out.println(" ");//Creates a blank space to separate the explanation adn the questions
        System.out.println(" ");//Creates a blank space to separate the explanation adn the questions

        //Lets User Decide the parameters for the hallway
        Scanner scan = new Scanner(System.in); //Allows user input using "scan"
        System.out.println("How many doors are in your hallway?");
        int door_numbers = scan.nextInt(); //Creates variable for total number of doors
        System.out.println("How many times does the person walk up the hallway?");
        int loop_numbers = scan.nextInt(); //Creates variable for the number of times someone walks down the hallway
        System.out.println("What door do you want to know the state of:");
        int door_of_interest = scan.nextInt(); //Creates variable for the door you want to find the state of
        door_state_find(door_numbers, loop_numbers, door_of_interest);
    }

    //Function to find State of the door given the 3 parameters
    public static boolean door_state_find(int number_of_door, int number_of_loops, int door_of_interest){
        //Declaring Variables
        int i = 1;
        boolean door_checker = true; //Figures out if the door changes state on the loop
        boolean state_of_door = false; //The door starts out as closed

         while(i <= number_of_loops){ //Simulates someone walking up the hallway for the number of loops
             //Switches the state of the door when necessary
             if(door_checker == true){
                 if (state_of_door == false) { state_of_door = true; } //Switches value of door
                 else if (state_of_door == true) { state_of_door = false; } //Switches state of door
            }

            i++; //Moves onto next loop or walk up the hallway
             if(door_of_interest % i == 0){ //The person interacts with the D.O.I
                door_checker = true; //You need to change the state of the door
             }else {
                 door_checker = false; //Otherwise you don't need to change the state of the door
             }
         }

         //Outputs the state of the door
         if(state_of_door == true){
             System.out.println(" Door #" +door_of_interest + " would be open");
         }
        if(state_of_door == false){
            System.out.println(" Door #" +door_of_interest + " would be closed");
        }
         return state_of_door;
    }
}

