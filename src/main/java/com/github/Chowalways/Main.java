package com.github.Chowalways;

import java.util.Scanner;

public class Main {
    /**
     * Main function for the activities function
     * acts as the menu for different activities functions
     *
     *  Add adds an activity
     *  Delete deletes an activity
     *  View views all activities
     *  Exit closes program
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int ans;
        Activities add = new Activities("");//create new object add
        Activities delete = new Activities("");//create new object delete
        Activities view = new Activities("");//create new object view

        // the below acts as a menu for the user to choose and the switch case
        // is used to select methods based on the users selection
        System.out.println("Welcome to the Activities section!");
        System.out.println("What would you like to do?");
        System.out.println("1. ADD an activity");
        System.out.println("2. DELETE an activity");
        System.out.println("3. View all activities");
        System.out.println("4. EXIT");
        ans = scan.nextInt();
        switch (ans) {
            case 1:// adds an activity
                ClearScreen.clear();
                System.out.println("Adding an activity");
                Activities.add();
                break;
            case 2:// deletes an activity
                ClearScreen.clear();
                System.out.println("Deleting an activity");
                System.out.println("What Activity would you like to delete?");
                Scanner delAct = new Scanner(System.in);
                String actName = delAct.nextLine();
                Activities.delete(actName);
                break;
            case 3: // view activities
                ClearScreen.clear();
                Activities.view();
                break;
            default:
                System.out.println("You chose to exit"); // exits program
                ClearScreen.clear();
                break;

            }
        }
    }
