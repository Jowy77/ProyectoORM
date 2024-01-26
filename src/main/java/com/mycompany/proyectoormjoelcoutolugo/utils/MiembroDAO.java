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
    
    public List<Miembro> obtenerMiembrosSinVueloAsignado() {
        try (Session session = sessionFactory.openSession()) {
            // Utilizamos HQL para la consulta
            String hql = "FROM Miembro m WHERE m.id_miembro NOT IN (SELECT DISTINCT v.miembro.id_miembro FROM Vuelo v WHERE v.miembro.id_miembro IS NOT NULL)";
            Query<Miembro> query = session.createQuery(hql, Miembro.class);

            // Ejecutamos la consulta y devolvemos los resultados
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void actualizarMiembro(Miembro miembro) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // Verificar si el miembro ya existe en la base de datos
            if (miembro.getId_miembro() != null) {
                // Actualizar el miembro

                session.merge(miembro);

                transaction.commit();
                System.out.println("Miembro actualizado con éxito");
            } else {
                System.out.println("El miembro no tiene un ID asignado. Inserta el miembro primero.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Miembro obtenerMiembroPorId(Long idMiembro) {
        try (Session session = sessionFactory.openSession()) {
            // Utilizar HQL para obtener el Miembro por su ID
            String hql = "FROM Miembro WHERE id_miembro = :id";
            return session.createQuery(hql, Miembro.class)
                    .setParameter("id", idMiembro)
                    .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            mostrarMensaje("MIEMBRO DE TRIPULACION NO ENCONTRADO");
            return null;
        }
    }

    // Método para obtener una lista de IDs de miembros usando HQL
    public List<Long> obtenerIdsMiembros() {
        try (Session session = sessionFactory.openSession()) {
            // Utilizar HQL para obtener los IDs de los miembros
            String hql = "SELECT id_miembro FROM Miembro";
            return session.createQuery(hql, Long.class).getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
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

    public void insertarMiembro(Miembro miembro) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = null;

            try {
                transaction = session.beginTransaction();

                // Guardar el miembro en la base de datos
                session.persist(miembro);

                transaction.commit();
                mostrarMensaje("Miembro insertado correctamente con ID: " + miembro.getId_miembro());
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                    mostrarMensaje("LA TRANSACCION NO SE HA PODIDO COMPLETAR");
                }
                e.printStackTrace();
            }
        }
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
