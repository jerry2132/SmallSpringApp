package sumit.spring.springWebApp.Repositories;
import sumit.spring.springWebApp.Domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
