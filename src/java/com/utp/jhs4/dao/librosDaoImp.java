/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utp.jhs4.dao;

import com.utp.jhs4.entity.Libros;
import com.utp.jhs4.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Laura
 */
public class librosDaoImp implements librosDao{

    @Override
    public List<Libros> mostrarLibros() {
        List<Libros> listarlibros = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        String hql = "FROM Libros";
        return null;
        
    }
    
}
