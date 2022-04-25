package ru.itsjava.proxy;

public class AbsractBookDaoImplProxy extends AbstractBookDao{

    @Override
    public String getBook(long id) {
        System.out.println("Privet is AbstractBookDaoImplProxy");
        return new AbstractBookDaoImpl().getBook(1L);
    }
}
