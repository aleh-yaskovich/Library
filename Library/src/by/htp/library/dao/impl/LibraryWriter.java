package by.htp.library.dao.impl;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

import by.htp.library.entity.BookCollection;

public class LibraryWriter {

	public static void write(String fileName, List<BookCollection> books) throws IOException {
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF8"));
		for (int i = 0; i < books.size(); i++) {
			String str = books.get(i).toString()+"\n";
			out.write(str);
		} 
		out.close();
	}
	
	public static void writeStr(String fileName, List<String> books) throws IOException {
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF8"));
		for (int i = 0; i < books.size(); i++) {
			String str = books.get(i)+"\n";
			System.out.print(str);
			out.write(str);
		} 
		out.close();
	}
	
	
	
	
}
