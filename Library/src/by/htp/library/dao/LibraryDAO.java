package by.htp.library.dao;

import java.io.IOException;
import java.util.List;
import by.htp.library.entity.BookCollection;
import by.htp.library.entity.criteria.Criteria;

public interface LibraryDAO {
	
	List<BookCollection> find (Criteria criteria) throws IOException;
	List<BookCollection> insert (String str) throws IOException;
	List<BookCollection> update (String book, String newStr) throws IOException;
	List<BookCollection> delete (String book) throws IOException;
	
}
