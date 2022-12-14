package in.ashokit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "Book_dtls")
@Entity
@Data
@IdClass(value = BookPK.class)
public class Book implements Serializable {


	@Id
	@Column(name = "book_id")
	private Integer bid;
	
	@Id
	@Column(name = "book_type")
	private String type;
	
	@Column(name="book_price")
	private Double price;
	
	
}
