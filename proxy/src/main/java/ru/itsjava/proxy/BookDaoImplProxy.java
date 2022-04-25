package ru.itsjava.proxy;

public class BookDaoImplProxy implements BookDao{

    @Override
    public String getBook(long id) {
        System.out.println("Hi from proxy class");
        return new BookDaoImpl().getBook(id);
    }
}
