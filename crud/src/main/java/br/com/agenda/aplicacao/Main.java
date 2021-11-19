/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.agenda.aplicacao;

import br.com.agenda.model.Contato;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author canal
 */
public class Main {
    
    public static void main(String[] args)  {
        
        //**Bota nego no banco**//
        
        ContatoDAO contatoDao = new contaoDAO();
        
        Contato contato = new Contato();
        contato.setnome("Maria");
        contato.setIdade(55);
        contato.setDataCadastro(new Date());
        
        contatoDao.save(contato);
        
        //** ------------------**//
        
        Contato c1 = new Contato();
        c1.setNome("Joao antes maria");
        c1.setIdade(31);
        c1.setDataCadastro(new Date());
        c1.setId(1);
        
        contatoDao.update(c1);
        
        //**REMOVER CONTATO**//
        
        contatoDao.deleteByID(1);
        
         
        
                
        
        //**Aparecer na tela**//
        
        for(Contato c : contatoDao.getContatos()) {
            
            System.out.println("Contato: "+c.getNome());
        
                
        
}
    
  