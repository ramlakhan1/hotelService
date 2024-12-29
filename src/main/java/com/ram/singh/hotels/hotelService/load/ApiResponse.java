package com.ram.singh.hotels.hotelService.load;

import org.springframework.http.HttpStatus;

public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;

    public ApiResponse(String message, boolean b, HttpStatus httpStatus) {
        this.message = message;
        this.success = b;
        this.status = httpStatus;
    }
}
