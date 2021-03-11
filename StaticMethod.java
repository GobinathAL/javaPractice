import java.util.Scanner;
class Book {
    private static int noOfBooks = 0;
    private String title, author;
    private int yearOfPublication;
    private int edition;
    public Book(String title, String author, int yearOfPublication, int edition) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.edition = edition;
        noOfBooks++;
    }
    public static void dispNoOfBooks() {     //static method which displays the number of books
        System.out.println(noOfBooks);
    }
    public boolean isSameAuthor(Book b) {
        return author.equals(b.author);
    }
    public boolean isPublishedEarlier(Book b) {
        return yearOfPublication < b.yearOfPublication;
    }
}
public class StaticMethod {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        System.out.printf("Book 1\nTitle:");
        String title = sc.next();
        System.out.printf("Author:");
        String author = sc.next();
        System.out.printf("Year Of Publicaiton:");
        int yearOfPublication = sc.nextInt();
        System.out.printf("Edition:");
        int edition = sc.nextInt();
        Book b1 = new Book(title, author, yearOfPublication, edition);
        
        System.out.printf("Book 2\nTitle:");
        title = sc.next();
        System.out.printf("Author:");
        author = sc.next();
        System.out.printf("Year Of Publication:");
        yearOfPublication = sc.nextInt();
        System.out.printf("Edition:");
        edition = sc.nextInt();
        
        Book b2 = new Book(title, author, yearOfPublication, edition);
        
        System.out.println("No of books:");
        Book.dispNoOfBooks(); //calling a static method

        if(b1.isSameAuthor(b2))
            System.out.println("Same Author");
        else
            System.out.println("Different Authors");
        if(b1.isPublishedEarlier(b2))
            System.out.println("Book 1 is published earlier");
        else
            System.out.println("Book 1 is not published earlier");
    }
}
