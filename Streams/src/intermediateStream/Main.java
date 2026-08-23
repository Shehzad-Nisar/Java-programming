package intermediateStream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Main {
    static void main() {


        List<Book> books = Arrays.asList(
                new Book("Clean Code", 2008, 45.99, "Programming"),
                new Book("Effective Java", 2018, 52.50, "Programming"),
                new Book("Java: The Complete Reference", 2020, 60.00, "Programming"),
                new Book("Head First Java", 2005, 40.25, "Programming"),
                new Book("The Pragmatic Programmer", 1999, 48.75, "Programming"),

                new Book("Atomic Habits", 2018, 25.99, "Self-Help"),
                new Book("The 7 Habits of Highly Effective People", 1989, 30.50, "Self-Help"),
                new Book("Think and Grow Rich", 1937, 18.99, "Self-Help"),
                new Book("How to Win Friends and Influence People", 1936, 22.50, "Self-Help"),
                new Book("Deep Work", 2016, 28.75, "Self-Help"),

                new Book("The Alchemist", 1988, 15.99, "Fiction"),
                new Book("1984", 1949, 12.50, "Fiction"),
                new Book("The Great Gatsby", 1925, 14.99, "Fiction"),
                new Book("To Kill a Mockingbird", 1960, 16.75, "Fiction"),
                new Book("The Kite Runner", 2003, 19.99, "Fiction"),

                new Book("A Brief History of Time", 1988, 24.50, "Science"),
                new Book("Cosmos", 1980, 27.99, "Science"),
                new Book("The Selfish Gene", 1976, 21.50, "Science"),
                new Book("Sapiens", 2011, 32.99, "History"),
                new Book("Guns, Germs, and Steel", 1997, 29.75, "History")
        );

//        System.out.println("Total books ");
//        books.stream().forEach(book-> System.out.println("Book Name: "+ book.name +" | Publication Date: "+ book.publicationDate +" | Price: "+ book.price +" | Book Category: "+ book.category));

        System.out.println("Books cheaper then $30.");
        List<Book> cheaperBooks = books.stream()
                .filter(n-> n.price<=30)
                .map(n-> n.name.toUpperCase()).forEach(book-> System.out.println(book));

        System.out.println(cheaperBooks);



    }
}
