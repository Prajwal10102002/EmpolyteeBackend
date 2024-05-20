package com.prajwal.employeebackend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("could not found the user with the id "+(id));
    }
}
