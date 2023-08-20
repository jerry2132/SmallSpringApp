package sumit.spring.springWebApp.Repositories;
import org.springframework.data.repository.CrudRepository;

import sumit.spring.springWebApp.Domain.Book;
public interface BookRepository extends CrudRepository<Book, Long>{

} 
