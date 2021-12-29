/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.daos;

import lista.controlador.Lista;
import modelo.Producto;

/**
 *
 * @author omara
 */
public class ProductoDao extends AdapatadoDao<Producto>{
    private Producto producto; 

    public ProductoDao() {
        super(Producto.class);
        
    }

    public Producto getProducto() {
        if(producto == null)
            producto = new Producto();
        
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public boolean guardar(){
        producto.setId(new Long (listar().tamanio()+1));
        return guardar(producto);
    }
    public Lista<Producto> buscarString(String dato){
        Lista<Producto> lista = new Lista<>();
        Lista<Producto> aux = listar();
        
        for (int i = 0; i < aux.tamanio(); i++) {
            Producto p = aux.consultarDatoPosicion(i);
            Boolean band= p.getNombre().toLowerCase().contains(dato.toLowerCase());
            if(band){
                lista.insertarNodo(p);
            }
        }
        return lista;
    }
    
     public Lista<Producto> buscarCodigo(String dato){
        Lista<Producto> lista = new Lista<>();
        Lista<Producto> aux = listar();
        
        for (int i = 0; i < aux.tamanio(); i++) {
            Producto p = aux.consultarDatoPosicion(i);
            Boolean band= p.getCodigo().contains(dato.toLowerCase());
            if(band){
                lista.insertarNodo(p);
            }
        }
        return lista;
    }
    
    
}
