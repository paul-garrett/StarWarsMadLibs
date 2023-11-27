import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Make a MadLib with 7 nouns, 7 verbs, and 7 adjectives
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, welcome to Star Wars MadLibs!");
        System.out.println("Please enter 2 nouns.");
        String noun1 = scan.next();
        String noun2 = scan.next();

        System.out.println("Ok, enter 2 plural nouns.");
        String pNoun1 = scan.next();
        String pNoun2 = scan.next();


        System.out.println("Thank you. Good Choices. Please enter 2 adverbs.");
        String adverb1 = scan.next();
        String adverb2 = scan.next();


        System.out.println("Nice answers! Now, enter 4 adjectives.");
        String adj1 = scan.next();
        String adj2 = scan.next();
        String adj3 = scan.next();
        String adj4 = scan.next();

        System.out.println("Lastly, enter 3 body parts");
        String bodyPart1 = scan.next();
        String bodyPart2 = scan.next();
        String bodyPart3 = scan.next();

        System.out.println("You did it! Type 'y' and press enter to read your MadLib.");
        String answer = scan.next();

        // System.out.println("Your 7 nouns are: "+noun1+", "+noun2+", "+noun3+", "+noun4+", "+noun5+", "+noun6+", and "+noun7+". Your 7 verbs are: "+verb1+", "+verb2+", "+verb3+", "+verb4+", "+verb5+", "+verb6+", and "+verb7+". Your 7 adjectives are:  "+adj1+", "+adj2+", "+adj3+", "+adj4+", "+adj5+", "+adj6+", and "+adj7+".");

        System.out.println("The Force is a mystical, " +adj1+ " power. As Jedi Master Obi-Wan Kenobi once said, 'The Force is an energy field, created by all living " +pNoun1+
                ", that surrounds us, penetrates us, and binds the "+noun1+
                " together.' Using the power of the Force, a Jedi can do many " +adj2+
                " things, like using the Force to exercise " +bodyPart1+
                " control over " +adj3+"-minded " +pNoun2+
                ". A Jedi can also use the Force to move obiects with his or her " +bodyPart2+
                " It doesn't matter how " +adj4+ " these objects are; it only matters how " +adverb1+
                " the Jedi believes in the Force. Most importantly, the Force teaches a Jedi to rely on his or her feelings. As Obi-Wan Kenobi told his student, Luke "+noun2+
                "-walker: 'Your "+bodyPart3+" can deceive you. Don't trust them.' Instead, a Jedi should "+adverb2+" trust in the Force.");
    }
}
