package com.cim.exception;

import javax.ws.rs.NotAcceptableException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.cim.beans.ErrorMessage;

@Provider
public class NotAcceptableExecptionMapper implements ExceptionMapper<NotAcceptableException> {

	@Override
	public Response toResponse(NotAcceptableException ex) {
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), Status.NOT_ACCEPTABLE.getStatusCode());
		return Response.status(Status.NOT_ACCEPTABLE)
				.entity(errorMessage)
				.build();
	}
	
}
