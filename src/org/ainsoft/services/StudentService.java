/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ainsoft.services;

import java.sql.SQLException;
import org.ainsoft.model.Student;

/**
 *
 * @author Tona
 */
public interface StudentService {
    java.util.List<Student> getStudents()throws SQLException;
    Student getStudentById(int studentId)throws SQLException;
    Student getStudentByName(String studentName)throws SQLException;
}
