//PA0.java
// Programmer: Molly Kyle
// Course: CS 212, Dr.Nweke
// Due Date: 2/1/24
// Class Assignment: 3
// Problem Statement: This program will calculate points earned by a skier and distance traveled by speed given
// Input: Type of hill, speed of the skier
// Output: Points earned, message
// Credits: none


import java.util.Objects;
import java.util.Scanner;
import java.lang.Math;

class HelloWorld {
    public static void main(String[] args) {

        //create input object
        Scanner input = new Scanner(System.in);

        //Output program purpose
        System.out.println("This program will output the points earned by a skier using the speed given.");

        //Ask user for hill type
        System.out.println("What hill type did the skier jump?");
        String hillType = input.next();


        while (!hillType.equals("normal") && !hillType.equals("large")) {
            System.out.println("What hill type did the skier jump?");
            hillType = input.next();
        }

        //Ask for jumper speed
        System.out.println("What was the speed of the jumper?");
        float SpeedOfJumper = input.nextFloat();


        //What will run if hill is type normal
        if (hillType.equals("normal")) {
            float height = 46;
            int PointPerMeter = 2;
            int Par = 90;
            double DistanceTraveled = (SpeedOfJumper) * Math.sqrt((2 * height) / 9.8);
            double PointsEarned = 60 + ((DistanceTraveled - Par) * PointPerMeter);
            System.out.println("You earned " + PointsEarned + " points");
            if (PointsEarned > 61) {
                System.out.println("Great job for doing better than par!");
            } else if (PointsEarned < 10) {
                System.out.println("What happened???");
            } else {
                System.out.println("Sorry you didn't go very far");
            }

            //What will run if hill type is large
        } else if (hillType.equals("large")) {
            float height = 70;
            double PointPerMeter = 1.8;
            int Par = 120;
            double DistanceTraveled = (SpeedOfJumper) * Math.sqrt((2 * height) / 9.8);
            double PointsEarned = 60 + ((DistanceTraveled - Par) * PointPerMeter);
            System.out.println("You earned " + PointsEarned + " points");
            if (PointsEarned > 61) {
                System.out.println("Great job for doing better than par!");
            } else if (PointsEarned < 10) {
                System.out.println("What happened???");
            } else {
                System.out.println("Sorry you didn't go very far");
            }
//
        }
    }
}