package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.disribuida.dao.DepartamentoDao;

import com.distribuida.entities.Departamento;

public class PrincipalDepartamento  {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	//	DepartamentoDao departamentoDao = context.getBean("DepartamentoDaoimpl",DepartamentoDao.class);

		DepartamentoDao  departamentoDao = context.getBean("departamentoDaoimpl", DepartamentoDao.class);  
		
		List<Departamento> departamento = departamentoDao.findALL();
		departamento.forEach(item -> {
			System.out.println(item.toString());
		});
				context.close();
	}
}





