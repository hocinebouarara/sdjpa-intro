package com.hocinebouarara.sdjpaintro.bootstrap;

import com.hocinebouarara.sdjpaintro.domain.Book;
import com.hocinebouarara.sdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("C++ Programing Languages","134","hocine bouarara");
        System.out.println("Id: "+book1.getId() );

        Book saveBook1 = bookRepository.save(book1);
        System.out.println("Id: "+book1.getId() );

        Book book2 = new Book("Web programing","1334","hocine bouarara");
        Book saveBook2 = bookRepository.save(book2);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });


    }
}
