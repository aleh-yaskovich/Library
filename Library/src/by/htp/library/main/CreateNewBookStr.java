package by.htp.library.main;

import java.util.Scanner;

public class CreateNewBookStr {

	public static String createImStr() {
		System.out.println("Создаем новую книгу в категории \"Художественная литература\"");
		
		String TITLE = createStr("Введите название книги: ");
		String AUTHOR = createStr("Введите автора книги: ");
		int YEAR = createInt("Введите год издания: ");
		String PUBLISHING = createStr("Введите название издательства: ");
		int PAGE_COUNT = createInt("Введите количество страниц: ");
		double PRICE = createDouble("Введите цену: ");
		String BINDING = createStr("Введите тип переплета (мягкая обложка / твердый переплет): ");
		
		String str = "GENRE=ImaginativeLiterature; TITLE="+TITLE+"; AUTHOR="+AUTHOR+"; YEAR="+YEAR
				+"; PUBLISHING="+PUBLISHING+"; PAGE_COUNT="+PAGE_COUNT+"; PRICE="+PRICE+"; BINDING="+BINDING;
		return str;
	}
	
	public static String createProgStr() {
		
		String TITLE = createStr("Введите название книги: ");
		String AUTHOR = createStr("Введите автора книги: ");
		int YEAR = createInt("Введите год издания: ");
		String PUBLISHING = createStr("Введите название издательства: ");
		int PAGE_COUNT = createInt("Введите количество страниц: ");
		int WEIGTH = createInt("Введите вес книги: ");
		double PRICE = createDouble("Введите цену: ");
		
		String str = "GENRE=ProgrammingLiterature; TITLE="+TITLE+"; AUTHOR="+AUTHOR+"; YEAR="+YEAR+"; PUBLISHING="+PUBLISHING
				+"; PAGE_COUNT="+PAGE_COUNT+"; WEIGTH="+WEIGTH+"; PRICE="+PRICE;
		return str;
	}
	
	public static String createEncStr() {
		
		String TITLE = createStr("Введите название книги: ");
		int YEAR = createInt("Введите год издания: ");
		String PUBLISHING = createStr("Введите название издательства: ");
		int PAGE_COUNT = createInt("Введите количество страниц: ");
		int WIDTH = createInt("Введите длину книги: ");
		int HEIGHT = createInt("Введите ширину книги: ");
		int THICKNESS = createInt("Введите толщину книги: ");
		int WEIGTH = createInt("Введите вес книги: ");
		double PRICE = createDouble("Введите цену: ");
		
		String str = "GENRE=Encyclopedia; TITLE="+TITLE+"; YEAR="+YEAR+"; PUBLISHING="+PUBLISHING+"; PAGE_COUNT="+PAGE_COUNT
				+"; WIDTH="+WIDTH+"; HEIGHT="+HEIGHT+"; THICKNESS="+THICKNESS+"; WEIGTH="+WEIGTH+"; PRICE="+PRICE;
		return str;
	}
	
	/////////////////////////////////////////////////////////////////////
	
	private static int createInt(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.print(s);
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print(s);
        }
        int number = sc.nextInt();
        while (number < 0) {
        	System.out.print(s);
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print(s);
            }
            number = sc.nextInt();
        }
		return number;
	}
	
	private static double createDouble(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.print(s);
        while(!sc.hasNextDouble()) {
        	sc.next();
        	System.out.print(s);
        }
        double number = sc.nextDouble();
        while (number < 0) {
        	System.out.print(s);
            while(!sc.hasNextDouble()) {
            	sc.next();
            	System.out.print(s);
            }
            number = sc.nextDouble();
        }
		return number;
	}
	
	private static String createStr(String s) {
		Scanner sc = new Scanner(System.in);
		System.out.print(s);
		String str = sc.nextLine();
		return str;
	}
	
}
