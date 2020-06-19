package com.pakage;

import com.pakage.dao.StudentDAO;
import com.entity.StudentEntity;
import com.form.Login;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    
           Login lg = new Login();
            lg.setVisible(true);
   
    }
}

