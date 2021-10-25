package com.demoproject1.demo.bootstrap;

import com.demoproject1.demo.domain.Author;
import com.demoproject1.demo.domain.Book;
import com.demoproject1.demo.domain.Publisher;
import com.demoproject1.demo.repositories.AuthorRepository;
import com.demoproject1.demo.repositories.BookRepository;
import com.demoproject1.demo.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;

    }


    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("Divya Publisher");
        publisher.setAddress("15033, parbhat nagar");
        publisher.setCity("Ludhiana");
        publisher.setState("Punjab");
        publisher.setZip("141003");

        publisherRepository.save(publisher);
        System.out.println("Publisher Count: "+ publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book( "Domain drive",  "1231233");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("Domain drive java", "2345663");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: "+ bookRepository.count());
        System.out.println("Publisher number of books: "+ publisher.getBooks().size());



    }
}
