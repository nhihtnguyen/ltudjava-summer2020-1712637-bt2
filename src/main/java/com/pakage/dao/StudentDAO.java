/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.dao;

import com.entity.StudentEntity;
import com.utils.HibernateUtils;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author Nhi
 */
public class StudentDAO extends AbstractDAO<StudentEntity>{
public List<StudentEntity> listAll() {
        return super.listAll("StudentEntity");
    }
 public static List<StudentEntity> getListStudent(String class_id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        List<StudentEntity> list = null;
        try {
          
            String hql = "from StudentEntity sv where sv.classId = '"+class_id+"'";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return list;
    }

     public static StudentEntity get(String student_id) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        StudentEntity sv = null;
        try {
            sv = (StudentEntity) session.get(StudentEntity.class, student_id);
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }

        return sv;
    }
 
 public static boolean create(StudentEntity sv) {
         Session session = HibernateUtils.getSessionFactory().openSession();

        if (StudentDAO.get(sv.getStudentId()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(sv);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }

        return true;
    }
    
}
