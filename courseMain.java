
public class courseMain {

    public static void main(String[] args)
    {
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        nima.setFirstName("Nima");
        nima.setLastName("Davarpanah");
        nima.setOfficeNumber("3-2636");

        Textbook cleanCode = new Textbook("Clean Code", "Robert Cecil Martin", "Pearson");
        cleanCode.setTitle("Clean Code");
        cleanCode.setAuthor("Robert Cecil Martin");
        cleanCode.setPublisher("Pearson");

        Course cs4800 = new Course("CS 4800", nima, cleanCode);
        cs4800.setName("CS-4800");
        cs4800.print();

        Instructor grey = new Instructor("Grey", "Jones", "4-5128");
        grey.setFirstName("Grey");
        grey.setLastName("Jones");
        grey.setOfficeNumber("4-5128");

        Textbook gameProgramTextbook = new Textbook("Game Programming Patterns", "Robert Nystrom", "Genever Benning");
        gameProgramTextbook.setTitle("Game Programming Patterns");
        gameProgramTextbook.setAuthor("Robert Nystrom");
        gameProgramTextbook.setPublisher("Genever Benning");

        Course cs4700 = new Course("Game Development", grey, gameProgramTextbook);
        cs4700.setName("Game Development");
        cs4700.print();
    }
    
}
