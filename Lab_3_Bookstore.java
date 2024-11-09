import java.util.ArrayList;

class Book {
    String name;
    String author;
    double price;
    int numPages;

    public Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getNumPages() {
        return numPages;
    }
}

public class Bookstore {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Computer Science", "Edward", 110.0, 250));
        books.add(new Book("Wings of Fire", "APJ Abdul Kalam", 150.0, 300));
        books.add(new Book("Python Programming", "Guido van Rossum", 200.0, 450));

        for (Book book : books) {
            System.out.println("Book Name: " + book.getName());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: " + book.getPrice());
            System.out.println("Number of Pages: " + book.getNumPages());
            System.out.println("--------------------------");
        }
}
}
