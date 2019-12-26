package by.htp.library.service;

import by.htp.library.service.impl.LibraryServiceImpl;

public final class ServiceFactory {
	
	private static final ServiceFactory instance = new ServiceFactory();

	private final LibraryService libraryService = new LibraryServiceImpl();
	
	private ServiceFactory() {}

	public LibraryService getLibraryService() {

		return libraryService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}
	
}
