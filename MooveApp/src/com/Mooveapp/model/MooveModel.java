package com.Mooveapp.model;

/**
 *
 * @author Siddhi LMUID 23048588
 */
public class MooveModel {

    private int serialNo;
    private String className;
    private short age;
    private String skillLevel;
    private String startTime;    // Added startTime field
    private String endTime;
    private String instructor;
    private int totalStudents;

    public MooveModel() {
    }

    public MooveModel(int serialNo, String className, short age,
            String skillLevel, String startTime, String endTime, String instructor,
            int totalStudents) {
        this.serialNo = serialNo;
        this.className = className;
        this.age = age;
        this.skillLevel = skillLevel;
        this.startTime = startTime;  // Added startTime initialization
        this.endTime = endTime;
        this.instructor = instructor;
        this.totalStudents = totalStudents;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String fullName) {
        this.className = fullName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getStartTime() {    // Added getter for startTime
        return startTime;
    }

    public void setStartTime(String startTime) {    // Added setter for startTime
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }
}
