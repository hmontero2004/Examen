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
@Table(name = "proyecto")
public class Proyecto {
	
	
	    @Id
	    @GeneratedValue (strategy = GenerationType.IDENTITY)
	    @Column(name = "NumProyecto")
	    private int numProyecto;

	    @Column(name = "NombreProyecto", length = 100)
	    private String nombreProyecto;

	    @Column(name = "UbicacionProyecto", length = 100)
	    private String ubicacionProyecto;

	    @Column(name = "NumDptoProyecto")
	    private int numDptoProyecto;

	    public Proyecto() {}
		public Proyecto(int numProyecto, String nombreProyecto, String ubicacionProyecto, int numDptoProyecto) {
			
			this.numProyecto = numProyecto;
			this.nombreProyecto = nombreProyecto;
			this.ubicacionProyecto = ubicacionProyecto;
			this.numDptoProyecto = numDptoProyecto;
		}
		public int getNumProyecto() {
			return numProyecto;
		}
		public void setNumProyecto(int numProyecto) {
			this.numProyecto = numProyecto;
		}
		public String getNombreProyecto() {
			return nombreProyecto;
		}
		public void setNombreProyecto(String nombreProyecto) {
			this.nombreProyecto = nombreProyecto;
		}
		public String getUbicacionProyecto() {
			return ubicacionProyecto;
		}
		public void setUbicacionProyecto(String ubicacionProyecto) {
			this.ubicacionProyecto = ubicacionProyecto;
		}
		public int getNumDptoProyecto() {
			return numDptoProyecto;
		}
		public void setNumDptoProyecto(int numDptoProyecto) {
			this.numDptoProyecto = numDptoProyecto;
		}
		@Override
		public String toString() {
			return "Proyecto [numProyecto=" + numProyecto + ", nombreProyecto=" + nombreProyecto
					+ ", ubicacionProyecto=" + ubicacionProyecto + ", numDptoProyecto=" + numDptoProyecto + "]";
		}

	   
	    
	}
