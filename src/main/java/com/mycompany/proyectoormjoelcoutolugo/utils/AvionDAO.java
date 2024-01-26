package com.mycompany.proyectoormjoelcoutolugo.utils;

import com.mycompany.proyectoormjoelcoutolugo.entidades.Avion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class AvionDAO {

    private final SessionFactory sessionFactory;

    // Constructor que recibe la SessionFactory (debe ser inyectado por Spring o similar)
    public AvionDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // Método para obtener todos los aviones utilizando SQL nativo
    public List<Avion> obtenerTodos() {
        try (Session session = sessionFactory.openSession()) {
            // Se crea una consulta HQL para seleccionar todos los aviones
            String hql = "FROM Avion";
            Query<Avion> query = session.createQuery(hql, Avion.class);

            // Se ejecuta la consulta y se devuelve la lista de aviones
            return query.list();
        }
    }
    
    public Long obtenerNumeroAvionesDisponibles() {
        try (Session session = sessionFactory.openSession()) {
            // Utilizamos HQL para contar los aviones disponibles
            String hql = "SELECT COUNT(*) FROM Avion a";
            Query<Long> query = session.createQuery(hql, Long.class);

            // Ejecutamos la consulta y devolvemos el resultado
            return query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void actualizarAvion(Avion avion) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // Verificar si el avión ya existe en la base de datos
            if (avion.getId_avion() != null) {
                // Actualizar el avión
                session.merge(avion);
                transaction.commit();
                System.out.println("Avión actualizado con éxito.");
            } else {
                System.out.println("El avión no tiene un ID asignado. Inserta el avión primero.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Avion obtenerAvionPorId(Long idAvion) {
        try (Session session = sessionFactory.openSession()) {
            // Utilizar HQL para obtener el Avión por su ID
            String hql = "FROM Avion WHERE id_avion = :id";
            return session.createQuery(hql, Avion.class)
                    .setParameter("id", idAvion)
                    .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            mostrarMensaje("AVION NO ENCONTRADO");
            return null;
        }
    }

    public List<Long> obtenerIdsAviones() {
        try (Session session = sessionFactory.openSession()) {
            // Utilizar HQL para obtener los IDs de los aviones
            String hql = "SELECT id_avion FROM Avion";
            return session.createQuery(hql, Long.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void eliminarAvionPorId(Long idAvion) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;

            try {
                transaction = session.beginTransaction();

                // Carga el avión que se va a eliminar
                Avion avion = session.get(Avion.class, idAvion);

                if (avion != null) {
                    session.remove(avion);
                    mostrarMensaje("Avión eliminado correctamente");
                } else {
                    mostrarMensaje("No se encontró un avión con ID: " + idAvion);
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

    public void insertarAvion(Avion avion) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;

            try {
                transaction = session.beginTransaction();

                // Guardar el avión en la base de datos
                session.persist(avion);

                transaction.commit();
                mostrarMensaje("Avión insertado correctamente con ID: " + avion.getId_avion());
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                    mostrarMensaje("SE HA CANCELADO LA TRANSACCION");
                }
                e.printStackTrace();
            }
        }
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
