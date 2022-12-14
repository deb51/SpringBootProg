package in.ashokit;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Book;
import in.ashokit.entity.BookPK;
import in.ashokit.repository.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		BookRepository bookRepository = context.getBean(BookRepository.class);
		
		/*
		 * Book book=new Book(); book.setBid(102); book.setPrice(4500.00);
		 * book.setType("Motivation");
		 * 
		 * bookRepository.save(book);
		 */
		
		
		System.out.println("Record save...");
		BookPK pk=new BookPK();
		pk.setBid(102);
		pk.setType("Motivation");
		
		Optional<Book> findById = bookRepository.findById(pk);
		System.out.println(findById.get());
	}

}
