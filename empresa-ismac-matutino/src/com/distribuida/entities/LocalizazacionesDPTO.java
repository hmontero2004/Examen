package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table (name = "localizaciones_dpto")
public class LocalizazacionesDPTO {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "NumeroDpto")
    private int numeroDpto;

    @Column(name = "UbicacionDpto")
    private String ubicacionDpto;

    LocalizazacionesDPTO(){}
	public LocalizazacionesDPTO(int numeroDpto, String ubicacionDpto) {
		
		this.numeroDpto = numeroDpto;
		this.ubicacionDpto = ubicacionDpto;
	}
	public int getNumeroDpto() {
		return numeroDpto;
	}
	public void setNumeroDpto(int numeroDpto) {
		this.numeroDpto = numeroDpto;
	}
	public String getUbicacionDpto() {
		return ubicacionDpto;
	}
	public void setUbicacionDpto(String ubicacionDpto) {
		this.ubicacionDpto = ubicacionDpto;
	}
	@Override
	public String toString() {
		return "LocalizazacionesDPTO [numeroDpto=" + numeroDpto + ", ubicacionDpto=" + ubicacionDpto + "]";
	}

    
}

