/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestióndepersonal;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CFL 401
 */
public class testVentana extends javax.swing.JFrame {

    /**
     * Creates new form testVentana
     */
    public testVentana() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldCrearTablaC = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldID = new javax.swing.JTextField();
        fieldApellido = new javax.swing.JTextField();
        fieldNombre = new javax.swing.JTextField();
        informe = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldCrearTabla = new javax.swing.JTextField();
        fieldCrearColumnas = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        fieldIngresar = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnExiste = new javax.swing.JButton();
        btnConectar = new javax.swing.JButton();
        textoEstado = new javax.swing.JLabel();
        fieldActualizar = new javax.swing.JTextField();
        fieldExiste = new javax.swing.JTextField();
        fieldBorrar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldColumnas = new javax.swing.JTextField();
        fieldValores = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        fieldID.setEnabled(false);
        fieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIDActionPerformed(evt);
            }
        });

        fieldApellido.setEnabled(false);
        fieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldApellidoActionPerformed(evt);
            }
        });

        fieldNombre.setEnabled(false);
        fieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreActionPerformed(evt);
            }
        });

        informe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        informe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        informe.setText("Informe...");

        fieldCrearTabla.setEditable(false);
        fieldCrearTabla.setToolTipText("iygjyguyguyj");

        fieldCrearColumnas.setEditable(false);

        btnCrear.setText("Crear");
        btnCrear.setEnabled(false);
        btnCrear.setMaximumSize(new java.awt.Dimension(100, 40));
        btnCrear.setMinimumSize(new java.awt.Dimension(100, 40));
        btnCrear.setPreferredSize(new java.awt.Dimension(100, 40));
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCrearMouseClicked(evt);
            }
        });

        fieldIngresar.setEditable(false);

        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.setMaximumSize(new java.awt.Dimension(100, 40));
        btnActualizar.setMinimumSize(new java.awt.Dimension(100, 40));
        btnActualizar.setPreferredSize(new java.awt.Dimension(100, 40));

        btnBorrar.setText("Borrar");
        btnBorrar.setEnabled(false);
        btnBorrar.setMaximumSize(new java.awt.Dimension(100, 40));
        btnBorrar.setMinimumSize(new java.awt.Dimension(100, 40));
        btnBorrar.setPreferredSize(new java.awt.Dimension(100, 40));

        btnExiste.setText("Existe");
        btnExiste.setEnabled(false);
        btnExiste.setMaximumSize(new java.awt.Dimension(100, 40));
        btnExiste.setMinimumSize(new java.awt.Dimension(100, 40));
        btnExiste.setPreferredSize(new java.awt.Dimension(100, 40));

        btnConectar.setText("Conectar");
        btnConectar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConectarMouseClicked(evt);
            }
        });
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        textoEstado.setText("Desconectado");

        fieldActualizar.setEditable(false);

        fieldExiste.setEditable(false);

        fieldBorrar.setEditable(false);

        jLabel8.setText("Nombre de Tabla");

        jLabel9.setText("Nombre de Tabla");

        jLabel10.setText("Nombre de Tabla");

        jLabel11.setText("Nombre de Tabla");

        jLabel12.setText("Nombre de Tabla");

        jLabel6.setText("Columna y Valores");

        fieldColumnas.setEditable(false);

        fieldValores.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Interactue con las distintas funciones para contactar la Base de Datos");

        btnIngresar.setText("Ingresar");
        btnIngresar.setEnabled(false);
        btnIngresar.setMaximumSize(new java.awt.Dimension(100, 40));
        btnIngresar.setMinimumSize(new java.awt.Dimension(100, 40));
        btnIngresar.setPreferredSize(new java.awt.Dimension(100, 40));

        jLabel13.setText("ID que desee borrar");

        jLabel14.setText("Columnas");

        jLabel15.setText("Condiciones");

        javax.swing.GroupLayout fieldCrearTablaCLayout = new javax.swing.GroupLayout(fieldCrearTablaC);
        fieldCrearTablaC.setLayout(fieldCrearTablaCLayout);
        fieldCrearTablaCLayout.setHorizontalGroup(
            fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldCrearTablaCLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(informe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                        .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(36, 36, 36)
                                .addComponent(fieldIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(408, 408, 408))
                            .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(fieldCrearTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fieldCrearColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)))
                        .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(fieldActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(fieldColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(fieldValores, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                        .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                                .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(fieldExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(36, 36, 36)
                                        .addComponent(fieldBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(271, 271, 271)
                                .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnExiste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                        .addComponent(textoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConectar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fieldCrearTablaCLayout.setVerticalGroup(
            fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fieldCrearTablaCLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(informe)
                        .addGap(32, 32, 32)
                        .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldCrearTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCrearColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel6)
                            .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(fieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(fieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(fieldColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fieldBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldExiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fieldCrearTablaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConectar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldCrearTablaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldCrearTablaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreActionPerformed

    private void fieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldApellidoActionPerformed

    private void fieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldIDActionPerformed

    private void btnConectarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConectarMouseClicked
        
        if (btnConectar.getText().equals("Conectar") && GestionDePersonal.getConexionDB() == null) {
            
            DatosDeConexion datosDeConexion = new DatosDeConexion();
            setVisible(false);
            datosDeConexion.setVisible(true);
            
        } else if (btnConectar.getText().equals("Conectar") && GestionDePersonal.getConexionDB() != null) {
            System.out.println(GestionDePersonal.getConexionDB().conectarADB());
            Activar();
            btnConectar.setText("Desconectar");
            textoEstado.setText("Conectado");
        } else if (btnConectar.getText().equals("Desconectar")) {
            
            try {
                
                GestionDePersonal.getConexionDB().cerrarConex();
                Desactivar();
                btnConectar.setText("Conectar");
                textoEstado.setText("Desconectado");
            } catch (SQLException ex) {
                Logger.getLogger(testVentana.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        

    }//GEN-LAST:event_btnConectarMouseClicked

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        

    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseClicked
        
        String nombreTabla = fieldCrearTabla.getText();
        String columnas = fieldCrearColumnas.getText();
        
        try {
            GestionDePersonal.getConexionDB().crearTabla(nombreTabla, columnas);
            informe.setText("La columna: " + fieldCrearTabla.getText() + " Se creo correctamente");
        } catch (SQLException ex) {
            System.out.println("No se creó la tabla");
        }
        

    }//GEN-LAST:event_btnCrearMouseClicked

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
            java.util.logging.Logger.getLogger(testVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(testVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(testVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(testVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new testVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnExiste;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JTextField fieldActualizar;
    private javax.swing.JTextField fieldApellido;
    private javax.swing.JTextField fieldBorrar;
    private javax.swing.JTextField fieldColumnas;
    private javax.swing.JTextField fieldCrearColumnas;
    private javax.swing.JTextField fieldCrearTabla;
    private javax.swing.JPanel fieldCrearTablaC;
    private javax.swing.JTextField fieldExiste;
    private javax.swing.JTextField fieldID;
    private javax.swing.JTextField fieldIngresar;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JTextField fieldValores;
    private javax.swing.JLabel informe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel textoEstado;
    // End of variables declaration//GEN-END:variables

    public void Activar() {
        
        btnCrear.setEnabled(true);
        btnIngresar.setEnabled(true);
        btnExiste.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnActualizar.setEnabled(true);
        fieldIngresar.setEditable(true);
        fieldExiste.setEditable(true);
        fieldBorrar.setEditable(true);
        fieldActualizar.setEditable(true);
        fieldCrearTabla.setEditable(true);
        fieldCrearColumnas.setEditable(true);
        fieldNombre.setEditable(true);
        fieldApellido.setEditable(true);
        fieldID.setEditable(true);
        fieldNombre.setEnabled(true);
        fieldApellido.setEnabled(true);
        fieldID.setEnabled(true);
        fieldColumnas.setEditable(true);
        fieldValores.setEditable(true);
        btnConectar.setText("Desconectar");
        textoEstado.setText("Conectado");
        informe.setText("La conexion a la base de datos se realizo correctamente.");
        
    }
    
    public void Desactivar() {
        
        btnCrear.setEnabled(false);
        btnIngresar.setEnabled(false);
        btnExiste.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnActualizar.setEnabled(false);
        fieldIngresar.setEditable(false);
        fieldExiste.setEditable(false);
        fieldBorrar.setEditable(false);
        fieldActualizar.setEditable(false);
        fieldCrearTabla.setEditable(false);
        fieldCrearColumnas.setEditable(false);
        fieldNombre.setEditable(false);
        fieldApellido.setEditable(false);
        fieldID.setEditable(false);
        fieldColumnas.setEditable(false);
        fieldValores.setEditable(false);
        btnConectar.setText("Conectar");
        textoEstado.setText("Desconectado");
        informe.setText("La conexion con la base de dato se ah cerrado.");
    }
}
