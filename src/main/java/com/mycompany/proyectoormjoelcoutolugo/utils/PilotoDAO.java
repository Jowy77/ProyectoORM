package com.mycompany.proyectoormjoelcoutolugo.utils;

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

    public List<Piloto> obtenerPilotosOrdenadosPorHorasDeVueloDescendente() {
        try (Session session = sessionFactory.openSession()) {
            // Utilizamos HQL para obtener los pilotos ordenados por horas de vuelo descendente
            String hql = "FROM Piloto p ORDER BY p.horasDeVuelo DESC";
            Query<Piloto> query = session.createQuery(hql, Piloto.class);

            // Ejecutamos la consulta y devolvemos la lista de pilotos
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void actualizarPiloto(Piloto piloto) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // Verificar si el piloto ya existe en la base de datos
            if (piloto.getId_piloto() != null) {
                // Actualizar el piloto
                session.merge(piloto);

                transaction.commit();
                System.out.println("Piloto actualizado con éxito");
            } else {
                System.out.println("El piloto no tiene un ID asignado. Inserta el piloto primero.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Long> obtenerIdsPilotos() {
        try (Session session = sessionFactory.openSession()) {
            // Utilizar HQL para obtener los IDs de los pilotos
            String hql = "SELECT id_piloto FROM Piloto";
            return session.createQuery(hql, Long.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Piloto obtenerPilotoPorId(Long idPiloto) {
        try (Session session = sessionFactory.openSession()) {
            // Utilizar HQL para obtener el Piloto por su ID
            String hql = "FROM Piloto WHERE id_piloto = :id";
            return session.createQuery(hql, Piloto.class)
                    .setParameter("id", idPiloto)
                    .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            mostrarMensaje("PILOTO NO ENCONTRADO");
            return null;
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

    public void insertarPiloto(Piloto piloto) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;

            try {
                transaction = session.beginTransaction();

                // Guardar el piloto en la base de datos
                session.persist(piloto);

                transaction.commit();
                mostrarMensaje("Piloto insertado correctamente con ID: " + piloto.getId_piloto());
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                    mostrarMensaje("LA TRANSACCION NO HA PODIDO COMPLETARSE");
                }
                e.printStackTrace();
            }
        }
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
