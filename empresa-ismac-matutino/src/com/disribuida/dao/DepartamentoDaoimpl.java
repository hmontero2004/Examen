package com.disribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Departamento;

@Repository
public class DepartamentoDaoimpl implements DepartamentoDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<Departamento> findALL() {
		// TODO Auto-generated method stub
        Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Departamento", Departamento.class).getResultList();
		
	}

	@Override
	public Departamento findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Departamento Departamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Departamento Departamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
