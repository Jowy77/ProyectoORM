package com.mycompany.proyectoormjoelcoutolugo.utils;

import com.mycompany.proyectoormjoelcoutolugo.entidades.Miembro;
import com.mycompany.proyectoormjoelcoutolugo.entidades.Piloto;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class PilotoDAO {

    private final SessionFactory sessionFactory;

    public PilotoDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Piloto> obtenerTodos() {
        try (Session session = sessionFactory.openSession()) {
            // Se crea una consulta HQL para seleccionar todos los aviones
            String hql = "FROM Piloto";
            Query<Piloto> query = session.createQuery(hql, Piloto.class);

            // Se ejecuta la consulta y se devuelve la lista de aviones
            return query.list();
        }
    }
    
    public void eliminarPilotoPorId(Long idPiloto) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;

            try {
                transaction = session.beginTransaction();

                // Carga el avión que se va a eliminar
                Piloto piloto = session.get(Piloto.class, idPiloto);

                if (piloto != null) {
                    session.remove(piloto);
                    mostrarMensaje("Piloto eliminado correctamente");
                } else {
                    mostrarMensaje("No se encontró un piloto con ID: " + idPiloto);
                }

                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        }
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
