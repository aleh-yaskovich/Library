package by.htp.library.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Считываем строки с нужным нам типом книг
public class LibraryReader {

	private FileReader reader;
	
	public LibraryReader(String fileName) throws FileNotFoundException {
		this.reader = new FileReader(fileName);
	}
	
	public List<String> read(String libraryType) {
		if (libraryType == null) {
			return readAll();
		} else {
			return readWithType(libraryType);
		}
	}
	
	public List<String> readAll() {
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(reader);
			String s;
			while ((s = br.readLine()) != null) {
				list.add(s);
			}
			reader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	private List<String> readWithType(String libraryType) {
		List<String> list = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(reader);
			String s;
			while ((s = br.readLine()) != null) {
				if (s.contains(libraryType)) {
					list.add(s);
				}
			}
			reader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	} 
	
}
