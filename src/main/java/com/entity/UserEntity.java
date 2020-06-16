package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "quanlysinhviendb", catalog = "")
public class UserEntity {

    private Integer userId;
    private String username;
    private String password;
    private int role;
    private String roleName;

    public UserEntity() {
    }

    public UserEntity(String username, String password, int role, String roleName) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.roleName = roleName;
    }

    public UserEntity(String username, String password) {

        this.username = username;
        this.password = password;
        this.role = 1;
        this.roleName = "Sinh Vien";
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "role")
    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) {
            return false;
        }
        if (role != that.role) {
            return false;
        }
        if (username != null ? !username.equals(that.username) : that.username != null) {
            return false;
        }
        if (password != null ? !password.equals(that.password) : that.password != null) {
            return false;
        }
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + role;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }
}
