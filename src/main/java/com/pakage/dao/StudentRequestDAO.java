/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.dao;


import com.entity.StudentRequestEntity;
import com.utils.HibernateUtils;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Nhi
 */
public class StudentRequestDAO extends AbstractDAO<StudentRequestEntity>{
    public List<StudentRequestEntity> listAll() {
        return super.listAll("StudentRequestEntity");
    }
    
       public static StudentRequestEntity get(int request_id) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        StudentRequestEntity sv = null;
        try {
            sv = (StudentRequestEntity) session.get(StudentRequestEntity.class, request_id);
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }

        return sv;
    }
    
    public boolean updateRemark(StudentRequestEntity item)
    {
             if (item == null) {
            return false;
        }
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(item);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        
        }
        return true;
    }
    
        public boolean create(StudentRequestEntity c) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        if (StudentRequestDAO.get(c.getRequestId()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(c);
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
