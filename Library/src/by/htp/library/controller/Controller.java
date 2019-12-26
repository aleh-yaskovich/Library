package by.htp.library.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import by.htp.library.entity.BookCollection;
import by.htp.library.entity.criteria.Criteria;
import by.htp.library.main.PrintBooksInfo;
import by.htp.library.service.LibraryService;
import by.htp.library.service.ServiceFactory;

public class Controller {
	
	public void manage() {
		ServiceFactory factory = ServiceFactory.getInstance();
		LibraryService service = factory.getLibraryService();
		
		int number = 1;
		while (number != 0) {
			number = PrintBooksInfo.start();
			switch (number) {
			case 1:
				int num = PrintBooksInfo.enterNewBookChoise();
				String bookData = PrintBooksInfo.newBookData(num);
				List<BookCollection> books = service.insert(bookData);
				break;
			case 2:
				Criteria criteria = defineType();
				List<BookCollection> booksFind = service.find(criteria);
				HashMap<String, Integer> hm = PrintBooksInfo.print(booksFind);
				
				Set<String> keys = hm.keySet();
				for(String key : keys) {
					int value =  hm.get(key);
					if(value == 3) {
						continue;
					}
					else if(value == 2) {
						List<BookCollection> booksAllupdate = service.delete(key);
					}
					else if(value == 1) {
						String newStr = updateStr(key);
						List<BookCollection> booksAlldelete = service.update(key, newStr);
					}			
				}
				
				break;
			}
		}
	}
	

	public Criteria defineType() {
		
		String genre = null;
		String parameter = null;
		String[] str = null;
		switch (PrintBooksInfo.defindCaregory()) {
		case 1:
			genre = "ImaginativeLiterature";
			str = new String[]{"TITLE", "AUTHOR", "YEAR", "PUBLISHING", "PAGE_COUNT", "PRICE", "BINDING"};
			parameter = PrintBooksInfo.defindParameter(str);
			break;
		case 2:
			genre = "ProgrammingLiterature";
			str = new String[]{"TITLE", "AUTHOR", "YEAR", "PUBLISHING", "PAGE_COUNT", "WEIGTH", "PRICE"};
			parameter = PrintBooksInfo.defindParameter(str);
			break;
		case 3:
			genre = "Encyclopedia";
			str = new String[]{"TITLE", "YEAR", "PUBLISHING", "PAGE_COUNT", "WIDTH", "HEIGHT", "THICKNESS", "WEIGTH", "PRICE"};
			parameter = PrintBooksInfo.defindParameter(str);
			break;
		default:
			genre = null;
			str = new String[]{"TITLE", "AUTHOR", "YEAR", "PUBLISHING", "PAGE_COUNT", "WIDTH", "HEIGHT", "THICKNESS", "WEIGTH", "PRICE", "BINDING"};
			parameter = PrintBooksInfo.defindParameter(str);
			break;
		}
		Criteria criteria = new Criteria(genre, parameter);
		return criteria;
	}
	
	public String updateStr(String str) {
		String[] bookData = str.split(";");
		String newStr = PrintBooksInfo.createNewStr(bookData);
		return newStr;
	}
	
}
