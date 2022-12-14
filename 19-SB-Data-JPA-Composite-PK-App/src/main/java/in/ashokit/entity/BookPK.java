package in.ashokit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;

@Data
public class BookPK implements Serializable {

	
	@Column(name = "book_id")
	private Integer bid;
	
	
	@Column(name = "book_type")
	private String type;
}
