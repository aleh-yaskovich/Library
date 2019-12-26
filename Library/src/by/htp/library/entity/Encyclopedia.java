package by.htp.library.entity;

public class Encyclopedia extends BookCollection {

	private String TITLE;
	private int YEAR;
	private String PUBLISHING;
	private int PAGE_COUNT;
	private int WIDTH;
	private int HEIGHT;
	private int THICKNESS;
	private int WEIGTH;
	private double PRICE;
	
	public Encyclopedia() {
		super();
		this.TITLE = null;
		this.YEAR = 0;
		this.PUBLISHING  = null;
		this.PAGE_COUNT = 0;
		this.WIDTH = 0;
		this.HEIGHT = 0;
		this.THICKNESS = 0;
		this.WEIGTH = 0;
		this.PRICE = 0;
	}
	
	public Encyclopedia(String TITLE, int YEAR, String PUBLISHING, int PAGE_COUNT, int WIDTH, int HEIGHT, int THICKNESS, int WEIGTH, double PRICE) {
		super("Encyclopedia");
		this.TITLE = TITLE;
		this.YEAR = YEAR;
		this.PUBLISHING  = PUBLISHING;
		this.PAGE_COUNT = PAGE_COUNT;
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		this.THICKNESS = THICKNESS;
		this.WEIGTH = WEIGTH;
		this.PRICE = PRICE;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
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

	public int getWIDTH() {
		return WIDTH;
	}

	public void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}

	public int getHEIGHT() {
		return HEIGHT;
	}

	public void setHEIGHT(int hEIGHT) {
		HEIGHT = hEIGHT;
	}

	public int getTHICKNESS() {
		return THICKNESS;
	}

	public void setTHICKNESS(int tHICKNESS) {
		THICKNESS = tHICKNESS;
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
		result = prime * result + HEIGHT;
		result = prime * result + PAGE_COUNT;
		long temp;
		temp = Double.doubleToLongBits(PRICE);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((PUBLISHING == null) ? 0 : PUBLISHING.hashCode());
		result = prime * result + THICKNESS;
		result = prime * result + ((TITLE == null) ? 0 : TITLE.hashCode());
		result = prime * result + WEIGTH;
		result = prime * result + WIDTH;
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
		Encyclopedia other = (Encyclopedia) obj;
		if (HEIGHT != other.HEIGHT)
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
		if (THICKNESS != other.THICKNESS)
			return false;
		if (TITLE == null) {
			if (other.TITLE != null)
				return false;
		} else if (!TITLE.equals(other.TITLE))
			return false;
		if (WEIGTH != other.WEIGTH)
			return false;
		if (WIDTH != other.WIDTH)
			return false;
		if (YEAR != other.YEAR)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GENRE=Encyclopedia; TITLE=" + TITLE + "; YEAR=" + YEAR + "; PUBLISHING=" + PUBLISHING + "; PAGE_COUNT="
				+ PAGE_COUNT + "; WIDTH=" + WIDTH + "; HEIGHT=" + HEIGHT + "; THICKNESS=" + THICKNESS + "; WEIGTH="
				+ WEIGTH + "; PRICE=" + PRICE;
	}
	
}
