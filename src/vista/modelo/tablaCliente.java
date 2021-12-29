/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modelo;

import javax.swing.table.AbstractTableModel;
import lista.controlador.Lista;
import modelo.Cliente;

/**
 *
 * @author omara
 */
public class tablaCliente extends AbstractTableModel {
     private Lista<Cliente> lista= new Lista();

    public Lista<Cliente> getLista() {
        return lista;
    }

    public void setLista(Lista<Cliente> lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public int getRowCount() {
        return lista.tamanio();
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Nro";
            case 1: return "Cliente";
            case 2: return "Cédula";
            case 3: return "Tipo de documento";
            case 4: return "Correo";
            case 5: return "Dirección";
            case 6: return "Descuento";
            default: return null;
           
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente p= lista.consultarDatoPosicion(rowIndex);
        switch(columnIndex){
            case 0: return rowIndex+1;
            case 1: return p.getNombre();
            case 2: return p.getCedula();
            case 3: return p.getTipoDocumento();
            case 4: return p.getCorreo();
            case 5: return p.getDireccion();
            case 6: return String.valueOf(p.getDescuento());
            default: return null;
           
        }
    }
}
