/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.modell;

/**
 *
 * @author P&D
 */
public class Categoria {

    private String id_categoria, name_cat, estado;
    boolean canEdit;

    public Categoria(String id_categoria, String name_cat, String estado) {
        this.id_categoria = id_categoria;
        this.name_cat = name_cat;
        this.estado = estado;
        this.canEdit=false;
    }

    public Categoria() {
        this.canEdit=false;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getName_cat() {
        return name_cat;
    }

    public void setName_cat(String name_cat) {
        this.name_cat = name_cat;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public boolean isCanEdit() {
      return canEdit;
   }

   public void setCanEdit(boolean canEdit) {
      this.canEdit = canEdit;
   }
}
