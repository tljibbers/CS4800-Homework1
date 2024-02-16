package Course;

public class courseMain {

    public static void main(String[] args)
    {
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook cleanCode = new Textbook("Clean Code", "Robert Cecil Martin", "Pearson");
        Course cs4800 = new Course("CS 4800", nima, cleanCode);
        cs4800.print();

        Instructor grey = new Instructor("Grey", "Jones", "4-5128");
        Textbook gameProgramTextbook = new Textbook("Game Programming Patterns", "Robert Nystrom", "Genever Benning");
        Course cs4700 = new Course("Game Development", grey, gameProgramTextbook);
        cs4700.print();
    }
    
}
