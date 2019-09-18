/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utp.jhs4.dao;

import com.utp.jhs4.entity.Libros;
import java.util.List;

/**
 *
 * @author Laura
 */
public interface librosDao {
    //listar libros de la biblioteca
    public List<Libros> mostrarLibros();
    
}
