package lab2_7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class bookShelf {
    private Book[] mas;
    private int size;
    private int current = 0;
    private Object Comparator;

    bookShelf(int size)
    {
        this.size = size;
        mas = new Book[size];
    }

    public void push_back(Book book)
    {
        mas[current] = book;
        current++;
    }

    public Book LateBook()
    {
        int max = 0;
        int mx = 0;

        for(int i = 0; i < current; i++)
        {
            if(mas[i].getYear() > max) {
                mx = i;
                max = mas[i].getYear();
            }
        }

        return mas[mx];
    }

    public Book EarlyBook()
    {
        int min = 3000;
        int mn = 0;

        for(int i = 0; i < current; i++)
        {
            if(mas[i].getYear() < min)
            {
                mn = i;
                min = mas[i].getYear();
            }
        }

        return mas[mn];
    }

    public void sort()
    {
        Book time = new Book("", "", 0);
        
        for(int i = 0; i < current; i++)
        {
            for(int j = i+1; j < current - 1; j++)
            {
                if(mas[j].getYear() < mas[i].getYear())
                {
                    time = mas[i];
                    mas[i] = mas[j];
                    mas[j] = time;
                }
            }
        }
    }

    public void Print()
    {
        for(int i = 0; i < current; i++) System.out.println(mas[i].toString());
    }

}
