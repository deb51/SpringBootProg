package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Book;

@Controller
public class BookController {


	@GetMapping("/book")
	public String getBook(Model model) {
		Book bookObj = new Book();
		model.addAttribute("book", bookObj);
		return "index";
	}
	@PostMapping("/sucess")
	public String successPage(Book book,Model model) {
		
		model.addAttribute("bookname", book.getBookName());
		model.addAttribute("author", book.getBookAuthor());
		model.addAttribute("price", book.getBookPrice());
		
		return "sucess";
	}

}
