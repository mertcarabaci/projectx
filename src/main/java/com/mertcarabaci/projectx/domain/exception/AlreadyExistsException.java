package com.mertcarabaci.projectx.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Already exists!")
public class AlreadyExistsException extends RuntimeException {
}
