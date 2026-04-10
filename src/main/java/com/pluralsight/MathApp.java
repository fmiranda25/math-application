package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1
        int bobSalary = 50000;
        int garySalary = 45000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " +highestSalary);

        // Question 2
        int carPrice = 7300;
        int truckPrice = 9600;
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println(smallestPrice);

        // Question 3
        double circleRadius = 7.25;
        double circleSurfaceArea = 3.14 * (float) Math.pow(circleRadius, 2);
        System.out.println(circleSurfaceArea);

        // Question 4
        double rootable = 5.0;
        double squareRooted = Math.sqrt(rootable);
        System.out.println(squareRooted);

        // Question 5
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distanceBetweenPoints = Math.hypot(x2 - x1, y2 - y1);
        System.out.println(distanceBetweenPoints);

        // Question 6
        double notAbsolute = -3.8;
        double isAbsolute = Math.abs(notAbsolute);
        System.out.println(isAbsolute);

        // Question 7
        System.out.println((double) Math.random());

        // Question 8
        int minutesInDay = 60;
        int hoursInDay = 24;
        int twentyFourDays = 24;
        System.out.println(minutesInDay * hoursInDay * twentyFourDays);







    }
}
