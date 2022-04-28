package ru.itsjava.proxy;

public class Main {
    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImplProxy();
        System.out.println("bookDao.getBook(1L) = " + bookDao.getBook(1L));

        AbstractBookDao abstractBookDao = new AbsractBookDaoImplProxy();
        System.out.println("abstractBookDao.getBook(1L) = " + abstractBookDao.getBook(1L));
    }
}
