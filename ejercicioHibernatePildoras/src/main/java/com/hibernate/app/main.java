package com.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;

import com.hibernate.dao.empleado;

@Controller
public class main {

	public static void main(String[] args) {
		 SessionFactory miFactory = new Configuration().configure("bean.xml").addAnnotatedClass(empleado.class).buildSessionFactory();
	        Session miSession = miFactory.openSession();

	        try {

	            empleado empleado = new empleado(1,"Juan Carlos", "Bada Carbó", 21, "juancarbc2001@gmail.com");

	            miSession.beginTransaction();
	            miSession.save(empleado);
	            miSession.getTransaction().commit();

	            System.out.println("Insert finalizado");
	        }
	        finally {
	            miSession.close();
	            miFactory.close();
	        }


	}

}
