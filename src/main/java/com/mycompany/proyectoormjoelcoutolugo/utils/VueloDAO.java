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
    
    public void actualizarVuelo(Vuelo vuelo) {
        Transaction transaction = null;

        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            // Actualizamos el vuelo
            session.merge(vuelo);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public List<Object[]> obtenerInformacionVuelosConDetalles() {
        try (Session session = sessionFactory.openSession()) {
            // Utilizamos HQL para obtener la información de los vuelos con detalles
            String hql = "SELECT v.numeroDeVuelo, v.fechaVuelo, v.origen, v.destino, a.codigo AS codigoAvion, p.nombre AS nombrePiloto, m.nombre AS nombreMiembro " +
                         "FROM Vuelo v " +
                         "INNER JOIN Avion a ON v.avion.id_avion = a.id_avion " +
                         "INNER JOIN Piloto p ON v.piloto.id_piloto = p.id_piloto " +
                         "LEFT JOIN Miembro m ON v.miembro.id_miembro = m.id_miembro";
            Query<Object[]> query = session.createQuery(hql, Object[].class);

            // Ejecutamos la consulta y devolvemos la lista de resultados
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Vuelo obtenerVueloPorId(Long idVuelo) {
        try (Session session = sessionFactory.openSession()) {
            // Utilizar HQL para obtener el Vuelo por su ID
            String hql = "FROM Vuelo WHERE id_vuelo = :id";
            return session.createQuery(hql, Vuelo.class)
                    .setParameter("id", idVuelo)
                    .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
     public void insertarVuelo(Vuelo vuelo) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();

            // Guardar el vuelo en la base de datos
            session.persist(vuelo);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            mostrarMensaje("NO SE HA PODIDO INSERTAR EL VUELO");
            e.printStackTrace();
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
