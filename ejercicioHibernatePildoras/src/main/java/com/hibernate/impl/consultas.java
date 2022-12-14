package com.hibernate.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.dao.empleado;
import com.hibernate.dao.empleadoServicioImpl;

@Component
public class consultas {

	// La etiqueta autowired nos permite hacer inyección de dependencia de la clase
	// PedidoServicioImpl.
	@Autowired
	private empleadoServicioImpl esi;

	// La etiqueta Transactional automatiza la gestión de la transacción.
	@Transactional
	public void insertarUnEmpleado(empleado empleado) {
		esi.insertarEmpleado(empleado);
	}

	@Transactional
	public void insertarListaEmpleados(Collection<empleado> colEmpleados) {
		for (empleado empleado : colEmpleados) {
			esi.insertarEmpleado(empleado);
		}
	}

	@Transactional
	public List<empleado> buscarTodosEmpleados() {
		return esi.buscarTodos();
	}

}
