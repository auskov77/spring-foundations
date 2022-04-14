package ru.itsjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.itsjava.services.ProgrammerService;


public class  Application {

    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(Application.class);

        ProgrammerService programmerService = context.getBean("programmerService", ProgrammerService.class);
        programmerService.hiToNewProgrammer();

    }
}