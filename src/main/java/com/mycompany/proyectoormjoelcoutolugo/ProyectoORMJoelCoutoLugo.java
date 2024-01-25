package com.mycompany.proyectoormjoelcoutolugo;

import com.mycompany.proyectoormjoelcoutolugo.vistas.PrimaryView;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ProyectoORMJoelCoutoLugo {
    
    public static void main(String[] args) {

        /*final StandardServiceRegistry registro = new StandardServiceRegistryBuilder().configure().build();
        final SessionFactory sessionfactory = new MetadataSources(registro)
                .buildMetadata().buildSessionFactory();
        
        
        final Session sesion = sessionfactory.openSession();
        
       
        
        sesion.close();*/
        PrimaryView view = new PrimaryView();
        view.setVisible(true);
        
    }
}
