/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.daos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import lista.controlador.Lista;

/**
 *
 * @author omara
 */
public class AdapatadoDao <T> implements InterfazDao<T>{

    private Class<T> clazz; 
    private String carpeta="datos" + File.separatorChar ;
    private Lista<T> lista=new Lista<>();

    public AdapatadoDao(Class<T> clazz) {
        this.clazz = clazz;
        carpeta+=this.clazz.getSimpleName().toLowerCase()+"datos";
        lista.setClazz(clazz);
    }
    
    
    @Override
    public boolean guardar(T dato) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(carpeta));
            Lista aux =listar();
            aux.insertarNodo(dato);
            oos.writeObject(aux);
            oos.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
         return false;
    }

    @Override
    public boolean modificar(T dato, int pos) {
       
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(carpeta));
            Lista aux =listar();
            aux.modificarPorPos(dato, pos);
            oos.writeObject(aux);
            oos.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
        return false;
    }

    @Override
    public Lista<T> listar() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(carpeta));
            lista = (Lista<T>)ois.readObject();
            ois.close();

        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }
        return lista;
        
    }

    @Override
    public T buscarId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
