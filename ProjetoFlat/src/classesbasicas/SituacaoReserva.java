/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesbasicas;

/**
 *
 * @author peppe
 */
public enum SituacaoReserva {
    ATIVO("ATIVO"),
    INATIVO("INATIVO");
    
    private String situacao;
    
    private SituacaoReserva(String sit){
        this.situacao = sit;
    }
   public String getDescricao(){
       return situacao;
   } 
   
    
}
