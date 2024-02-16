package Course;
 
class Instructor {
    public String firstName;
    public String lastName;
    public String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }
}

class Textbook {
    public String title;
    public String author;
    public String publisher;

    public Textbook(String title, String author, String publisher)
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
}

public class Course {
    private String name;
    Instructor instructor;
    Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook)
    {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void print()
    {
        System.out.println("The name of the course is " + this.name + ", the name of the Instructor is " + instructor.firstName + " " + instructor.lastName + ", and their office number is " + instructor.officeNumber);
        System.out.println("The name of the textbook is " + textbook.title + ", the author of the book is " + textbook.author + ", and the publisher is " + textbook.publisher);
    }
    
}
