package by.htp.library.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.library.dao.DAOFactory;
import by.htp.library.dao.LibraryDAO;
import by.htp.library.entity.BookCollection;
import by.htp.library.entity.criteria.Criteria;
import by.htp.library.service.LibraryService;
import by.htp.library.service.validation.Validator;

public class LibraryServiceImpl implements LibraryService {

	@Override
	public List<BookCollection> find(Criteria criteria) {

		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		LibraryDAO libraryDAO = factory.getLibraryDAO();
		
		List<BookCollection> books = new ArrayList<BookCollection>();
		try {
			books = libraryDAO.find(criteria);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books;
	}
	
	@Override
	public List<BookCollection> insert(String bookData) {

		DAOFactory factory = DAOFactory.getInstance();
		LibraryDAO libraryDAO = factory.getLibraryDAO();
		
		List<BookCollection> booksAllInsert = new ArrayList<BookCollection>();
		try {
			booksAllInsert = libraryDAO.insert(bookData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return booksAllInsert;
	}

	@Override
	public List<BookCollection> update(String book, String newString) {
		DAOFactory factory = DAOFactory.getInstance();
		LibraryDAO libraryDAO = factory.getLibraryDAO();
		
		List<BookCollection> booksAllInsert = new ArrayList<BookCollection>();
		try {
			booksAllInsert = libraryDAO.update(book, newString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booksAllInsert;
	}

	@Override
	public List<BookCollection> delete(String book) {
		DAOFactory factory = DAOFactory.getInstance();
		LibraryDAO libraryDAO = factory.getLibraryDAO();
		
		List<BookCollection> booksAllInsert = new ArrayList<BookCollection>();
		try {
			booksAllInsert = libraryDAO.delete(book);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return booksAllInsert;
	}
	
	

}
