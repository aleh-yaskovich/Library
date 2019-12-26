package by.htp.library.dao.impl;

import java.io.IOException;
import java.util.List;

import by.htp.library.dao.LibraryDAO;
import by.htp.library.entity.BookCollection;
import by.htp.library.entity.criteria.Criteria;

public class LibraryDAOImpl implements LibraryDAO {
	
	String fileName = "resources\\books.txt";
	
	@Override
	public List<BookCollection> find(Criteria criteria) throws IOException {
		
		List<BookCollection> books = null;
		List<String> strBooksData = null;
		
		LibraryReader reader = new LibraryReader(fileName);
		LibraryMatcher matcher = new LibraryMatcher();
		BooksFactory factory = new BooksFactory();
		
		strBooksData = reader.read(criteria.getGroupSearchName());
		strBooksData = matcher.match(strBooksData, criteria);
		books = factory.create(strBooksData);
		
		return books;
		
	}
	
	@Override
	public List<BookCollection> insert(String newBookData) throws IOException {

		LibraryReader reader = new LibraryReader(fileName);
		LibraryWriter writer = new LibraryWriter();
		BooksFactory factory = new BooksFactory();
		List<String> bookCollection = reader.readAll();
		
		
		BookCollection newBook = factory.createBookCollection(newBookData);
		
		List<BookCollection> booksIm = factory.createBookCollect(bookCollection, "GENRE=ImaginativeLiterature");
		List<BookCollection> booksProg = factory.createBookCollect(bookCollection, "GENRE=ProgrammingLiterature");
		List<BookCollection> booksEnc = factory.createBookCollect(bookCollection, "GENRE=Encyclopedia");
		
		List<BookCollection> booksAlladd = factory.addBookToLibrary(booksIm, booksProg, booksEnc, newBook);
		writer.write(fileName, booksAlladd);
		
		return booksAlladd;
	}

	@Override
	public List<BookCollection> update(String book, String newStr) throws IOException {
		
		LibraryReader reader = new LibraryReader(fileName);
		LibraryWriter writer = new LibraryWriter();
		BooksFactory factory = new BooksFactory();
		List<String> bookCollection = reader.readAll();
		bookCollection = factory.updateBookToLibrary(bookCollection, book, newStr);
		writer.writeStr(fileName, bookCollection);
		
		return null;
	}

	@Override
	public List<BookCollection> delete(String book) throws IOException {
		
		LibraryReader reader = new LibraryReader(fileName);
		LibraryWriter writer = new LibraryWriter();
		BooksFactory factory = new BooksFactory();
		List<String> bookCollection = reader.readAll();
		bookCollection = factory.deleteBookToLibrary(bookCollection, book);
		writer.writeStr(fileName, bookCollection);

		return null;
	}
	
	
}

