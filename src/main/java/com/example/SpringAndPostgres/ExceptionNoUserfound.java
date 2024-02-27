package com.example.SpringAndPostgres;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "user not found")
public class ExceptionNoUserfound extends RuntimeException {
}

