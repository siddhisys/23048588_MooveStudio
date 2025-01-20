package com.Mooveapp.model;

/**
 *It is a class that has details about the dance list such as
 * serial number, class name, age of students, skill level, start and end time,
 * instructors and total students involved.
 * 
 * @author Siddhi
 * LMUID 23048588
 */
public class MooveModel {

    //fields
    private int serialNo; //unique serial number for the class
    private String className; //class name 
    private short age; //age group of the class
    private String skillLevel;//skill level for the class
    private String startTime;    // Added startTime field
    private String endTime;// end time for the class
    private String instructor;//  instructor for the class
    private int totalStudents; // total number of the students in the class

    /**
     * Constructor
     */
    public MooveModel() {
    }

    /**
     * constructor with parameters to initialize all the fields.
     * 
     * @param serialNo unique serial number for the class
     * @param className class name 
     * @param age age group of the class
     * @param skillLevel skill level for the class
     * @param startTime Added startTime field
     * @param endTime end time for the class
     * @param instructor instructor for the class
     * @param totalStudents total number of the students in the class
     */
    public MooveModel(int serialNo, String className, short age,
            String skillLevel, String startTime, String endTime, String instructor,
            int totalStudents) {
        this.serialNo = serialNo;
        this.className = className;
        this.age = age;
        this.skillLevel = skillLevel;
        this.startTime = startTime;  
        this.endTime = endTime;
        this.instructor = instructor;
        this.totalStudents = totalStudents;
    }

    //getter and setter for each field
    
    /**
     * gets the serial number of the class
     * @return serial number
     */
    public int getSerialNo() {
        return serialNo;
    }

    /**
     * sets the serial number for the class
     * @param serialNo to set
     */
    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * gets the class name of the class
     * @return class name
     */
    public String getClassName() {
        return className;
    }

    /**
     * sets the class name for the class
     * @param fullName to set
     */
    public void setClassName(String fullName) {
        this.className = fullName;
    }
    
    /**
    * gets the age for the class
    * @return age
    */
    public short getAge() {
        return age;
    }

    /**
     * sets the age for the class
     * @param age to set
     */
    public void setAge(short age) {
        this.age = age;
    }

    /**
     * gets the skill level of the class
     * @return skill level
     */
    public String getSkillLevel() {
        return skillLevel;
    }

    /**
     * sets the skill level for the class
     * @param skillLevel to set
     */
    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    /**
     * gets the start time for the class
     * @return start time
     */
    public String getStartTime() { 
        return startTime;
    }

    /**
     * sets the start time for the class
     * @param startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * gets end time for the class
     * @return end time
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * sets end time for the class
     * @param endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * gets instructor for the class
     * @return instructor
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * sets the instructor for the class
     * @param instructor to set 
     */
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    /**
     * gets total students for the class
     * @return total student
     */
    public int getTotalStudents() {
        return totalStudents;
    }

    /**
     * sets total students for the class
     * @param totalStudents to set
     */
    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }
}
