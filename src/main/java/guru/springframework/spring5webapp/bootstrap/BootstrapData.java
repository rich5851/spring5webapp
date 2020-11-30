package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repos.AuthorRepo;
import guru.springframework.spring5webapp.repos.BookRepo;
import guru.springframework.spring5webapp.repos.PublisherRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;
    private final PublisherRepo pubRepo;

    public BootstrapData(AuthorRepo authorRepo, BookRepo bookRepo, PublisherRepo pubRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
        this.pubRepo = pubRepo;
    }

    public void run(String... args) throws Exception {

        //Add Authors and books
        Author eric = new Author("Eric","Evans" );
        Book ddd = new Book("Domain Driven Design", "1234567");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepo.save(eric);
        bookRepo.save(ddd);

        Author rod = new Author("Rod","Johnson" );
        Book j2e = new Book("J2e book", "1235555");
        rod.getBooks().add(j2e);
        j2e.getAuthors().add(rod);
        authorRepo.save(rod);
        bookRepo.save(j2e);

        //Add Publisher
        Publisher packit = new Publisher("Packit", "42252 Chase Drive",
                "Canton", "MI", "48188");
        pubRepo.save(packit);


        System.out.println("Started in Bootstrap");
        System.out.println(("Number of books " + bookRepo.count()));
        System.out.println("Number of Publishers " + pubRepo.count());


    }
}
