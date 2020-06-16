/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author Nhi
 */
import javax.persistence.*;

@Entity
@Table(name = "class_with_subject", schema = "quanlysinhviendb", catalog = "")
@IdClass(ClassWithSubjectEntityPK.class)
public class ClassWithSubjectEntity {
    private String classId;
    private String studentId;
    private Double midTermScore;
    private Double endTermScore;
    private Double otherScore;
    private Double finalScore;

    public ClassWithSubjectEntity() {
    }

    public ClassWithSubjectEntity(String classId, String studentId) {
        this.classId = classId;
        this.studentId = studentId;
    }

    public ClassWithSubjectEntity(String classId, String studentId, Double midTermScore, Double endTermScore, Double otherScore, Double finalScore) {
        this.classId = classId;
        this.studentId = studentId;
        this.midTermScore = midTermScore;
        this.endTermScore = endTermScore;
        this.otherScore = otherScore;
        this.finalScore = finalScore;
    }
    

    @Id
    @Column(name = "class_id")
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
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
    @Column(name = "mid_term_score")
    public Double getMidTermScore() {
        return midTermScore;
    }

    public void setMidTermScore(Double midTermScore) {
        this.midTermScore = midTermScore;
    }

    @Basic
    @Column(name = "end_term_score")
    public Double getEndTermScore() {
        return endTermScore;
    }

    public void setEndTermScore(Double endTermScore) {
        this.endTermScore = endTermScore;
    }

    @Basic
    @Column(name = "other_score")
    public Double getOtherScore() {
        return otherScore;
    }

    public void setOtherScore(Double otherScore) {
        this.otherScore = otherScore;
    }

    @Basic
    @Column(name = "final_score")
    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassWithSubjectEntity that = (ClassWithSubjectEntity) o;

        if (classId != null ? !classId.equals(that.classId) : that.classId != null) return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (midTermScore != null ? !midTermScore.equals(that.midTermScore) : that.midTermScore != null) return false;
        if (endTermScore != null ? !endTermScore.equals(that.endTermScore) : that.endTermScore != null) return false;
        if (otherScore != null ? !otherScore.equals(that.otherScore) : that.otherScore != null) return false;
        if (finalScore != null ? !finalScore.equals(that.finalScore) : that.finalScore != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classId != null ? classId.hashCode() : 0;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (midTermScore != null ? midTermScore.hashCode() : 0);
        result = 31 * result + (endTermScore != null ? endTermScore.hashCode() : 0);
        result = 31 * result + (otherScore != null ? otherScore.hashCode() : 0);
        result = 31 * result + (finalScore != null ? finalScore.hashCode() : 0);
        return result;
    }
}

