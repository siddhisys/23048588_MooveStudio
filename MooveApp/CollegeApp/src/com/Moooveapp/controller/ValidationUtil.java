package com.Moooveapp.controller;

import java.util.regex.Pattern;

/**
 * It is a class for validating all the input fields.
 * @author Siddhi
 * LMUID 23048588
 */
public class ValidationUtil {

    //Validating a serial number where only digits are allowed
    private static final Pattern SERIAL_NO_PATTERN = Pattern.compile("^\\d+$"); 
    
    // Validating a class name where letters and spaces are allowed
    private static final Pattern CLASS_NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$"); 
    
    //Validating age where only 1 or 2 digits are allowed
    private static final Pattern AGE_PATTERN = Pattern.compile("^[1-9][0-9]$");
    
    //Validating skill level where only the defined levels can be selected
    private static final Pattern SKILL_LEVEL_PATTERN = Pattern.compile("^(Beginner|Intermediate|Advanced)$");
    
    //Validating time where only 12 hour format is used
    private static final Pattern TIME_PATTERN = Pattern.compile("^(0[1-9]|1[0-2]):[0-5][0-9]\\s?(AM|PM)$");
    
    //Validating instructor name where only letters and spaces are allowed
    private static final Pattern INSTRUCTOR_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    
    //Validating total number of students where only digits are allowed
    private static final Pattern TOTAL_STUDENTS_PATTERN = Pattern.compile("^\\d+$");

    public static boolean isValidSerialNo(String serialNo) {
        return SERIAL_NO_PATTERN.matcher(serialNo).matches();
        //validates if the given is number is valid
    }

    public static boolean isValidClassName(String className) {
        return CLASS_NAME_PATTERN.matcher(className).matches();
        //validates if the given class name is valid
    }

    public static boolean isValidAge(String age) {
        return AGE_PATTERN.matcher(age).matches();
        //validates if the given age is valid
    }

    public static boolean isValidSkillLevel(String skillLevel) {
        return SKILL_LEVEL_PATTERN.matcher(skillLevel).matches();
        //validates if the given skill level is valid
    }

    public static boolean isValidTime(String time) {
        return TIME_PATTERN.matcher(time).matches();
        //validates if the given time is valid
    }

    public static boolean isValidInstructor(String instructor) {
        return INSTRUCTOR_PATTERN.matcher(instructor).matches();
        //validates if the given instructor is valid
    }

    public static boolean isValidTotalStudents(String totalStudents) {
        return TOTAL_STUDENTS_PATTERN.matcher(totalStudents).matches();
        //validates if the given total student is valid
    }
}
