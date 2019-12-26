package by.htp.library.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import by.htp.library.entity.criteria.Criteria;

//Сравниваем критерии со строками списка книг и формируем список строк книг с совпадениями
public class LibraryMatcher {

	public List<String> match (List<String> strBooksData, Criteria criteria) {
		List<String> results = new ArrayList<String>();
		
		for (String concreteBookData : strBooksData) {
			if( isMatch(concreteBookData, criteria.getParameter()) ){ // проверяем, содержится ли в строке запрос
				results.add(concreteBookData);
			}
		}
		return results;
	}
		
	private boolean isMatch (String concreteBookData, String parameter) {
		if(!concreteBookData.contains(parameter)){
			return false;
		}
		return true;
	}
	
}
