package com.example.bsn.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class OperationNotPermittedException extends RuntimeException {

    public OperationNotPermittedException(String message) {
        super(message);
    }
}
