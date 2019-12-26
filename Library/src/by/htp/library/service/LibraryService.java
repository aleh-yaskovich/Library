package by.htp.library.service;

import java.util.List;
import by.htp.library.entity.BookCollection;
import by.htp.library.entity.criteria.Criteria;

public interface LibraryService {
	
	List<BookCollection> find(Criteria criteria);
	List<BookCollection> insert(String bookData);
	List<BookCollection> update(String book, String newStr);
	List<BookCollection> delete(String book);
	
}
