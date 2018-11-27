/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.dao;


import com.samuel.modell.Categoria;
import java.util.ArrayList;

/**
 *
 * @author P&D
 */
public interface CategoriaDAO {
    public boolean createCategoria(Categoria cat);
    public ArrayList<Categoria> readCategoria();
    public boolean updateCategoria(Categoria cat);
    public boolean deleteCategoria(String id);
    
    public void createCategoria();
}
