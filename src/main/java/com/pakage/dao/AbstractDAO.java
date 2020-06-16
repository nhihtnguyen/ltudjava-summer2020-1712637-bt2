/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.dao;


import com.utils.HibernateUtils;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Nhi
 */
public abstract class AbstractDAO<E> {

public List<E> listAll(String obj)
{
    
     List<E> ds = new ArrayList();
        Session session = HibernateUtils.getSessionFactory().openSession();
        try {
            String hql = "select obj from " + obj + " obj";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
}

}
