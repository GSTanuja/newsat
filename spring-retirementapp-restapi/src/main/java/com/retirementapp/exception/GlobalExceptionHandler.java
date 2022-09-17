package com.retirementapp.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.retirementapp.model.ApiErrors;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		headers.add("error", "Method not allowed");
		List<String> errorMsg = new ArrayList<>();
		errorMsg.add(ex.getMessage());
		errorMsg.add(request.toString());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), status.value(), errorMsg);

		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		headers.add("error", "Media type not supported");
		List<String> errorMsg = new ArrayList<>();
		errorMsg.add(ex.getMessage());
		errorMsg.add(request.toString());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), status.value(), errorMsg);

		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		headers.add("error", "Missing path variable");
		List<String> errorMsg = new ArrayList<>();
		errorMsg.add(ex.getMessage());
		errorMsg.add(request.toString());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), status.value(), errorMsg);

		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		headers.add("error", "Handle Missing servletrequest");
		List<String> errorMsg = new ArrayList<>();
		errorMsg.add(ex.getMessage());
		errorMsg.add(request.toString());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), status.value(), errorMsg);

		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		headers.add("error", "type mismatch");
		List<String> errorMsg = new ArrayList<>();
		errorMsg.add(ex.getMessage());
		errorMsg.add(request.toString());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), status.value(), errorMsg);

		return ResponseEntity.status(status).body(errors);
	}

	@ExceptionHandler(PlanNotFoundException.class)
	public ResponseEntity<Object> handlePlanNotFound(PlanNotFoundException ex) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("error", ex.getMessage());
		List<String> errorMsg = new ArrayList<>();
		errorMsg.add(ex.getMessage());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), HttpStatus.CONFLICT.value(), errorMsg);
		return ResponseEntity.status(HttpStatus.CONFLICT).body(errors);

	}

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Object> handlePlanNotFound(EmployeeNotFoundException ex) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("error", ex.getMessage());
		List<String> errorMsg = new ArrayList<>();
		errorMsg.add(ex.getMessage());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), HttpStatus.CONFLICT.value(), errorMsg);
		return ResponseEntity.status(HttpStatus.CONFLICT).body(errors);

	}

	@ExceptionHandler(AccountNotFoundException.class)
	public ResponseEntity<Object> handlePlanNotFound(AccountNotFoundException ex) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("error", ex.getMessage());
		List<String> errorMsg = new ArrayList<>();
		errorMsg.add(ex.getMessage());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), HttpStatus.CONFLICT.value(), errorMsg);
		return ResponseEntity.status(HttpStatus.CONFLICT).body(errors);

	}

}
