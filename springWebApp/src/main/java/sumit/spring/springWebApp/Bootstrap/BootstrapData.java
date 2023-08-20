package sumit.spring.springWebApp.Bootstrap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sumit.spring.springWebApp.Domain.Author;
import sumit.spring.springWebApp.Domain.Book;

import sumit.spring.springWebApp.Repositories.AuthorRepository;
import sumit.spring.springWebApp.Repositories.BookRepository;


@Component
public class BootstrapData implements CommandLineRunner{

	private final AuthorRepository authorrepository;
	private final BookRepository bookrepository;
	
	
	
	public BootstrapData(AuthorRepository authorrepository, BookRepository bookrepository) {
		super();
		this.authorrepository = authorrepository;
		this.bookrepository = bookrepository;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Author eric = new Author("Eric", "Evans");
		Book bn =new Book("Domain Driven Design","1221");
		eric.getBooks().add(bn);
		bn.getAuthors().add(eric);
		authorrepository.save(eric);
        bookrepository.save(bn);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorrepository.save(rod);
        bookrepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookrepository.count());
		
	}

}