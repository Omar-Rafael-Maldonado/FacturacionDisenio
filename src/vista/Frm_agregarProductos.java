/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.daos.ProductoDao;
import javax.swing.JOptionPane;

/**
 *
 * @author compa
 */
public class Frm_agregarProductos extends javax.swing.JFrame {

    /**
     * Creates new form Frm_agregarProductos
     */
    private ProductoDao productodao= new ProductoDao();
    public Frm_agregarProductos() {
        initComponents();
    }
    
    private boolean validar(){
        return (txt_agreCodigoProducto.getText().trim().length()>0 &&
                txt_agreNombreProducto.getText().trim().length()>0 && 
                txt_agrePrecioProducto.getText().trim().length()>0 );
    } 
    
    private void limpiar(){
        txt_agreCodigoProducto.setText("");
        txt_agreNombreProducto.setText("");
        txt_agrePrecioProducto.setText("");
        cbx_agreIvaProducto.setSelectedItem(0);
        cbx_agreTipoProducto.setSelectedItem(0);
    }
    
    private void guardar(){
       
        if (validar()){
            //Tipo de producto
            if(cbx_agreTipoProducto.getSelectedIndex()==0){productodao.getProducto().setTipo("Bien");}
            else{
                productodao.getProducto().setTipo("Servicio");
            }
            //Resto de datos
            productodao.getProducto().setCodigo(txt_agreCodigoProducto.getText().trim());
            productodao.getProducto().setNombre(txt_agreNombreProducto.getText().trim());
            productodao.getProducto().setPrecio(Double.parseDouble(txt_agrePrecioProducto.getText().trim()));
            if(cbx_agreIvaProducto.getSelectedIndex()==0){productodao.getProducto().setIva(12.0);}
            else{
                productodao.getProducto().setIva(0.0);
            }
            
            
            
            if(productodao.guardar()){
              JOptionPane.showMessageDialog(null, "Guardado con ëxito", "Ok", JOptionPane.INFORMATION_MESSAGE);
              limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "No se puede guardar", "Error", JOptionPane.ERROR_MESSAGE);
        
            }
        } else{
            JOptionPane.showMessageDialog(null, "No se puede guardar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txt_agreCodigoProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_agreNombreProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbx_agreIvaProducto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbx_agreTipoProducto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txt_agrePrecioProducto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_guardarProducto = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_cancelarProducto = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btn_irFactura = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("PRODUCTOS");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("PRODUCTOS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("PRODUCTOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 110, 20));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Código:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, 10));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("AGREGAR PRODUCTOS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, 20));

        txt_agreCodigoProducto.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jPanel1.add(txt_agreCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tipo Producto:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, 20));

        txt_agreNombreProducto.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        jPanel1.add(txt_agreNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 150, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, 20));

        cbx_agreIvaProducto.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        cbx_agreIvaProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12%", "0%" }));
        jPanel1.add(cbx_agreIvaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 150, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("IVA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 110, 20));

        cbx_agreTipoProducto.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        cbx_agreTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bien", "Servicio" }));
        jPanel1.add(cbx_agreTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Precio:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, 20));

        txt_agrePrecioProducto.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        txt_agrePrecioProducto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txt_agrePrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setForeground(new java.awt.Color(0, 51, 255));

        btn_guardarProducto.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        btn_guardarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btn_guardarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_guardarProducto.setText("GUARDAR");
        btn_guardarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guardarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_guardarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_guardarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 120, 30));

        jPanel5.setBackground(new java.awt.Color(0, 102, 255));
        jPanel5.setForeground(new java.awt.Color(0, 51, 255));

        btn_cancelarProducto.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        btn_cancelarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelarProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cancelarProducto.setText("CANCELAR");
        btn_cancelarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelarProductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_cancelarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_cancelarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 102, 255));
        jPanel6.setForeground(new java.awt.Color(0, 51, 255));

        btn_irFactura.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        btn_irFactura.setForeground(new java.awt.Color(255, 255, 255));
        btn_irFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_irFactura.setText("FACTURAR");
        btn_irFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_irFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_irFacturaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_irFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_irFactura, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 300, 440);

        setSize(new java.awt.Dimension(316, 478));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_irFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_irFacturaMouseClicked
        // TODO add your handling code here:
        Frm_vistaFactura nuevaFactura = new Frm_vistaFactura();
        nuevaFactura.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_irFacturaMouseClicked

    private void btn_cancelarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarProductoMouseClicked
        // TODO add your handling code here:
        Frm_Productos nuevoProducto = new Frm_Productos();
        nuevoProducto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelarProductoMouseClicked

    private void btn_guardarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarProductoMouseClicked
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_btn_guardarProductoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_agregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_agregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_agregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_agregarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_agregarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cancelarProducto;
    private javax.swing.JLabel btn_guardarProducto;
    private javax.swing.JLabel btn_irFactura;
    private javax.swing.JComboBox<String> cbx_agreIvaProducto;
    private javax.swing.JComboBox<String> cbx_agreTipoProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_agreCodigoProducto;
    private javax.swing.JTextField txt_agreNombreProducto;
    private javax.swing.JTextField txt_agrePrecioProducto;
    // End of variables declaration//GEN-END:variables
}