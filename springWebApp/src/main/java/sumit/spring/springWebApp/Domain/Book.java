package sumit.spring.springWebApp.Domain;
import jakarta.persistence.*;
import java.util.HashSet;

import java.util.Objects;
import java.util.Set;
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String isbn;
	@ManyToMany
	@JoinTable(name="author_book", joinColumns =@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_Id"))
	private Set<Author> authors  = new HashSet<>();
	
	
	
	public Book() {
		
		// TODO Auto-generated constructor stub
	}



	public Book(String title, String isbn) {
		super();
		this.title = title;
		this.isbn = isbn;
		
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public Set<Author> getAuthors() {
		return authors;
	}



	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	


	@Override
	public String toString() {
		return "Book [id=" + 
	id + 
	", title=" + title + 
	", isbn=" + isbn + 
	", authors=" + authors + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return id == other.id;
	}
	

	
}
