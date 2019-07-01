/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Caminhao;


/**
 *
 * @author dappo
 */
public class CaminhaoDAO extends GenericDAO<Caminhao, Long>{
    
    public CaminhaoDAO(){
        super(Caminhao.class);
    }
    
}
