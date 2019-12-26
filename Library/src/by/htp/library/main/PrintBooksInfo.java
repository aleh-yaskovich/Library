package by.htp.library.main;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import by.htp.library.entity.BookCollection;

public class PrintBooksInfo {
	
	public static int start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Нажмите:\n\"1\" - если хотите добавить книгу,\n\"2\" - если хотите найти книгу, или\n"
				+ "\"0\" - если ничего не хотите: ");
		while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите цифру 1, 2 или 0: ");
        }
        int number = sc.nextInt();
        while (number < 0 || number > 2) {
        	System.out.print("Введите цифру 1, 2 или 0: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите цифру 1, 2 или 0: ");
            }
            number = sc.nextInt();
        }
        System.out.println();
        return number;
	}

	public static HashMap<String, Integer> print(List<BookCollection> books) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		if (books.size() > 0) {
			for (int i = 0; i < books.size(); i++) {
				System.out.println(books.get(i).toString());
				
				
				Scanner sc = new Scanner(System.in);
				System.out.print("Нажмите:\n\"1\" - если хотите редактировать поля,\n\"2\" - если хотите удалить эту книгу, или\n"
						+ "\"3\" - если не хотите ничего с ней делать: ");
				while(!sc.hasNextInt()) {
		        	sc.next();
		        	System.out.print("Введите цифру 1, 2 или 3: ");
		        }
		        int number = sc.nextInt();
		        while (number < 1 || number > 3) {
		        	System.out.print("Введите цифру 1, 2 или 3: ");
		            while(!sc.hasNextInt()) {
		            	sc.next();
		            	System.out.print("Введите цифру 1, 2 или 3: ");
		            }
		            number = sc.nextInt();
		        }
		        hm.put(books.get(i).toString(), number);
			}
		} else {
			System.out.println("Not found!");
		}
		System.out.println();
		return hm;
	}
	
	public static int enterNewBookChoise() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Выберите, в какую категорию вы хотите добавить новую книгу:\n"
				+ "1 - художественная литература,\n"
				+ "2 - литература по программированию,\n"
				+ "3 - энциклопедии.");
		System.out.print("Введите цифру 1, 2 или 3: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите цифру 1, 2 или 3: ");
        }
        int number = sc.nextInt();
        while (number < 1 || number > 3) {
        	System.out.print("Введите цифру 1, 2 или 3: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите цифру 1, 2 или 3: ");
            }
            number = sc.nextInt();
        }
        System.out.println();
		return number;
	}
	
	public static int defindCaregory() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Выберите, из какой категории будем искать книгу:\n"
				+ "1 - художественная литература,\n"
				+ "2 - литература по программированию,\n"
				+ "3 - энциклопедии,\n"
				+ "4 - все категории");
		System.out.print("Введите цифру 1, 2, 3 или 4: ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите цифру 1, 2, 3 или 4: ");
        }
        int number = sc.nextInt();
        while (number < 1 || number > 4) {
        	System.out.print("Введите цифру 1, 2, 3 или 4: ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите цифру 1, 2, 3 или 4: ");
            }
            number = sc.nextInt();
        }
        System.out.println();
		return number;
	}
	
	public static String defindParameter(String[] strArr) {
		
		System.out.println("Введите номер параметра для поиска, нажав соответствующий номер");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println((i+1)+" - "+strArr[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите цифру от 1 до "+strArr.length+": ");
        while(!sc.hasNextInt()) {
        	sc.next();
        	System.out.print("Введите цифру от 1 до "+strArr.length+": ");
        }
        int number = sc.nextInt();
        while (number < 1 || number > strArr.length) {
        	System.out.print("Введите цифру от 1 до "+strArr.length+": ");
            while(!sc.hasNextInt()) {
            	sc.next();
            	System.out.print("Введите цифру от 1 до "+strArr.length+": ");
            }
            number = sc.nextInt();
        }
        System.out.print("Введите значение для выбранного Вами параметра "+strArr[number-1]+": ");
        Scanner sc2 = new Scanner(System.in);
		String str = sc2.nextLine();
        String parameter = strArr[number-1]+"="+str;
		return parameter;
	}
	
	
	
	public static String newBookData(int number) {
		
		CreateNewBookStr newBookStr = new CreateNewBookStr();
		String newBook = null;
		switch (number) {
		case 1 :
			newBook = newBookStr.createImStr();
			break;
		case 2 :
			newBook = newBookStr.createProgStr();
			break;
		case 3 :
			newBook = newBookStr.createEncStr();
			break;
		}
		return newBook;
	}
	
	public static String createNewStr(String[] bookData) {
		String newStr = "";
		System.out.println("Введите новые параметры книги");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < bookData.length; i++) {
			String[] tmp = bookData[i].trim().split("=");
			System.out.print(tmp[0]+" (старое значение = "+tmp[1]+"): ");
			newStr = newStr + tmp[0] + "=" + sc.nextLine() + "; ";
		}
		newStr = newStr.substring(0, (newStr.length()-2));
		return newStr;
	}
	
}

	
