package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "subject", schema = "quanlysinhviendb", catalog = "")
public class SubjectEntity {
    private String subjectId;
    private String classId;
    private String subjectName;
    private String room;

    public SubjectEntity() {
    }

    public SubjectEntity(String subjectId, String classId, String subjectName, String room) {
        this.subjectId = subjectId;
        this.classId = classId;
        this.subjectName = subjectName;
        this.room = room;
    }

    @Id
    @Column(name = "subject_id")
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
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
    @Column(name = "subject_name")
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Basic
    @Column(name = "room")
    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubjectEntity that = (SubjectEntity) o;

        if (subjectId != null ? !subjectId.equals(that.subjectId) : that.subjectId != null) return false;
        if (classId != null ? !classId.equals(that.classId) : that.classId != null) return false;
        if (subjectName != null ? !subjectName.equals(that.subjectName) : that.subjectName != null) return false;
        if (room != null ? !room.equals(that.room) : that.room != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subjectId != null ? subjectId.hashCode() : 0;
        result = 31 * result + (classId != null ? classId.hashCode() : 0);
        result = 31 * result + (subjectName != null ? subjectName.hashCode() : 0);
        result = 31 * result + (room != null ? room.hashCode() : 0);
        return result;
    }
}
