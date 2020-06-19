/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.dao;

import com.entity.UserEntity;
import com.utils.HibernateUtils;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;



/**
 *
 * @author Nhi
 */
public class UserDAO extends AbstractDAO<UserEntity> {
    public List<UserEntity> listAll() {
        return super.listAll("UserEntity");
    }
    
    public UserEntity find(String username, String password)
    { 
         List<UserEntity> list = new ArrayList();
         Session session = HibernateUtils.getSessionFactory().openSession();
        try {
            String hql = "select u from UserEntity u where username =:username and password =:password";
            Query query = session.createQuery(hql);
            query.setParameter("username",username);
            query.setParameter("password",password);
            list = query.list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        if(list.size()==0) return null;
        else
        return list.get(0);
    }
    
        public static UserEntity get(String username) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        UserEntity user = null;
        try {
            user = (UserEntity) session.get(UserEntity.class, username);
        } catch(HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return user;
    }

    
        public static boolean create(UserEntity u) {
         Session session = HibernateUtils.getSessionFactory().openSession();
        if (UserDAO.get(u.getUsername())!= null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(u);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
        
         public static boolean update(UserEntity item) {
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
         
         public static boolean updatePass(String username, String password)
         {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transaction = session.getTransaction();
        try {
            transaction.begin();
            String hql = "update UserEntity set password ='" + password + "' where username='" + username + "'";
            Query query = session.createQuery(hql);
            query.executeUpdate();
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
