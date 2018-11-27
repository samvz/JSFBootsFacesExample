/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samuel.controller;

import com.samuel.controllerimpl.UsuarioCtrlImpl;
import com.samuel.dao.UsuarioDAO;
import com.samuel.modell.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author P&D
 */
public class UsuarioCtrl  implements Serializable{
    private static final long serialVersionUID = 1L;
    private Usuario selected;
    private UsuarioDAO usdao;
    private List<Usuario> list = new ArrayList<Usuario>();

    public UsuarioCtrl() {
        this.selected = new Usuario();
        this.usdao = new UsuarioCtrlImpl();
    }
    
    

    public Usuario getSelected() {
        return selected;
    }

    public void setSelected(Usuario selected) {
        this.selected = selected;
    }
    
}
