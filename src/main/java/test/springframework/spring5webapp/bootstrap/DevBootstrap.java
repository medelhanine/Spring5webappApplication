package test.springframework.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import test.springframework.spring5webapp.model.Author;
import test.springframework.spring5webapp.model.Book;

public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private void initData()
    {
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book(title :"the book title",isbn:"1234", publisher : "name of the publisher" );
    }
}
