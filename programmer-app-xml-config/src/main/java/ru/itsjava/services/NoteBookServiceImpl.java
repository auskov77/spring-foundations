package ru.itsjava.services;

import ru.itsjava.domain.NoteBook;

public class NoteBookServiceImpl implements NoteBookService{

    @Override
    public NoteBook getNoteBook() {
        return new NoteBook("Apple", "Macbook Pro", 2025);
    }
}
