package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        System.out.print("Въведете брой книги: ");
        Scanner sc = new Scanner(System.in);
        int numBooks = sc.nextInt();

        for (int i = 0; i < numBooks; i++) {
            Book book = null;
            int type;

            System.out.print("Въведете тип книга: '1' -Children_book/'2'-Comic_book> ");
            type = sc.nextInt();

            switch (type) {

                case 1:
                    book = new ChildrenBook();
                    book.setType(BookType.CHILDREN_BOOK);
                    System.out.print("Моля въведете възраст, за която е предназначена книгата: ");

                    ((ChildrenBook) book).setAge(sc.nextInt());
                    break;
                case 2:
                    book = new ComicBook();
                    book.setType(BookType.COMIC_BOOK);
                    System.out.print("Моля въведете име на героя (като 1 дума): ");

                    ((ComicBook) book).setCharacterName(sc.next());
                    break;
                default:
                    book = new Book();
                    break;

            }


            System.out.print("Въведете бройка налични книги: ");
            book.setAvailable(sc.nextInt());

            System.out.print("Въведете заглавие на книгата (като 1 дума): ");
            book.setTitle(sc.next());

            Author author = new Author();

            System.out.print("Въведете име на автора ( фамилия): ");
            author.setName(sc.next());

            book.setAuthor(author);

            System.out.print("Въведете възраст на автора: ");
            author.setAge(sc.nextInt());

            System.out.print("Въведете оригинална цена на книгата: ");
            book.setOriginalPrice(sc.nextDouble());


            books.add(book);

        }


        Bookstore store = new Bookstore();
        store.setBooks(books);

        for (int i = 0; i < numBooks; i += 2) {
            Book book = books.get(i);
            store.sell(book);
        }
        sc.close();

    }
}