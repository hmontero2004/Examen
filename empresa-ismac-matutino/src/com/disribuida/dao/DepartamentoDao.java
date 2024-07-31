package com.disribuida.dao;

import java.util.List;

import com.distribuida.entities.Departamento;



public interface DepartamentoDao {
	public List<Departamento> findALL();

	public Departamento findOne(int id);
	
	public void add (Departamento departamento);
	
	public void up (Departamento departamento);
	
	public void del (int id);
}
