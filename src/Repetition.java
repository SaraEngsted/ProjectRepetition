import Exercise2.Exercise2Cars;
import Exercise2.Exercise2StationCar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Repetition {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //Exercise 1
        System.out.println("-------- Exercise 1 -------");
        //


        //Exercise 2 - - exemplify the concept inheritance

        System.out.println();
        System.out.println("------ Exercise 2 ------");

        Exercise2Cars stationCar = new Exercise2Cars("BMW", "red", 220, 50);
        System.out.println(stationCar);

        Exercise2StationCar Ferrari = new Exercise2StationCar("ferrari", "blue", 200, 170);
        System.out.println(Ferrari);



        //Exercise 3 -
        System.out.println();
        System.out.println("------ Exercise 3 -------");

        ArrayList<String> words = new ArrayList<String>();

        try {
            Scanner scanner = new Scanner(new File("Recourcer/RandomWords.csv"));
            while (scanner.hasNextLine()) {
                words.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        System.out.println("This is how you get the amount of words there is in the file = " + words.size());

        //Exercise 4 -
        System.out.println();
        System.out.println("------Exercise 4-------");

        //How many birth and deaths compared to the current population:
        int birthPerSecond = 7;
        int deathPerSecond = 13;
        int future5Years = 5;
        int population = 331002651;
        //Seconds, hours, future years, population:
        int secondsInAMinute = 60;
        int minutesInAnHour = 60;
        int hourInADay = 24;
        int daysInAYear = 365;

        int fiveYearsFromNow = (secondsInAMinute * minutesInAnHour * hourInADay * daysInAYear * future5Years);

        int death = fiveYearsFromNow / deathPerSecond;
        int birth = fiveYearsFromNow / birthPerSecond;

        int growthOfPopulation = birth - death;

        //Population in 5 years:
        int populationIn5Years = population + growthOfPopulation;

        System.out.println("This is the growth " + growthOfPopulation);
        System.out.println("the population in 5 years will be " + populationIn5Years);


        //Exercise 5
        System.out.println();
        System.out.println("------- Exercise 5 -------");
        //First the program generates random numbers from 0 to 10.
        //Then it prints out the random numbers.
        //The method below makes sure that there are only 10 numbers to choose from.


        //Exercise 6
        System.out.println();
        System.out.println("-------- Exercise 6 ------");

        ArrayList<Integer> numbers1to100 = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            numbers1to100.add(i);
        }

        System.out.println(numbers1to100);
        System.out.println("Please choose a number to remove the multiples of that number from the list");
        int chosenNumber = scanner.nextInt();

        numbers1to100.removeIf(integer -> (integer % chosenNumber == 0 && integer != chosenNumber));
        System.out.println(numbers1to100);






    }
}
