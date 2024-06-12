package com.distribuida.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "departamento")
public class Departamento {

	
	    @Id
	    @GeneratedValue (strategy = GenerationType.IDENTITY)
	    @Column(name = "NumeroDpto")
	    private int numeroDpto;

	    @Column(name = "NombreDpto")
	    private String nombreDpto;

	    @Column(name = "DniDirector")
	    private String dniDirector;

	    @Column(name = "FechaingresoDirector")
	    private Date fechaIngresoDirector;

	    public Departamento () {}
	    
		public Departamento(int numeroDpto, String nombreDpto, String dniDirector, Date fechaIngresoDirector) {
			
			this.numeroDpto = numeroDpto;
			this.nombreDpto = nombreDpto;
			this.dniDirector = dniDirector;
			this.fechaIngresoDirector = fechaIngresoDirector;
		}

		public int getNumeroDpto() {
			return numeroDpto;
		}

		public void setNumeroDpto(int numeroDpto) {
			this.numeroDpto = numeroDpto;
		}

		public String getNombreDpto() {
			return nombreDpto;
		}

		public void setNombreDpto(String nombreDpto) {
			this.nombreDpto = nombreDpto;
		}

		public String getDniDirector() {
			return dniDirector;
		}

		public void setDniDirector(String dniDirector) {
			this.dniDirector = dniDirector;
		}

		public Date getFechaIngresoDirector() {
			return fechaIngresoDirector;
		}

		public void setFechaIngresoDirector(Date fechaIngresoDirector) {
			this.fechaIngresoDirector = fechaIngresoDirector;
		}

		@Override
		public String toString() {
			return "Departamento [numeroDpto=" + numeroDpto + ", nombreDpto=" + nombreDpto + ", dniDirector="
					+ dniDirector + ", fechaIngresoDirector=" + fechaIngresoDirector + "]";
		}

	   
	    
	    
	}