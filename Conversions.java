package dev.totaltax; // This may caues an issue when compiling (I have a gradle project for this class) if it fails to compile try removing this.

import java.util.Scanner;
import java.lang.Math;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Feet to Meters");
            System.out.println("4. Meters to Feet");
            System.out.println("5. Ounces to Milliliters");
            System.out.println("6. Milliliters to Ounces");
            System.out.println("7. Rad to Deg");
            System.out.println("8. Deg to Rad");
            System.out.println("9. Exit");

            //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
            //You can add even more if you would like.

            int selection = keyboard.nextInt();
            keyboard.nextLine();  //go past the endline and be ready for more input

            if (selection == 1) {
                System.out.println("Enter Celsius: ");
                double celsius = keyboard.nextDouble();
                keyboard.nextLine();
                double fahrenheit = celsius * (9.0 / 5.0) + 32;
                System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
            } else if (selection == 2) {
                System.out.println("Enter Fahrenheit: ");
                double fahr = keyboard.nextDouble();
                keyboard.nextLine();
                double res = (fahr - 32) * 5 / 9;
                System.out.println(fahr + " degrees fahrenheit is " + res + " degrees celsius");
                //add the code to ask the user to enter Fahrenheit and then convert to Celsius
            } else if (selection == 3) {
                System.out.println("Enter feet: ");
                double feet = keyboard.nextDouble();
                keyboard.nextLine();
                double res = feet / 3.281;
                System.out.println(feet + " feet is " + res + " meters");
            } else if (selection == 4) {
                System.out.println("Enter meters: ");
                double meters = keyboard.nextDouble();
                keyboard.nextLine();
                double res = meters * 3.281;
                System.out.println(meters + " meters is " + res + " feet");
            } else if (selection == 5) {
                System.out.println("Enter ounces: ");
                double in = keyboard.nextDouble();
                keyboard.nextLine();
                double res = in * 29.574;
                System.out.println(in + " ounces is " + res + " milli");
            } else if (selection == 6) {
                System.out.println("Enter milli: ");
                double in = keyboard.nextDouble();
                keyboard.nextLine();
                double res = in / 29.574;
                System.out.println(in + " milli is " + res + " ounces");
            } else if (selection == 7) {
                System.out.println("Enter rad: ");
                double in = keyboard.nextDouble();
                keyboard.nextLine();
                double res = in * 180 / Math.PI;
                System.out.println(in + " red is " + res + " deg");
            } else if (selection == 8) {
                System.out.println("Enter deg: ");
                double in = keyboard.nextDouble();
                keyboard.nextLine();
                double res = in * Math.PI / 180;
                System.out.println(in + " deg is " + res + " rad");
            } else if (selection == 9) {
                System.exit(0);
            } else {
                System.out.println("Unknown option " + selection);
            }
            ;
            //add more if statements here.
        }
    }
}
