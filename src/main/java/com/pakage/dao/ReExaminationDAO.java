/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.dao;


import com.entity.ReExaminationEntity;
import com.utils.HibernateUtils;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Nhi
 */
public class ReExaminationDAO extends AbstractDAO<ReExaminationEntity>{
    public List<ReExaminationEntity> listAll() {
        return super.listAll("ReExaminationEntity");
    }
    
       public static ReExaminationEntity get(int request_id) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        ReExaminationEntity sv = null;
        try {
            sv = (ReExaminationEntity) session.get(ReExaminationEntity.class, request_id);
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }

        return sv;
    }
    
    public boolean update(ReExaminationEntity item)
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
    
        public boolean create(ReExaminationEntity c) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        if (ReExaminationDAO.get(c.getIndex()) != null) {
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
