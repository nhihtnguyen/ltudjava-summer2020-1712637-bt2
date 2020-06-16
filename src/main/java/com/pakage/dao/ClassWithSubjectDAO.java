/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.dao;

import com.entity.ClassWithSubjectEntity;
import com.entity.ClassWithSubjectEntityPK;
import com.utils.HibernateUtils;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author Nhi
 */
public class ClassWithSubjectDAO extends AbstractDAO<ClassWithSubjectEntity> {

    public List<ClassWithSubjectEntity> listAll() {
        return super.listAll("ClassWithSubjectEntity");
    }

    public static ClassWithSubjectEntity get(String class_id,String student_id) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        ClassWithSubjectEntity s = null;
        try {
            s = (ClassWithSubjectEntity) session.get(ClassWithSubjectEntity.class,new ClassWithSubjectEntityPK(class_id,student_id));
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }

        return s;
    }

    public static boolean create(ClassWithSubjectEntity c) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        if (ClassWithSubjectDAO.get(c.getClassId(),c.getStudentId()) != null) {
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
    
     public static boolean update(ClassWithSubjectEntity item) {
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
    
       public static boolean delete(ClassWithSubjectEntity c) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        if (ClassWithSubjectDAO.get(c.getClassId(),c.getStudentId()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(c);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }

        return true;
    }
       
       
        public static boolean deleteStudent(String class_id, String student_id) {
         Session session = HibernateUtils.getSessionFactory().openSession();
        ClassWithSubjectEntity sv = ClassWithSubjectDAO.get(class_id,student_id);
        if (sv == null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(sv);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }

        return true;
    }
    
     public static List<ClassWithSubjectEntity> getList(String class_id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        List<ClassWithSubjectEntity> list = null;
        try {
          
            String hql = "from ClassWithSubjectEntity c where c.classId = '"+class_id+"'";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return list;
     }
     
     public static List<String> getListClass()
     {
         Session session = HibernateUtils.getSessionFactory().openSession();
        List<String> list = null;
        try {
          
            String hql = "select classId from ClassWithSubjectEntity c group by classId";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return list;
     }
     
    

}
