package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "student", schema = "quanlysinhviendb", catalog = "")
public class StudentEntity {
    
    private String studentId;
    private String classId;
    private String fullName;
    private String gender;
    private String idcard;

    public StudentEntity() {
    }



    public StudentEntity(String studentId, String classId, String fullName, String gender, String idcard) {
        this.studentId = studentId;
        this.classId = classId;
        this.fullName = fullName;
        this.gender = gender;
        this.idcard = idcard;
    }

    @Id
    @Column(name = "student_id")
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    
    @Basic
    @Column(name = "class_id")
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "idcard")
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return studentId == that.studentId &&
                Objects.equals(fullName, that.fullName) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(idcard, that.idcard);
    }

    @Override
    public int hashCode() {
        return Objects.hash( studentId, fullName, gender, idcard);
    }
}
