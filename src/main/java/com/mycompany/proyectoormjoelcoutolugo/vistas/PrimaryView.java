package com.mycompany.proyectoormjoelcoutolugo.vistas;

import com.mycompany.proyectoormjoelcoutolugo.entidades.Avion;
import com.mycompany.proyectoormjoelcoutolugo.entidades.Miembro;
import com.mycompany.proyectoormjoelcoutolugo.entidades.Piloto;
import com.mycompany.proyectoormjoelcoutolugo.entidades.Vuelo;
import com.mycompany.proyectoormjoelcoutolugo.utils.AvionDAO;
import com.mycompany.proyectoormjoelcoutolugo.utils.HibernateUtil;
import com.mycompany.proyectoormjoelcoutolugo.utils.MiembroDAO;
import com.mycompany.proyectoormjoelcoutolugo.utils.PilotoDAO;
import com.mycompany.proyectoormjoelcoutolugo.utils.VueloDAO;
import com.mycompany.proyectoormjoelcoutolugo.vistas.vistasEliminar.EliminarAvion;
import com.mycompany.proyectoormjoelcoutolugo.vistas.vistasEliminar.EliminarMiembroView;
import com.mycompany.proyectoormjoelcoutolugo.vistas.vistasEliminar.EliminarPilotoView;
import com.mycompany.proyectoormjoelcoutolugo.vistas.vistasEliminar.EliminarVuelo;
import com.mycompany.proyectoormjoelcoutolugo.vistas.vistasInsertar.InsertarAvionView;
import com.mycompany.proyectoormjoelcoutolugo.vistas.vistasInsertar.InsertarMiembroView;
import com.mycompany.proyectoormjoelcoutolugo.vistas.vistasInsertar.InsertarPilotoView;
import com.mycompany.proyectoormjoelcoutolugo.vistas.vistasInsertar.InsertarVueloView;
import com.mycompany.proyectoormjoelcoutolugo.vistasActualizar.ActualizarAvionView;
import com.mycompany.proyectoormjoelcoutolugo.vistasActualizar.ActualizarMiembroView;
import com.mycompany.proyectoormjoelcoutolugo.vistasActualizar.ActualizarPilotoView;
import com.mycompany.proyectoormjoelcoutolugo.vistasActualizar.ActualizarVueloView;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PrimaryView extends javax.swing.JFrame {
    
    HibernateUtil hUtil = new HibernateUtil();
    AvionDAO avionDao;
    MiembroDAO miembroDao;
    PilotoDAO pilotoDao;
    VueloDAO vueloDao;
    
    public PrimaryView() {
        avionDao = new AvionDAO(hUtil.getSessionFactory());
        miembroDao = new MiembroDAO(hUtil.getSessionFactory());
        pilotoDao = new PilotoDAO(hUtil.getSessionFactory());
        vueloDao = new VueloDAO(hUtil.getSessionFactory());
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

        jMenu6 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        jMenu6.setText("jMenu6");

        jMenuItem17.setText("jMenuItem17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaConsultas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 153, 0), new java.awt.Color(153, 102, 255), new java.awt.Color(51, 51, 0), new java.awt.Color(255, 51, 255)));
        tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaConsultas);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apps-preferences-system-time-icon (1).png"))); // NOI18N

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));
        jMenuBar1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMenuBar1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jMenu1.setText("Consultas");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Consultar miembros de la tripulacion");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Consultar pilotos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Consultar vuelos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Consultar aviones");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenu2.setText("Consultas Extras");

        jMenuItem18.setText("Miembros sin vuelo asignado");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem18);

        jMenuItem19.setText("Numero de aviones en BBDD");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem19);

        jMenuItem20.setText("Pilotos ordenados por horas de vuelo");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem20);

        jMenuItem21.setText("Consultar vuelos detallado");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem21);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Insertar");

        jMenuItem1.setText("Insertar piloto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem6.setText("Insertar miembro de tripulacion");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Insertar vuelo");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Insertar avion");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Eliminar");

        jMenuItem9.setText("Eliminar avion");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Eliminar miembro de la tripulacion");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Eliminar piloto");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Eliminar vuelo");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Actualizar");

        jMenuItem13.setText("Actualizar avion");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuItem14.setText("Actualizar miembro de trippulacion");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem15.setText("Actualizar piloto");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenuItem16.setText("Actualizar vuelo");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem16);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel2)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuBar1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMenuBar1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBar1AncestorAdded

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        List<Vuelo> listaVuelos = vueloDao.obtenerTodos();
        //"ID", "Número de Vuelo", "Origen", "Destino", "Hora de Salida", "Fecha de Vuelo"

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Código_Vuelo");
        tableModel.addColumn("Origen");
        tableModel.addColumn("Destino");
        tableModel.addColumn("Hora_Salida");
        tableModel.addColumn("Fecha_vuelo");
        
        listaVuelos.forEach(e -> {
            tableModel.addRow(new Object[]{e.getId_vuelo(), e.getNumeroDeVuelo(), e.getOrigen(), e.getDestino(), e.getHoraSalida(), e.getFechaVuelo()});
        });
        
        tablaConsultas.setModel(tableModel);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //INSERTAR PILOTO
        InsertarPilotoView insertarPilotoView = new InsertarPilotoView();
        insertarPilotoView.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked

    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //CONSULTAR MIEMBROS
        List<Miembro> listaMiembros = miembroDao.obtenerTodos();

        //super(new Object[]{"ID", "Código", "Nombre"}, 0);
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Código");
        tableModel.addColumn("Nombre_Piloto");
        
        for (Miembro miembro : listaMiembros) {
            tableModel.addRow(new Object[]{miembro.getId_miembro(), miembro.getCodigo(), miembro.getNombre()});
        }
        
        tablaConsultas.setModel(tableModel);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        List<Avion> listaAviones = avionDao.obtenerTodos();
        
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Código");
        tableModel.addColumn("Tipo");
        
        for (Avion avion : listaAviones) {
            tableModel.addRow(new Object[]{avion.getId_avion(), avion.getCodigo(), avion.getTipo()});
        }
        
        tablaConsultas.setModel(tableModel);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        List<Piloto> listaPilotos = pilotoDao.obtenerTodos();
        //"ID", "Código", "Nombre", "Horas de Vuelo"

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Código");
        tableModel.addColumn("Nombre_Piloto");
        tableModel.addColumn("Horas_De_Vuelo");
        
        listaPilotos.forEach(e -> {
            tableModel.addRow(new Object[]{e.getId_piloto(), e.getCodigo(), e.getNombre(), e.getHorasDeVuelo()});
        });
        
        tablaConsultas.setModel(tableModel);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        EliminarAvion borradoAvionView = new EliminarAvion();
        borradoAvionView.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        //ELMINAR MIEMBRO
        
        EliminarMiembroView eliminarMiembroView = new EliminarMiembroView();
        eliminarMiembroView.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        //ELIMINAR PILOTO
        
        EliminarPilotoView eliminarPilotoView = new EliminarPilotoView();
        eliminarPilotoView.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        EliminarVuelo elimirnarVueloView = new EliminarVuelo();
        elimirnarVueloView.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //INSERTAR MIEMBRO
        InsertarMiembroView insertarMiembroView = new InsertarMiembroView();
        insertarMiembroView.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        //INSERTAR VUELO
        InsertarVueloView insertarVueloView = new InsertarVueloView();
        insertarVueloView.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        //INSERTAR AVION
        InsertarAvionView insertarAvionView = new InsertarAvionView();
        insertarAvionView.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        ActualizarAvionView actualizarAvionView = new ActualizarAvionView();
        actualizarAvionView.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        ActualizarMiembroView actualizarMiembroView = new ActualizarMiembroView();
        actualizarMiembroView.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        ActualizarPilotoView actualizarPilotoView = new ActualizarPilotoView();
        actualizarPilotoView.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        ActualizarVueloView actualizarVueloView = new ActualizarVueloView();
        actualizarVueloView.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        //CONSULTA MIEMBROS SIN VUELO ASIGNADO
        
        List<Miembro> listaMiembrosSinVuelo = miembroDao.obtenerMiembrosSinVueloAsignado();
       
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Código");
        tableModel.addColumn("Nombre_Miembro");
        
        listaMiembrosSinVuelo.forEach(e -> {
            tableModel.addRow(new Object[]{e.getId_miembro(), e.getCodigo(), e.getNombre()});
        });
        
        tablaConsultas.setModel(tableModel);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("NUMERO DE AVIONES");
        tableModel.addRow(new Object[]{avionDao.obtenerNumeroAvionesDisponibles()});
       
        tablaConsultas.setModel(tableModel);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        //PILOTOS ORDENADOS POR HORAS DE VUELO
        List<Piloto> listaPilotos = pilotoDao.obtenerPilotosOrdenadosPorHorasDeVueloDescendente();
        //"ID", "Código", "Nombre", "Horas de Vuelo"

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Código");
        tableModel.addColumn("Nombre_Piloto");
        tableModel.addColumn("Horas_De_Vuelo");
        
        listaPilotos.forEach(e -> {
            tableModel.addRow(new Object[]{e.getId_piloto(), e.getCodigo(), e.getNombre(), e.getHorasDeVuelo()});
        });
        
        tablaConsultas.setModel(tableModel);
        
    }//GEN-LAST:event_jMenuItem20ActionPerformed
   /* SELECT v.numeroDeVuelo, v.fechaVuelo, v.origen, v.destino, a.codigo AS codigoAvion, p.nombre AS nombrePiloto, m.nombre AS nombreMiembro " +
                         "FROM Vuelo v " +
                         "INNER JOIN Avion a ON v.avion.id_avion = a.id_avion " +
                         "INNER JOIN Piloto p ON v.piloto.id_piloto = p.id_piloto " +
                         "LEFT JOIN Miembro m ON v.miembro.id_miembro = m.id_miembro";*/
    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        //CONSULTAR VUELOS DETATALLADO
        
         List<Object[]> listaVuelos = vueloDao.obtenerInformacionVuelosConDetalles();
        //"ID", "Número de Vuelo", "Origen", "Destino", "Hora de Salida", "Fecha de Vuelo"
        
        
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Código_Vuelo");
        tableModel.addColumn("Fecha de vuelo");
        tableModel.addColumn("Origen");
        tableModel.addColumn("Destino");
        tableModel.addColumn("Codigo del avion");
        tableModel.addColumn("Nombre del piloto");
        tableModel.addColumn("Nombre del miembro");
        
        for (Object[] datos : listaVuelos){
            tableModel.addRow(datos);
        }
        
        tablaConsultas.setModel(tableModel);
        
    }//GEN-LAST:event_jMenuItem21ActionPerformed
    
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
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
            java.util.logging.Logger.getLogger(PrimaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrimaryView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaConsultas;
    // End of variables declaration//GEN-END:variables
}
