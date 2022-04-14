package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.NoteBook;

@RequiredArgsConstructor
public class NoteBookServiceImpl implements NoteBookService{
    private final String firm;
    private final String model;
    private final int year;

    @Override
    public NoteBook getNoteBook() {

        return new NoteBook(firm, model, year);
    }
}
