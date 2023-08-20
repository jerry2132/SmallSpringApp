package sumit.spring.springWebApp.Repositories;
import org.springframework.data.repository.CrudRepository;

import sumit.spring.springWebApp.Domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
