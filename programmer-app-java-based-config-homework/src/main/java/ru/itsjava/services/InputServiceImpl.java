package ru.itsjava.services;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputServiceImpl implements InputService {
    private final BufferedReader reader;

    public InputServiceImpl() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @SneakyThrows
    @Override
    public String input() {
        return reader.readLine();
    }
}
