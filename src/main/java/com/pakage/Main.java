package com.pakage;

import com.pakage.dao.StudentDAO;
import com.entity.StudentEntity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class Main {
    public static void main(String[] args) {

   
//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        String HQL="FROM StudentEntity";
//        List<StudentEntity> list = session.createQuery(HQL,StudentEntity.class).list();
//
//        session.close();
//
//        for(StudentEntity sv:list){
//            System.out.println(sv.getFullName());
//        }

StudentDAO student = new StudentDAO();
 List<StudentEntity> list=student.listAll();
        for(StudentEntity sv:list){
            System.out.println(sv.getFullName());
        }
    }
}

