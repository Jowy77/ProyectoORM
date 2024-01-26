package com.mycompany.proyectoormjoelcoutolugo.vistas.vistasInsertar;

import com.mycompany.proyectoormjoelcoutolugo.entidades.Avion;
import com.mycompany.proyectoormjoelcoutolugo.entidades.Miembro;
import com.mycompany.proyectoormjoelcoutolugo.entidades.Piloto;
import com.mycompany.proyectoormjoelcoutolugo.entidades.Vuelo;
import com.mycompany.proyectoormjoelcoutolugo.utils.AvionDAO;
import com.mycompany.proyectoormjoelcoutolugo.utils.HibernateUtil;
import com.mycompany.proyectoormjoelcoutolugo.utils.MiembroDAO;
import com.mycompany.proyectoormjoelcoutolugo.utils.PilotoDAO;
import com.mycompany.proyectoormjoelcoutolugo.utils.VueloDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InsertarVueloView extends javax.swing.JFrame {

    HibernateUtil hUtil = new HibernateUtil();
    VueloDAO vueloDAO;
    AvionDAO avionDAO;
    PilotoDAO pilotoDAO;
    MiembroDAO miembroDAO;

    public InsertarVueloView() {
        initComponents();
        vueloDAO = new VueloDAO(hUtil.getSessionFactory());
        avionDAO = new AvionDAO(hUtil.getSessionFactory());
        pilotoDAO = new PilotoDAO(hUtil.getSessionFactory());
        miembroDAO = new MiembroDAO(hUtil.getSessionFactory());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        List<Long> listaIdAviones = avionDAO.obtenerIdsAviones();

        listaIdAviones.forEach(avion -> {
            avionCombo.addItem(avion.toString());
        });
        //---------------------------------------------------------
        List<Long> listaIdPilotos = pilotoDAO.obtenerIdsPilotos();

        listaIdPilotos.forEach(piloto -> {
            pilotoCombo.addItem(piloto.toString());
        });
        //---------------------------------------------------------
        List<Long> listaIdMiembros = miembroDAO.obtenerIdsMiembros();

        listaIdMiembros.forEach(miembro -> {
            miembroCombo.addItem(miembro.toString());
        });
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigoVueloTextField = new javax.swing.JTextField();
        fechaVueloTextField = new javax.swing.JTextField();
        origenTextField = new javax.swing.JTextField();
        horaSalidaTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pilotoCombo = new javax.swing.JComboBox<>();
        miembroCombo = new javax.swing.JComboBox<>();
        avionCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        destinoTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero de Vuelo");

        jLabel2.setText("Fecha del vuelo");

        jLabel3.setText("Origen");

        jLabel4.setText("Codigo del avion");

        jLabel5.setText("Hora de salida");

        jLabel6.setText("Piloto del vuelo");

        jLabel7.setText("Miembro del vuelo");

        horaSalidaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaSalidaTextFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Insertar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pilotoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilotoComboActionPerformed(evt);
            }
        });

        miembroCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miembroComboActionPerformed(evt);
            }
        });

        jLabel8.setText("Destino");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("INSERTAR VUELO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addComponent(codigoVueloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(horaSalidaTextField)
                                .addComponent(miembroCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pilotoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(avionCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(destinoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fechaVueloTextField)
                                .addComponent(origenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigoVueloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaVueloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaSalidaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pilotoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(miembroCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void horaSalidaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaSalidaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaSalidaTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pilotoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilotoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pilotoComboActionPerformed

    private void miembroComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miembroComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miembroComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //insertar vuelo

        Vuelo vueloNuevo = new Vuelo();
        String origen = origenTextField.getText();
        String destino = destinoTextField.getText();
        String fechavuelo = fechaVueloTextField.getText();
        String numeroDeVuelo = codigoVueloTextField.getText();
        String horaDeSalida = horaSalidaTextField.getText();
        Piloto pilotoVuelo = pilotoDAO.obtenerPilotoPorId(Long.parseLong(pilotoCombo.getSelectedItem().toString()));
        Miembro miembroVuelo = miembroDAO.obtenerMiembroPorId(Long.parseLong(miembroCombo.getSelectedItem().toString()));
        Avion avionVuelo = avionDAO.obtenerAvionPorId(Long.parseLong(avionCombo.getSelectedItem().toString()));
        
        if(!esNoNuloNoVacio(numeroDeVuelo)){
            mostrarMensaje("EL CODIGO DE VUELO NO PUEDE ESTAR VACIO");
        }else if (!esNoNuloNoVacio(origen)) {
            mostrarMensaje("EL ORGIGEN NO PUEDE ESTAR VACIO");
            } else if (!esNoNuloNoVacio(destino)) {
                mostrarMensaje("EL DESTINO NO PUEDE ESTAR VACIO");
                } else if (!esNoNuloNoVacio(fechavuelo)) {
                    mostrarMensaje("LA FECHA NO PUEDE ESTAR VACIA");
                    } else if (!tieneFormatoFecha(fechavuelo)) {
                        mostrarMensaje("LA FECHA NO TIENE EL FORMATO CORRCTO (DD/MM/YYYY)");
                        } else if (!tieneFormatoReloj(horaDeSalida)) {
                            mostrarMensaje("LA HORA NO TIENE EL FORMATO CORRECTO (00:00)");
        } else {
            vueloNuevo.setOrigen(origen);
            vueloNuevo.setDestino(destino);
            vueloNuevo.setNumeroDeVuelo(numeroDeVuelo);
            vueloNuevo.setFecha(fechavuelo);
            vueloNuevo.setHoraSalida(horaDeSalida);
            vueloNuevo.setPiloto(pilotoVuelo);
            vueloNuevo.setMiembro(miembroVuelo);
            vueloNuevo.setAvion(avionVuelo);

            vueloDAO.insertarVuelo(vueloNuevo);
            mostrarMensaje("VUELO INSERTADO CON EXITO");
            this.setVisible(false);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public static boolean tieneFormatoFecha(String input) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        sdf.setLenient(false);
        try {
            Date fecha = sdf.parse(input);
            return true;
        } catch (ParseException e) {

            return false;
        }
    }

    public static boolean tieneFormatoReloj(String input) {
        Pattern pattern = Pattern.compile("([01]?[0-9]|2[0-3]):[0-5][0-9]");
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
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
            java.util.logging.Logger.getLogger(InsertarVueloView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarVueloView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarVueloView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarVueloView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarVueloView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> avionCombo;
    private javax.swing.JTextField codigoVueloTextField;
    private javax.swing.JTextField destinoTextField;
    private javax.swing.JTextField fechaVueloTextField;
    private javax.swing.JTextField horaSalidaTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> miembroCombo;
    private javax.swing.JTextField origenTextField;
    private javax.swing.JComboBox<String> pilotoCombo;
    // End of variables declaration//GEN-END:variables
}
