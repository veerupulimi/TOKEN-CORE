/* COPYRIGHT (C) 2016 LTS. All Rights Reserved. */

package com.lts.core.dto;

/**
 * @author veeru
 *
 */
public class ErrorMessageDTO {
	
	/**
	 * the customer locale error message
	 */
	
	private String field;
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	

}
