package com.alint.spring6learning.spring6webapp.bootstrap;

import com.alint.spring6learning.spring6webapp.domain.Author;
import com.alint.spring6learning.spring6webapp.domain.Book;
import com.alint.spring6learning.spring6webapp.domain.Publisher;
import com.alint.spring6learning.spring6webapp.repositories.AuthorRepo;
import com.alint.spring6learning.spring6webapp.repositories.BookRepo;
import com.alint.spring6learning.spring6webapp.repositories.PublisherRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;
    private final PublisherRepo publisherRepo;

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("54757585");

        Publisher publisher = new Publisher();
        publisher.setPublisherName("My Publisher");
        publisher.setAddress("123 Main");


        Author ericSaved = authorRepo.save(eric);
        Author rodSaved = authorRepo.save(rod);
        Book dddSaved = bookRepo.save(ddd);
        Book noEJBSaved = bookRepo.save(noEJB);
        Publisher publisherSaved = publisherRepo.save(publisher);


        dddSaved.setPublisher(publisherSaved);
        noEJBSaved.setPublisher(publisherSaved);
        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);
        dddSaved.getAuthors().add(ericSaved);
        noEJBSaved.getAuthors().add(rodSaved);

        authorRepo.save(ericSaved);
        authorRepo.save(rodSaved);
        bookRepo.save(dddSaved);
        bookRepo.save(noEJBSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepo.count());
        System.out.println("Book count: " + bookRepo.count());
        System.out.println("Publisher Count: " + publisherRepo.count());
    }
}
