package com.mycompany.proyectoormjoelcoutolugo.utils;

import com.mycompany.proyectoormjoelcoutolugo.entidades.Piloto;
import com.mycompany.proyectoormjoelcoutolugo.entidades.Vuelo;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class VueloDAO {

    private final SessionFactory sessionFactory;

    public VueloDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Vuelo> obtenerTodos() {
        try (Session session = sessionFactory.openSession()) {
            // Se crea una consulta HQL para seleccionar todos los aviones
            String hql = "FROM Vuelo";
            Query<Vuelo> query = session.createQuery(hql, Vuelo.class);

            // Se ejecuta la consulta y se devuelve la lista de aviones
            return query.list();
        }
    }

    public void eliminarVueloPorId(Long idVuelo) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;

            try {
                transaction = session.beginTransaction();
                Vuelo vuelo = session.get(Vuelo.class, idVuelo);

                if (vuelo != null) {
                    session.remove(vuelo);
                    mostrarMensaje("Vuelo eliminado correctamente");
                } else {
                    mostrarMensaje("No se encontró un vuelo con ID: " + idVuelo);
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
