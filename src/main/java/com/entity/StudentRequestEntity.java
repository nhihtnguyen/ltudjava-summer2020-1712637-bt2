package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_request", schema = "quanlysinhviendb", catalog = "")
public class StudentRequestEntity {
    private int requestId;
    private String studentId;
    private String name;
    private String subjectId;
    private String scoreName;
    private double score;
    private String reason;
    private String status;

    public StudentRequestEntity() {
    }

    public StudentRequestEntity(String studentId, String name, String subjectId, String scoreName, double score, String reason, String status) {
        this.studentId = studentId;
        this.name = name;
        this.subjectId = subjectId;
        this.scoreName = scoreName;
        this.score = score;
        this.reason = reason;
        this.status = status;
    }



    
    @Id
    @Column(name = "request_id")
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    @Basic
    @Column(name = "student_id")
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "subject_id")
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Basic
    @Column(name = "score_name")
    public String getScoreName() {
        return scoreName;
    }

    public void setScoreName(String scoreName) {
        this.scoreName = scoreName;
    }

    @Basic
    @Column(name = "score")
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentRequestEntity that = (StudentRequestEntity) o;

        if (requestId != that.requestId) return false;
        if (Double.compare(that.score, score) != 0) return false;
        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (subjectId != null ? !subjectId.equals(that.subjectId) : that.subjectId != null) return false;
        if (scoreName != null ? !scoreName.equals(that.scoreName) : that.scoreName != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = requestId;
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (subjectId != null ? subjectId.hashCode() : 0);
        result = 31 * result + (scoreName != null ? scoreName.hashCode() : 0);
        temp = Double.doubleToLongBits(score);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
