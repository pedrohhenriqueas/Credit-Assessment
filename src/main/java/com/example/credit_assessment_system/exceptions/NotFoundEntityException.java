package com.example.credit_assessment_system.exceptions;

public class NotFoundEntityException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public NotFoundEntityException(String msg) {
		super(msg);
	}
}
