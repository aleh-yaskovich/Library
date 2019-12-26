package by.htp.library.dao;

import by.htp.library.dao.impl.LibraryDAOImpl;

public class DAOFactory {

	private static final DAOFactory instance = new DAOFactory();
	
	private final LibraryDAO libraryDAO = new LibraryDAOImpl();
	
	private DAOFactory() {}
	
	public LibraryDAO getLibraryDAO() {
		return libraryDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
	
}
