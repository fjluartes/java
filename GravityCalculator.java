// Fred Luartes, 10/6/2016
// GravityCalculator: This program computes for the position of a falling object.

import java.util.Scanner;

class GravityCalculator {
    public static void main(String[] args) {
        double gravity, fallingTime, initialVelocity, initialPosition, finalPosition;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter initial distance(m): ");
        initialPosition = keyboard.nextDouble();
        System.out.println("Enter initial velocity(m/s): ");
        initialVelocity = keyboard.nextDouble();
        System.out.println("Enter time(s): ");
        fallingTime = keyboard.nextDouble();
        gravity = -9.81;

        finalPosition = (0.5 * gravity * Math.pow(fallingTime, 2)) + (initialVelocity * fallingTime) + initialPosition;
        System.out.println("Displacement after " + fallingTime + " seconds is " + finalPosition + " m.");
    }
}
