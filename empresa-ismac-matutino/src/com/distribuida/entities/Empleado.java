package com.distribuida.entities;

import java.math.BigDecimal;
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
@Table(name = "empleado")
public class Empleado {
	
	    @Id 
	    @GeneratedValue (strategy = GenerationType.IDENTITY)
	    @Column(name = "Dni")
	    private String dni;

	    @Column(name = "Nombre")
	    private String nombre;

	    @Column(name = "Apellido")
	    private String apellido;

	    @Column(name = "Apellido2")
	    private String apellido2;

	    @Column(name = "FechaNac")
	    private Date fechaNac;

	    @Column(name = "Dirección")
	    private String direccion;

	    @Column(name = "Sexo")
	    private char sexo;

	    @Column(name = "Sueldo")
	    private BigDecimal sueldo;

	    @Column(name = "SuperDni")
	    private String superDni;

	    @Column(name = "Dno")
	    private Integer dno;

	    public Empleado () {}
	    
		public Empleado(String dni, String nombre, String apellido, String apellido2, Date fechaNac, String direccion,
				char sexo, BigDecimal sueldo, String superDni, Integer dno) {
			
			this.dni = dni;
			this.nombre = nombre;
			this.apellido = apellido;
			this.apellido2 = apellido2;
			this.fechaNac = fechaNac;
			this.direccion = direccion;
			this.sexo = sexo;
			this.sueldo = sueldo;
			this.superDni = superDni;
			this.dno = dno;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getApellido2() {
			return apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public Date getFechaNac() {
			return fechaNac;
		}

		public void setFechaNac(Date fechaNac) {
			this.fechaNac = fechaNac;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public BigDecimal getSueldo() {
			return sueldo;
		}

		public void setSueldo(BigDecimal sueldo) {
			this.sueldo = sueldo;
		}

		public String getSuperDni() {
			return superDni;
		}

		public void setSuperDni(String superDni) {
			this.superDni = superDni;
		}

		public Integer getDno() {
			return dno;
		}

		public void setDno(Integer dno) {
			this.dno = dno;
		}

		@Override
		public String toString() {
			return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", apellido2=" + apellido2
					+ ", fechaNac=" + fechaNac + ", direccion=" + direccion + ", sexo=" + sexo + ", sueldo=" + sueldo
					+ ", superDni=" + superDni + ", dno=" + dno + "]";
		}

	    
	    
	}
