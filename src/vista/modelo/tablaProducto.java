/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modelo;

import javax.swing.table.AbstractTableModel;
import lista.controlador.Lista;
import modelo.Producto;

/**
 *
 * @author omara
 */
public class tablaProducto extends AbstractTableModel {
     private Lista<Producto> lista= new Lista();

    public Lista<Producto> getLista() {
        return lista;
    }

    public void setLista(Lista<Producto> lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public int getRowCount() {
        return lista.tamanio();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Nro";
            case 1: return "Código";
            case 2: return "Nombre";
            case 3: return "Costo Neto";
            case 4: return "Iva";
            case 5: return "Costo con Iva";

            default: return null;
           
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto p= lista.consultarDatoPosicion(rowIndex);
        switch(columnIndex){
            case 0: return rowIndex+1;
            case 1: return p.getCodigo();
            case 2: return p.getNombre();
            case 3: return p.getPrecio();
            case 4: return p.getIva();
            case 5: return (p.getPrecio()+((p.getPrecio()/100)*p.getIva()));

            default: return null;
           
        }
    }
}
