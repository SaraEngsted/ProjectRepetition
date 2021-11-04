import Exercise2.Exercise2Cars;
import Exercise2.Exercise2StationCar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Repetition {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //Exercise 1 - explain inheritance
        System.out.println("-------- Exercise 1 -------");
        /*
        Inheritance eller nedarvning er når en class har subclasses/childclasses, hvor den nedarver fra.
        Dvs. at klasserne nedarver deres fælles atributer, og vi kan derefter tilføje dem de ikke har tilfælles -
        dette gør vi ved at extende vores atributer fra parentclass til vores childclasses.
        Når vi har gjort dette vil vores class bede om en constructor(en metode, som automatisk bliver kaldt i vores main),
        hvortil den vil forslå "super" i stedet for "this" - altså constructoren fra vores parentclass.
        Altså er Inheritance når en class/classes nedarver constructor og metoder fra en anden class .
        Man skal dog huske at parentclass er noget andet end childclass - childclass vil være den der extender fra parentclass.

        Et eksemple:
        Hvis vores parentclass er "frugt", så kunne vi have childclasses der kunne hedde "æble"
        ⬇
        childclass - public class æble extends frugt.

        Man kan overskrive ens metode som kommer fra ens class - Det kan vi gøre ved at @override metoden fra den parentclass
        til den anden class. Her vil man også kunne ændre den.

        Alt i alt giver Inheritance et godt overblik når du koder.


         */


        //Exercise 2 - - exemplify the concept inheritance

        System.out.println();
        System.out.println("------ Exercise 2 ------");

        Exercise2Cars stationCar = new Exercise2Cars("BMW", "red", 220, 50);
        System.out.println(stationCar);

        Exercise2StationCar Ferrari = new Exercise2StationCar("ferrari", "blue", 200, 170);
        System.out.println(Ferrari);



        //Exercise 3 - the amount of words in a file
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

        //Exercise 4 - population i 5 years
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


        //Exercise 5 - explanation of the method
        System.out.println();
        System.out.println("------- Exercise 5 -------");
        /*
        First the program generates random numbers from 0 to 10.
        Then it prints out the random numbers.
        The method below makes sure that there are only 10 numbers to choose from.

         */


        //Exercise 6 - random number and remove the multiples
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

        //Exercise 7 - static explanation
        System.out.println();
        System.out.println("-------- Exercise 7 -------");

        /*
        Static er et nøgleord der gør man kan bruge metoder eller klasser i andre klasser eller metoder.

         */




    }
}
