package com.disribuida.dao;

import java.util.List;

import com.distribuida.entities.Departamento;



public interface DepartamentoDao {
	public List<Departamento> findALL();

	public Departamento findOne(int id);
	
	public void add (Departamento Departamento);
	
	public void up (Departamento Departamento);
	
	public void del (int id);
}
