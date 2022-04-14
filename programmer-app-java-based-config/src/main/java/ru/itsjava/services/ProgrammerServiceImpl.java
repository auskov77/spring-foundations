package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProgrammerServiceImpl implements ProgrammerService{
    private final NoteBookService noteBookService;
    private final IOService ioService;

    @Override
    public void hiToNewProgrammer() {

        System.out.println("Enter your name: ");
        String name = ioService.input();
        System.out.println("Hello " + name);
        System.out.println("Your computer: " + noteBookService.getNoteBook() );

    }
}
