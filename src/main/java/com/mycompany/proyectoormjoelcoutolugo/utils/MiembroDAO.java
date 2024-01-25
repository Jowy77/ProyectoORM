package com.mycompany.proyectoormjoelcoutolugo.utils;

import com.mycompany.proyectoormjoelcoutolugo.entidades.Miembro;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class MiembroDAO {

    private final SessionFactory sessionFactory;

    public MiembroDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Miembro> obtenerTodos() {
        try (Session session = sessionFactory.openSession()) {
            // Se crea una consulta HQL para seleccionar todos los aviones
            String hql = "FROM Miembro";
            Query<Miembro> query = session.createQuery(hql, Miembro.class);

            // Se ejecuta la consulta y se devuelve la lista de aviones
            return query.list();
        }
    }

    public void eliminarMiembroPorId(Long idMiembro) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;

            try {
                transaction = session.beginTransaction();

                // Carga el avión que se va a eliminar
                Miembro miembro = session.get(Miembro.class, idMiembro);

                if (miembro != null) {
                    session.remove(miembro);
                    mostrarMensaje("Miembro de tripulacion eliminado correctamente");
                } else {
                    mostrarMensaje("No se encontró un miembro con ID: " + idMiembro);
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
