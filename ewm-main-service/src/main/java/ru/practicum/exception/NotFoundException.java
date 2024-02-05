package ru.practicum.exception;

/**
 * Send status 404
 */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
