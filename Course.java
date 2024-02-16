
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

    public void setFirstName(String firstName)
    {
        this.firstName = firstName; 
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName; 
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public void setOfficeNumber(String officeNumber)
    {
        this.officeNumber = officeNumber; 
    }

    public String getOfficeNumber()
    {
        return this.officeNumber;
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

    public void setTitle(String title)
    {
        this.title = title; 
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setAuthor(String author)
    {
        this.author = author; 
    }

    public String getAuthor()
    {
        return this.author;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher; 
    }

    public String getPublisher()
    {
        return this.publisher;
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

    public void setName(String name)
    {
        this.name = name; 
    }

    public String getName()
    {
        return this.name;
    }

    public void print()
    {
        System.out.println("The name of the course is " + this.getName() + ", the name of the Instructor is " + instructor.getFirstName() + " " + instructor.getLastName() + ", and their office number is " + instructor.getOfficeNumber());
        System.out.println("The name of the textbook is " + textbook.getTitle() + ", the author of the book is " + textbook.getAuthor() + ", and the publisher is " + textbook.getPublisher());
    }
    
}
