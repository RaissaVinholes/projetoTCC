/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Cliente;


/**
 *
 * @author dappo
 */
public class ClienteDAO extends GenericDAO<Cliente, Long>{
    
    public ClienteDAO(){
        super(Cliente.class);
    }
    
}
