package com.addressbook;

public class AddressBookException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	enum ExceptionType {
		DatabaseException, NoSuchClass, ResourcesNotClosedException, ConnectionFailed, CommitFailed
	}

	public ExceptionType type;

	public AddressBookException(String message, ExceptionType type) {
		super(message);
		this.type = type;
	}
}
