package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException{

    StudentNotFoundException(long Id){
        super("Could not find student with ID " + Id);
    }
}
