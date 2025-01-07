package com.Moooveapp.controller;

import java.util.regex.Pattern;

/**
 *
 * @author Siddhi
 * LMUID 23048588
 */
public class ValidationUtil {

    private static final Pattern SERIAL_NO_PATTERN = Pattern.compile("^\\d+$"); // Only digits allowed
    private static final Pattern CLASS_NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$"); // Letters and spaces allowed
    private static final Pattern AGE_PATTERN = Pattern.compile("^[1-9][0-9]$"); // 1 or 2 digits for age
    private static final Pattern SKILL_LEVEL_PATTERN = Pattern.compile("^(Beginner|Intermediate|Advanced)$"); // Defined levels
    private static final Pattern TIME_PATTERN = Pattern.compile("^(0[1-9]|1[0-2]):[0-5][0-9]\\s?(AM|PM)$"); // 12-hour time format with AM/PM
    private static final Pattern INSTRUCTOR_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$"); // Letters and spaces allowed
    private static final Pattern TOTAL_STUDENTS_PATTERN = Pattern.compile("^\\d+$"); // Only digits allowed

    public static boolean isValidSerialNo(String serialNo) {
        return SERIAL_NO_PATTERN.matcher(serialNo).matches();
    }

    public static boolean isValidClassName(String className) {
        return CLASS_NAME_PATTERN.matcher(className).matches();
    }

    public static boolean isValidAge(String age) {
        return AGE_PATTERN.matcher(age).matches();
    }

    public static boolean isValidSkillLevel(String skillLevel) {
        return SKILL_LEVEL_PATTERN.matcher(skillLevel).matches();
    }

    public static boolean isValidTime(String time) {
        return TIME_PATTERN.matcher(time).matches();
    }

    public static boolean isValidInstructor(String instructor) {
        return INSTRUCTOR_PATTERN.matcher(instructor).matches();
    }

    public static boolean isValidTotalStudents(String totalStudents) {
        return TOTAL_STUDENTS_PATTERN.matcher(totalStudents).matches();
    }
}
