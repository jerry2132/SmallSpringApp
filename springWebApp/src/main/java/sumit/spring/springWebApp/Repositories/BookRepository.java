package sumit.spring.springWebApp.Repositories;
import sumit.spring.springWebApp.Domain.Book;
import org.springframework.data.repository.CrudRepository;
public interface BookRepository extends CrudRepository<Book, Long>{

} 
