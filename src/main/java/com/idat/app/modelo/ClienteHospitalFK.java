package com.idat.app.modelo;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable 
public class ClienteHospitalFK implements Serializable{
	
	private static final long serialVersionUID = -4259684636861252684L;
	
	@Column(name = "id_cliente", nullable=false)
	private Integer idCliente;
	
	@Column(name = "id_hospital", nullable=false)
	private Integer idHospital;
	

}
