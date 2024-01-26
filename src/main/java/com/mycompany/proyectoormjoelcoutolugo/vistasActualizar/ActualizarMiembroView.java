package com.mycompany.proyectoormjoelcoutolugo.vistasActualizar;

import com.mycompany.proyectoormjoelcoutolugo.entidades.Miembro;
import com.mycompany.proyectoormjoelcoutolugo.utils.HibernateUtil;
import com.mycompany.proyectoormjoelcoutolugo.utils.MiembroDAO;
import static com.mycompany.proyectoormjoelcoutolugo.vistasActualizar.ActualizarAvionView.esNoNuloNoVacio;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActualizarMiembroView extends javax.swing.JFrame {

    HibernateUtil hUtil = new HibernateUtil();
    MiembroDAO miembroDAO;
    Miembro miembroActualizar;

    public ActualizarMiembroView() {
        initComponents();
        miembroDAO = new MiembroDAO(hUtil.getSessionFactory());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idMiembroTextField = new javax.swing.JTextField();
        buscarMiembroButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigoMiembroTextField = new javax.swing.JTextField();
        nombreMiembroTextField = new javax.swing.JTextField();
        actualizarMiembroButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Actualizar Miembro de tripulacion");

        jLabel2.setText("Id del miembro de tripulacion");

        idMiembroTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        buscarMiembroButton.setText("Buscar miembro");
        buscarMiembroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarMiembroButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo del miembro");

        jLabel4.setText("Nombre");

        codigoMiembroTextField.setEnabled(false);

        nombreMiembroTextField.setEnabled(false);

        actualizarMiembroButton.setText("Actualizar");
        actualizarMiembroButton.setEnabled(false);
        actualizarMiembroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarMiembroButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(idMiembroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buscarMiembroButton)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(50, 50, 50)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigoMiembroTextField)
                            .addComponent(nombreMiembroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(actualizarMiembroButton)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idMiembroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarMiembroButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codigoMiembroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombreMiembroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(actualizarMiembroButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarMiembroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarMiembroButtonActionPerformed
        String codigoMiembro = codigoMiembroTextField.getText();
        String nombreMiembro = nombreMiembroTextField.getText();
        
        if (!esNoNuloNoVacio(codigoMiembro)) {
            mostrarMensaje("EL CODIGO NO PUEDE ESTAR VACIO");
        } else if (!esNoNuloNoVacio(nombreMiembro)) {
            mostrarMensaje("EL NOMBRE NO PUEDE ESTAR VACIO");
        } else {
            miembroActualizar.setCodigo(codigoMiembro);
            miembroActualizar.setNombre(nombreMiembro);
            
            miembroDAO.actualizarMiembro(miembroActualizar);
            mostrarMensaje("MIEMBRO ACTUALIZADO");
            this.setVisible(false);
        }
    }//GEN-LAST:event_actualizarMiembroButtonActionPerformed

    private void buscarMiembroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarMiembroButtonActionPerformed
        String idMiembroActualizar = idMiembroTextField.getText();
        
        if (!esNoNuloNoVacio(idMiembroActualizar)) {
            mostrarMensaje("EL ID NO PUEDE ESTAR VACIO");
        } else if (!esNumero(idMiembroActualizar)) {
            mostrarMensaje("EL ID NO PUEDE TENER LETRAS");
        } else {
            miembroActualizar = miembroDAO.obtenerMiembroPorId(Long.parseLong(idMiembroActualizar));
            
            if(miembroActualizar == null){
                mostrarMensaje("NO SE HA ENCONTRADO NINGUN MIEMBRO CON ESE ID");
            }else{
                codigoMiembroTextField.setEnabled(true);
                nombreMiembroTextField.setEnabled(true);
                actualizarMiembroButton.setEnabled(true);
                buscarMiembroButton.setEnabled(false);
                
                codigoMiembroTextField.setText(miembroActualizar.getCodigo());
                nombreMiembroTextField.setText(miembroActualizar.getNombre());
            }

        }

    }//GEN-LAST:event_buscarMiembroButtonActionPerformed

    public boolean esNumero(String cadena) {
        try {
            // Intenta convertir la cadena a un número
            Long.parseLong(cadena);
            return true;
        } catch (NumberFormatException e) {
            // Si ocurre una excepción, la cadena no es un número
            return false;
        }
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static boolean esNoNuloNoVacio(String cadena) {
        return cadena != null && !cadena.isEmpty();
    }

    
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
            java.util.logging.Logger.getLogger(ActualizarMiembroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarMiembroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarMiembroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarMiembroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarMiembroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarMiembroButton;
    private javax.swing.JButton buscarMiembroButton;
    private javax.swing.JTextField codigoMiembroTextField;
    private javax.swing.JTextField idMiembroTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombreMiembroTextField;
    // End of variables declaration//GEN-END:variables
}