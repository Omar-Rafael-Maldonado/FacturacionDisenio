/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.daos;

import lista.controlador.Lista;
import modelo.Cliente;

/**
 *
 * @author omara
 */
public class PersonaDao extends AdapatadoDao<Cliente>{
    private Cliente persona; 

    public PersonaDao() {
        super(Cliente.class);
        
    }

    public Cliente getPersona() {
        if(persona == null)
            persona = new Cliente();
        
        return persona;
    }

    public void setPersona(Cliente persona) {
        this.persona = persona;
    }
    public boolean guardar(){
        persona.setId(new Long (listar().tamanio()+1));
        return guardar(persona);
    }
    public Lista<Cliente> buscarString(String dato){
        Lista<Cliente> lista = new Lista<>();
        Lista<Cliente> aux = listar();
        
        for (int i = 0; i < aux.tamanio(); i++) {
            Cliente p = aux.consultarDatoPosicion(i);
            Boolean band= p.getNombre().toLowerCase().contains(dato.toLowerCase());
            if(band){
                lista.insertarNodo(p);
            }
        }
        return lista;
    }
    
     public Lista<Cliente> buscarCedula(String dato){
        Lista<Cliente> lista = new Lista<>();
        Lista<Cliente> aux = listar();
        
        for (int i = 0; i < aux.tamanio(); i++) {
            Cliente p = aux.consultarDatoPosicion(i);
            Boolean band= p.getCedula().contains(dato.toLowerCase());
            if(band){
                lista.insertarNodo(p);
            }
        }
        return lista;
    }
    
    
}
