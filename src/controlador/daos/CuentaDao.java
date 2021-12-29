/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.daos;

import lista.controlador.Lista;
import modelo.Cuenta;
import modelo.Cliente;

/**
 *
 * @author omara
 */
public class CuentaDao extends AdapatadoDao<Cuenta>{
    private Cuenta cuenta; 

    public CuentaDao() {
        super(Cuenta.class);
        
    }

    public Cuenta getCuenta() {
        if(cuenta == null)
            cuenta = new Cuenta();
        
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public boolean guardar(){
        cuenta.setId(new Long (listar().tamanio()+1));
        return guardar(cuenta);
    }
    
    //Aqui me quedé
    //Implementar busqueda binaria
    public Cuenta buscarCuenta(String dato){
        Cuenta c=null;
        Lista<Cuenta> lista= listar();
        for (int i = 0; i < lista.tamanio(); i++) {
            if(dato.equals(lista.consultarDatoPosicion(i).getCorreo()))
                c= lista.consultarDatoPosicion(i); break;
        }
        return c;
    }
    public Cuenta inicioSecion(String correo, String clave){
        Cuenta c= buscarCuenta(correo);
            c= (c!=null&& c.getClave().equals(clave) && c.getEstado())? c:null;
        return c;
    
    }
    
}
