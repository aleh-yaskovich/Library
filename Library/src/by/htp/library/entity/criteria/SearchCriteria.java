package by.htp.library.entity.criteria;

public final class SearchCriteria {
	
	public static enum Encyclopedia{
		TITLE, YEAR, PUBLISHING, PAGE_COUNT, WIDTH, HEIGHT, THICKNESS, WEIGTH, PRICE
	}
	
	public static enum ImaginativeLiterature{
		TITLE, AUTHOR, YEAR, PUBLISHING, PAGE_COUNT, PRICE, BINDING
	}
	
	public static enum ProgrammingLiterature{
		TITLE, AUTHOR, YEAR, PUBLISHING, PAGE_COUNT, WEIGTH, PRICE
	}
	
	private SearchCriteria() {}
	
}
