/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.controller;

import com.samuel.controllerimpl.CategoriaCtrlImpl;
import java.io.Serializable;
import com.samuel.dao.CategoriaDAO;
import com.samuel.modell.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author P&D
 */
@ManagedBean(name = "categoriaCtrl")
@ViewScoped
public class CategoriaCtrl implements Serializable {
    private static final long serialVersionUID = 1L;
    private Categoria selected;
    private CategoriaDAO catdao;
    private List<Categoria> list = new ArrayList<Categoria>();
    

    public CategoriaCtrl() { 
        this.selected = new Categoria();
        this.catdao = new CategoriaCtrlImpl();
    }

    public void createCategoria() {        
        this.catdao = new CategoriaCtrlImpl();
        if (catdao.createCategoria(selected)) {
            System.out.println("Insertado");
            this.selected = new Categoria();
        } else {
            System.out.println("Error al momento de insertar");
        }
    }

    public List<Categoria> getList() {
        list = catdao.readCategoria();
        return list;
    }
    public void prepareUpdate(Categoria cat){
    this.selected = new Categoria();
        System.out.println("ID_CATEGORIA "+cat.getId_categoria());
    this.selected = cat;
    }
    public void updateCategoria() {   
        this.catdao = new CategoriaCtrlImpl();
        System.out.println("Id categoria = "+selected.getId_categoria());
        System.out.println("valor de edit "+selected.getName_cat());
        if (catdao.updateCategoria(selected)) {
            System.out.println("Actualizado");
            this.selected = new Categoria();
        } else {
            System.out.println("Error al momento de actualizar");
        }
        
    }
    
    public void updateInLineCategoria(Categoria c) {   
        this.catdao = new CategoriaCtrlImpl();
        System.out.println("Id categoria = "+c.getId_categoria());
        System.out.println("valor de edit "+c.getName_cat());
        if (catdao.updateCategoria(c)) {
            System.out.println("Actualizado");
            this.selected = new Categoria();
        } else {
            System.out.println("Error al momento de actualizar");
        }
        
    }
    
    public void deleteCategoria(String id){
        System.out.println("id:"+id);
        this.catdao = new CategoriaCtrlImpl();
        if (catdao.deleteCategoria(id)) {
            System.out.println("Eliminado"+id);
        } else {
            System.out.println("Error al momento de eliminar");
        }
    }
    public Categoria getSelected() {
        return selected;
    }

    public void setSelected(Categoria selected) {
        this.selected = selected;
    }    	
}
