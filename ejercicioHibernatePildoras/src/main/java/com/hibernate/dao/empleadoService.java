package com.hibernate.dao;

import java.util.List;

public interface empleadoService {
	
	public void insertarEmpleado(empleado usuario);

	public List<empleado> buscarTodos();


}
