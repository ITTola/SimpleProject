/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ainsoft.model;

/**
 *
 * @author Tona
 */
public class Student {
    private int studentId;
    private String studentName;
    private String studentGender;
    private String studentAddress;

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the studentGender
     */
    public String getStudentGender() {
        return studentGender;
    }

    /**
     * @param studentGender the studentGender to set
     */
    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    /**
     * @return the studentAddress
     */
    public String getStudentAddress() {
        return studentAddress;
    }

    /**
     * @param studentAddress the studentAddress to set
     */
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName=" + studentName + ", studentGender=" + studentGender + ", studentAddress=" + studentAddress + '}';
    }
    
}
