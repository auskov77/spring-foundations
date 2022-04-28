package ru.itsjava.quoters;

public class TerminatorQuoter implements Quoter {
    private String massage;

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public void sayQuote() {
        System.out.println("massage = " + massage);
    }
}
