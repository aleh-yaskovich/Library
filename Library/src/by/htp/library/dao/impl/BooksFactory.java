package by.htp.library.dao.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.library.entity.BookCollection;
import by.htp.library.entity.Encyclopedia;
import by.htp.library.entity.ImaginativeLiterature;
import by.htp.library.entity.ProgrammingLiterature;

//Создаем список объектов, подходящих по искомым параметрам
public class BooksFactory {

	public List<BookCollection> create (List<String> strBooksData) {
		List<BookCollection> results = new ArrayList<BookCollection>();
		for(String data : strBooksData){
			results.add(createBookCollection(data));
		}
		return results;  
	}
		
	public BookCollection createBookCollection (String data){
		String[] bookData = data.split(";");
		    
		switch (bookData[0].trim()) {
		case "GENRE=Encyclopedia" :
			return createEnc(bookData);
		case "GENRE=ImaginativeLiterature" :
			return createIm(bookData);
		case "GENRE=ProgrammingLiterature" :
			return createProg(bookData);
		default:
			BookCollection book = new BookCollection();
		    return book;
		}
	}
	
	// Метод для формирования списков из всего фонда
	public List<BookCollection> createBookCollect (List<String> bookCollection, String genre){
		List<BookCollection> books = new ArrayList<BookCollection>();
		
		for (String data : bookCollection) {
			if (data.contains(genre)) {
				String[] bookData = data.split(";");
				switch (bookData[0].trim()) {
				case "GENRE=Encyclopedia" :
					books.add(createEnc(bookData));
					break;
				case "GENRE=ImaginativeLiterature" :
					books.add(createIm(bookData));
					break;
				case "GENRE=ProgrammingLiterature" :
					books.add(createProg(bookData));
					break;
				}
			}
		}
		return books;
	}

	private BookCollection createEnc(String[] data) {
		
		List<String> arg = getValue(data);	
			
		String TITLE = arg.get(0);
		int YEAR = Integer.parseInt(arg.get(1));
		String PUBLISHING = arg.get(2);
		int PAGE_COUNT = Integer.parseInt(arg.get(3));
		int WIDTH = Integer.parseInt(arg.get(4));
		int HEIGHT = Integer.parseInt(arg.get(5));
		int THICKNESS = Integer.parseInt(arg.get(6));
		int WEIGTH = Integer.parseInt(arg.get(7));
		double PRICE = Double.parseDouble(arg.get(8));
			
		BookCollection encyclopedia = new Encyclopedia(TITLE, YEAR, PUBLISHING, PAGE_COUNT, WIDTH, HEIGHT, THICKNESS, WEIGTH, PRICE);
		return encyclopedia;
	}
	
	public List<BookCollection> addBookToLibrary (List<BookCollection> bookIm, List<BookCollection> bookProg, List<BookCollection> bookEnc, BookCollection newBook) {
		String genre = newBook.getGENRE();
		switch (genre) {
		case "Encyclopedia" :
			bookEnc.add(newBook);
			break;
		case "ImaginativeLiterature" :
			bookIm.add(newBook);
			break;
		case "ProgrammingLiterature" :
			bookProg.add(newBook);
			break;
		}
		List<BookCollection> allBooks = new ArrayList<BookCollection>();
		allBooks.addAll(bookIm);
		allBooks.addAll(bookProg);
		allBooks.addAll(bookEnc);
		
		return allBooks;
	}
	
	public List<String> updateBookToLibrary (List<String> bookCollection, String newBook, String newStr) {
		
		for(int i = 0; i < bookCollection.size(); i++) {
			if (bookCollection.get(i).equals(newBook)) {
				bookCollection.set(i, newStr);
				System.out.println();
			}
		}
		
		return bookCollection;
	}
	
	public List<String> deleteBookToLibrary (List<String> bookCollection, String newBook) {

		for(int i = 0; i < bookCollection.size(); i++) {
			if (bookCollection.get(i).equals(newBook)) {
				bookCollection.remove(newBook);
				System.out.println();
			}
		}
		
		return bookCollection;
	}
	
	private BookCollection createIm(String[] data) {
		
		List<String> arg = getValue(data);
		
		String TITLE = arg.get(0);
		String AUTHOR = arg.get(1);
		int YEAR = Integer.parseInt(arg.get(2));
		String PUBLISHING = arg.get(3);
		int PAGE_COUNT = Integer.parseInt(arg.get(4));
		double PRICE = Double.parseDouble(arg.get(5));
		String BINDING = arg.get(6);
		
		BookCollection imaginativeLiterature = new ImaginativeLiterature(TITLE, AUTHOR, YEAR, PUBLISHING, PAGE_COUNT, PRICE, BINDING);
		return imaginativeLiterature;
	}
	
	private BookCollection createProg(String[] data) {
		
		List<String> arg = getValue(data);
		
		String TITLE = arg.get(0);
		String AUTHOR = arg.get(1);
		int YEAR = Integer.parseInt(arg.get(2));
		String PUBLISHING = arg.get(3);
		int PAGE_COUNT = Integer.parseInt(arg.get(4));
		int WEIGTH = Integer.parseInt(arg.get(5));
		double PRICE = Double.parseDouble(arg.get(6));
		
		BookCollection programmingLiterature = new ProgrammingLiterature(TITLE, AUTHOR, YEAR, PUBLISHING, PAGE_COUNT, WEIGTH, PRICE);
		return programmingLiterature;
	}
	
	private List<String> getValue(String[] arr) {
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < arr.length; i++) {
			String[] tmp = arr[i].split("=");
			list.add(tmp[1].trim());
		}
		return list;
	}
	
}
