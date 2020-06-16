/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.dao;

import com.entity.ClassEntity;
import com.utils.HibernateUtils;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Nhi
 */
public class ClassDAO extends AbstractDAO<ClassEntity> {

    public List<ClassEntity> listAll() {
        return super.listAll("ClassEntity");
    }

    public static ClassEntity find(String class_id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        ClassEntity class_entity = null;
        try {
            class_entity = (ClassEntity) session.get(ClassEntity.class, class_id);
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return class_entity;
    }

    public static boolean create(ClassEntity c) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        if (ClassDAO.find(c.getClassId()) != null) {
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
