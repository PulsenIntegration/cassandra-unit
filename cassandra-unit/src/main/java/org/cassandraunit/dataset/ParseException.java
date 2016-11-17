package org.cassandraunit.dataset;

/**
 * @author Jeremy Sevellec
 */
public class ParseException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParseException(Throwable e) {
        super(e);
    }

    public ParseException(String message) {
        super(message);
    }

}
