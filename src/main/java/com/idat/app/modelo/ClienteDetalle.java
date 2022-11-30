package com.idat.app.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "detalle_cliente")
public class ClienteDetalle {
	
	@Id
	private ClienteHospitalFK fk = new ClienteHospitalFK();
	

}
