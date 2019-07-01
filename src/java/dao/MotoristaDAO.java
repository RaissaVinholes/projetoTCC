/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Motorista;


/**
 *
 * @author dappo
 */
public class MotoristaDAO extends GenericDAO<Motorista, Long>{
    
    public MotoristaDAO(){
        super(Motorista.class);
    }
    
}
