package lab2_7;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array:");
        int size;
        size = scanner.nextInt();

        bookShelf bookshelf = new bookShelf(size);

        for(int i = 0; i < size; i++)
        {
            System.out.println("Book №" + (i+1));

            System.out.print("Input name of author: ");
            String author = scanner.next();

            System.out.print("Input name of book: ");
            String name = scanner.next();

            System.out.print("Input year of book: ");
            int year = scanner.nextInt();

            Book book = new Book(author, name, year);
            bookshelf.push_back(book);
        }

        System.out.println("Earliest published book: " + bookshelf.EarlyBook());
        System.out.println("latest published book: " + bookshelf.LateBook());

        bookshelf.sort();
        bookshelf.Print();
    }

}
