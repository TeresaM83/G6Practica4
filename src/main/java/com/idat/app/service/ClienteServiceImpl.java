package com.idat.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.app.client.OpenFeignClient;
import com.idat.app.dto.HospitalDTO;
import com.idat.app.modelo.ClienteHospitalFK;
import com.idat.app.modelo.Cliente;
import com.idat.app.modelo.ClienteDetalle;
import com.idat.app.repositorio.ClienteRepository;
import com.idat.app.repositorio.DetalleClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository aularepo;
	
	@Autowired
	private DetalleClienteRepository detallerepo;
	
	@Autowired
	private OpenFeignClient client;
	
	@Override
	public void guardarcliente(Cliente aula) {
		aularepo.save(aula);
	}

	@Override
	public void asignarclienteHospital() {
		List<HospitalDTO> listado = client.listarAlumnos();
		ClienteHospitalFK fk = null;
		ClienteDetalle detalle = null;
		
		for (HospitalDTO hospitalDTO : listado) {
			fk = new ClienteHospitalFK();
			fk.setIdHospital(hospitalDTO.getIdDto());
			fk.setIdCliente(1);
			
			detalle = new ClienteDetalle();
			detalle.setFk(fk);
			detallerepo.save(detalle);
		}
		}
		

}
