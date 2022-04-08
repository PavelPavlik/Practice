package BookStore;

import java.util.Arrays;
import java.util.Scanner;

import static BookStore.Book.checkBook;

public class Main {
    public static void main(String[] args) {
        Book[] fileCabinet = new Book [99];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название и год издания книги: ");

        Book book1 = new Book();
        book1.nameBook = "Hobbit";
        checkBook(book1);
        fileCabinet[0] = book1;
        for (Object item:fileCabinet){
            System.out.println(item);
        }

    }
}
