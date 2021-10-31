package com.kodilla.booksetfilter;

import java.util.*;
import java.lang.*;

class Book
{
    String title;
    String author;
    int year;

    public Book(String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public boolean equals(Object o)
    {
        Book b = (Book) o;
        return (title.equals(b.getTitle())) && (author.equals(b.getAuthor()));
    }

    public String toString()
    {
        return title + ", " + author + ", publication date: " + year;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public int getYear()
    {
        return year;
    }
}

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Book book1 = new Book("Book One", "William Faulkner", 1987);
        Book book2 = new Book("Book Two", "Franz Kafka", 1988);
        Book book3 = new Book("Book Three", "William Shakespeare ", 1987);
        Book book4 = new Book("Book Four", "Nowak", 2015);
        Book book5 = new Book("Book Five", "Kowalski", 2019);
        Book book6 = new Book("Book Five", "Kowalski", 2019);

        HashSet<Book> booksSet = new HashSet<Book>();
        booksSet.add(book1);
        booksSet.add(book5);
        booksSet.add(book6);
        booksSet.add(book4);
        booksSet.add(book2);
        booksSet.add(book3);

        for(Book theBook: booksSet)
        {
            if(theBook.getYear() <= 2010)
                System.out.println(theBook);

        }

        ArrayList<Book> bookArray = new ArrayList<Book>(booksSet);

        System.out.println(bookArray.size());

        for (int i = 0; i < bookArray.size() - 1; i++)
        {
            if (bookArray.get(i).equals(bookArray.get(i + 1)))
                System.out.println("Book " + i + " equals book" + (i + 1));
        }
    }
}
















