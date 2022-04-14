package ru.itsjava.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.services.*;

import java.io.InputStream;

@Configuration
public class MyConfig {
    @Value("${notebook.firm}")
    private String firm;
    @Value("${notebook.model}")
    private String model;
    @Value("${notebook.year}")
    private int year;
    @Value("#{T(java.lang.System).in}")
    private InputStream inputStream;

    @Bean
    public NoteBookService noteBookService(){
        return new NoteBookServiceImpl(firm,model,year);
    }

    @Bean
    public IOService ioService(){
        return new IOServiceImpl(inputStream);
    }

    @Bean
    public ProgrammerService programmerService(NoteBookService noteBookService, IOService ioService){
        return new ProgrammerServiceImpl(noteBookService,ioService);
    }

}
