package by.htp.library.entity;

public class ProgrammingLiterature extends BookCollection {

	private String TITLE;
	private String AUTHOR;
	private int YEAR;
	private String PUBLISHING;
	private int PAGE_COUNT;
	private int WEIGTH;
	private double PRICE;
	
	public ProgrammingLiterature() {
		super();
		this.TITLE = null;
		this.AUTHOR = null;
		this.YEAR = 0;
		this.PUBLISHING  = null;
		this.PAGE_COUNT = 0;
		this.WEIGTH = 0;
		this.PRICE = 0;
	}
	
	public ProgrammingLiterature(String TITLE, String AUTHOR, int YEAR, String PUBLISHING, int PAGE_COUNT, int WEIGTH, double PRICE) {
		super("ProgrammingLiterature");
		this.TITLE = TITLE;
		this.AUTHOR = AUTHOR;
		this.YEAR = YEAR;
		this.PUBLISHING  = PUBLISHING;
		this.PAGE_COUNT = PAGE_COUNT;
		this.WEIGTH = WEIGTH;
		this.PRICE = PRICE;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getAUTHOR() {
		return AUTHOR;
	}

	public void setAUTHOR(String aUTHOR) {
		AUTHOR = aUTHOR;
	}

	public int getYEAR() {
		return YEAR;
	}

	public void setYEAR(int yEAR) {
		YEAR = yEAR;
	}

	public String getPUBLISHING() {
		return PUBLISHING;
	}

	public void setPUBLISHING(String pUBLISHING) {
		PUBLISHING = pUBLISHING;
	}

	public int getPAGE_COUNT() {
		return PAGE_COUNT;
	}

	public void setPAGE_COUNT(int pAGE_COUNT) {
		PAGE_COUNT = pAGE_COUNT;
	}

	public int getWEIGTH() {
		return WEIGTH;
	}

	public void setWEIGTH(int wEIGTH) {
		WEIGTH = wEIGTH;
	}

	public double getPRICE() {
		return PRICE;
	}

	public void setPRICE(double pRICE) {
		PRICE = pRICE;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((AUTHOR == null) ? 0 : AUTHOR.hashCode());
		result = prime * result + PAGE_COUNT;
		long temp;
		temp = Double.doubleToLongBits(PRICE);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((PUBLISHING == null) ? 0 : PUBLISHING.hashCode());
		result = prime * result + ((TITLE == null) ? 0 : TITLE.hashCode());
		result = prime * result + WEIGTH;
		result = prime * result + YEAR;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProgrammingLiterature other = (ProgrammingLiterature) obj;
		if (AUTHOR == null) {
			if (other.AUTHOR != null)
				return false;
		} else if (!AUTHOR.equals(other.AUTHOR))
			return false;
		if (PAGE_COUNT != other.PAGE_COUNT)
			return false;
		if (Double.doubleToLongBits(PRICE) != Double.doubleToLongBits(other.PRICE))
			return false;
		if (PUBLISHING == null) {
			if (other.PUBLISHING != null)
				return false;
		} else if (!PUBLISHING.equals(other.PUBLISHING))
			return false;
		if (TITLE == null) {
			if (other.TITLE != null)
				return false;
		} else if (!TITLE.equals(other.TITLE))
			return false;
		if (WEIGTH != other.WEIGTH)
			return false;
		if (YEAR != other.YEAR)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GENRE=ProgrammingLiterature; TITLE=" + TITLE + "; AUTHOR=" + AUTHOR + "; YEAR=" + YEAR + "; PUBLISHING="
				+ PUBLISHING + "; PAGE_COUNT=" + PAGE_COUNT + "; WEIGTH=" + WEIGTH + "; PRICE=" + PRICE;
	}
	
}
