import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String partyAfil;
        String trash = "";
        Scanner partySearch = new Scanner(System.in);

        System.out.print("Enter your party affiliation [R/D/I]: ");
        partyAfil = partySearch.nextLine().trim();

        if (partyAfil.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant");
        } else if (partyAfil.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey");
        } else if (partyAfil.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent man");
        } else {
            System.out.println("You must enter a valid party, not \"" + partyAfil + "\"");
            System.out.println("RUN THE PROGRAM AGAIN");
        }
    }
}