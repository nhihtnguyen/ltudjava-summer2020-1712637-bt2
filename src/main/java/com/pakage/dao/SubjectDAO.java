/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pakage.dao;

import com.entity.SubjectEntity;
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
public class SubjectDAO extends AbstractDAO<SubjectEntity> {

    public List<SubjectEntity> listAll() {
        return super.listAll("SubjectEntity");
    }

    public List<SubjectEntity> findByClassId(String class_id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        List<SubjectEntity> list = null;
        try {

            String hql = "from SubjectEntity sbj where sbj.classId = '" + class_id + "'";
            Query query = session.createQuery(hql);
            list = query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return list;
    }

    public static SubjectEntity get(String student_id) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        SubjectEntity s = null;
        try {
            s = (SubjectEntity) session.get(SubjectEntity.class, student_id);
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }

        return s;
    }

    public static boolean create(SubjectEntity s) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        if (SubjectDAO.get(s.getSubjectId()) != null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(s);
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
