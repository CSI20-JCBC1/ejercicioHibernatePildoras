package com.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;



@Component
public class empleadoServicioImpl implements empleadoService {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertarEmpleado(empleado empleado) {
		
		em.persist(empleado);
		
	}

	@Override
	public List<empleado> buscarTodos() {
		
		return em.createQuery("SELECT emp FROM empleado emp").getResultList();
	}
	

}
