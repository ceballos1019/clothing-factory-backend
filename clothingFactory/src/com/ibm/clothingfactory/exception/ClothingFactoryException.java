/**
 * 
 */
package com.ibm.clothingfactory.exception;

import org.apache.log4j.Logger;

/**
 * @author andressanchez
 *
 */
public class ClothingFactoryException extends Exception {

	/** seriaVersionUID **/
	private static final long serialVersionUID = 2501135526777254727L;
	
	private final Logger logger = Logger.getLogger(this.getClass());

	/**
	 * 
	 */
	public ClothingFactoryException() {
		
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ClothingFactoryException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ClothingFactoryException(String message, Throwable cause) {
		super(message, cause);
		logger.error(message, cause);
	}

	/**
	 * @param message
	 */
	public ClothingFactoryException(String message) {
		super(message);
		logger.error(message);
	}

	/**
	 * @param cause
	 */
	public ClothingFactoryException(Throwable cause) {
		super(cause);
		logger.error(cause);
	}

	

}
