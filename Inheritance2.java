/*
Create a class Book with following members:  
B.No, Title, Author, Publisher, Price, number of books sold

Derive a class Hard Copy from Book with following members:
Number of pages

Use constructors for initialization of data members.  
a)Number of books sold should get updated for each hard Copy is sold
b)For a given author find the number of books sold.
c)Write function to find the book with highest price
 */
import java.util.Scanner;
class Book {
    static int noOfBooksSold = 0;
    int bno;
    String title, author, publisher;
    double price;
    public Book(int bno, String title,String author, String publisher, double price) {
        this.bno = bno;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
}
class HardCopy extends Book {
    private int noOfPages;
    public HardCopy(int bno, String title,String author, String publisher, double price, int noOfPages) {
        super(bno, title, author, publisher, price);
        this.noOfPages = noOfPages;
        noOfBooksSold++;
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HardCopy[] bArr = new HardCopy[100];
        for(int i = 0; ; i++) {
            System.out.println("Enter bno, title, author, publisher, price, noOfPages... -1 to exit");
            int bno = sc.nextInt();
            if(bno == -1)
                break;
            else 
                bArr[i] = new HardCopy(bno, sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt());
        }
        System.out.println("No of books sold: " + Book.noOfBooksSold);
        System.out.println("Enter an author name to find out the no of books sold");
        String author = sc.next();
        int count = 0;
        for(int i = 0; i < Book.noOfBooksSold; i++) {
            if(bArr[i].author.equals(author))
                count++;
        }
        System.out.println("No of books sold for author " + author + " is " + count);
        System.out.println("Bno " + costliestBook(bArr) + " has the highest price");
    }
    public static int costliestBook(HardCopy[] b) {
        double maxPrice = 0;
        int bno = -1;
        for(int i = 0; i < Book.noOfBooksSold; i++) {
            if(b[i].price > maxPrice) {
                maxPrice = b[i].price;
                bno = b[i].bno;
            }
        }
        return bno;
    }
}
