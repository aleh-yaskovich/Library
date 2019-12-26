package by.htp.library.entity;

public class BookCollection {
	
	private String GENRE;
	
	public BookCollection() {
		this.GENRE = null;
	}
	
	public BookCollection(String GENRE) {
		this.GENRE = GENRE;
	}

	public String getGENRE() {
		return GENRE;
	}

	public void setGENRE(String gENRE) {
		GENRE = gENRE;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((GENRE == null) ? 0 : GENRE.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookCollection other = (BookCollection) obj;
		if (GENRE == null) {
			if (other.GENRE != null)
				return false;
		} else if (!GENRE.equals(other.GENRE))
			return false;
		return true;
	}
	
}
