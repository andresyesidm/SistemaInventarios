/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author andresyesid
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    private final int ancho;
    private final int alto;
    private Date fechaActual = new Date();
    
    //Formateando la fecha:
    //DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
          
    public Administrador() {
        initComponents();
        ancho= Toolkit.getDefaultToolkit().getScreenSize().width;
        alto=Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.Fecha.setText("Fecha: "+formatoFecha.format(fechaActual));
    }
    
    public Administrador(String usuarioin) {
        initComponents();
        ancho= Toolkit.getDefaultToolkit().getScreenSize().width;
        alto=Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Usuario.setText(usuarioin);
        this.Fecha.setText("Fecha: "+formatoFecha.format(fechaActual));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BAdminUsuarios = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BAdminProveedor = new javax.swing.JLabel();
        BAdminClientes = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BInventarios = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        BCompras = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        BVentas = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        BCotizaciones = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        BReportes = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        BSalir = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Fecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Inventarios");
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BAdminUsuarios.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BAdminUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BAdminUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisica/Administrar Usuarios.png"))); // NOI18N
        BAdminUsuarios.setText("<html>Administrar Usuarios</html>");
        BAdminUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BAdminUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BAdminUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BAdminUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BAdminUsuariosMouseClicked(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BAdminProveedor.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BAdminProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BAdminProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisica/Administrar Proveedores.png"))); // NOI18N
        BAdminProveedor.setText("<html>Administrar Proveedores</html>");
        BAdminProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BAdminProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BAdminProveedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BAdminProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BAdminProveedorMouseClicked(evt);
            }
        });

        BAdminClientes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BAdminClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BAdminClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisica/Administrar Usuarios.png"))); // NOI18N
        BAdminClientes.setText("<html>Administrar Clientes</html>");
        BAdminClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BAdminClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BAdminClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BAdminClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BAdminClientesMouseClicked(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BInventarios.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BInventarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisica/Inventarios.png"))); // NOI18N
        BInventarios.setText("<html><br>Inventarios<br></html>");
        BInventarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BInventarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BInventarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BCompras.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisica/Compras.png"))); // NOI18N
        BCompras.setText("<html><br>Compras</html>");
        BCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BCompras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BVentas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisica/Ventas.png"))); // NOI18N
        BVentas.setText("<html><br>Ventas</html>");
        BVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BCotizaciones.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BCotizaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisica/Cotizaciones.png"))); // NOI18N
        BCotizaciones.setText("<html><br>Cotizaciones</html>");
        BCotizaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BCotizaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BCotizaciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BReportes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisica/Reportes.png"))); // NOI18N
        BReportes.setText("<html><br>Reportes</html>");
        BReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BReportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BSalir.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        BSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fisica/Salida.png"))); // NOI18N
        BSalir.setText("<html><br>Cerrar Sesion</html>");
        BSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BSalirMouseClicked(evt);
            }
        });

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Fecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Bienvenido, ");

        Usuario.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        Usuario.setText("---------");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BAdminUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BAdminProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BAdminClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BInventarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BCotizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Usuario)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(BCompras)
            .addComponent(jSeparator5)
            .addComponent(BVentas)
            .addComponent(jSeparator6)
            .addComponent(BCotizaciones)
            .addComponent(jSeparator7)
            .addComponent(BReportes)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BAdminUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BAdminProveedor, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BAdminClientes, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator3)
                        .addComponent(BInventarios)
                        .addComponent(jSeparator4)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator8)
            .addComponent(BSalir, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Usuario))
                .addContainerGap())
        );

        jPanel2.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BSalirMouseClicked
        new Autenticacion().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BSalirMouseClicked

    private void BAdminUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAdminUsuariosMouseClicked
        jPanel2.removeAll();
        AdministrarUsuarios adminU= new AdministrarUsuarios();
        jPanel2.add(adminU);
        adminU.setVisible(true);
        adminU.setSize(jPanel2.getSize());
        adminU.updateUI();
    }//GEN-LAST:event_BAdminUsuariosMouseClicked

    private void BAdminProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAdminProveedorMouseClicked
        jPanel2.removeAll();
        AdministrarProveedores adminP= new AdministrarProveedores();
        jPanel2.add(adminP);
        adminP.setVisible(true);
        adminP.setSize(jPanel2.getSize());
        adminP.updateUI();
    }//GEN-LAST:event_BAdminProveedorMouseClicked

    private void BAdminClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAdminClientesMouseClicked
        jPanel2.removeAll();
        AdministrarClientes adminC= new AdministrarClientes();
        jPanel2.add(adminC);
        adminC.setVisible(true);
        adminC.setSize(jPanel2.getSize());
        adminC.updateUI();
    }//GEN-LAST:event_BAdminClientesMouseClicked

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
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BAdminClientes;
    private javax.swing.JLabel BAdminProveedor;
    private javax.swing.JLabel BAdminUsuarios;
    private javax.swing.JLabel BCompras;
    private javax.swing.JLabel BCotizaciones;
    private javax.swing.JLabel BInventarios;
    private javax.swing.JLabel BReportes;
    private javax.swing.JLabel BSalir;
    private javax.swing.JLabel BVentas;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
