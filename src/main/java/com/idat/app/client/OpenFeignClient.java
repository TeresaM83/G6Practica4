package com.idat.app.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.app.dto.HospitalDTO;

@FeignClient(name = "hospital-microservicio", url="localhost:8090")
public interface OpenFeignClient {

	@GetMapping("/api/hospital/listar")
	public List<HospitalDTO> listarAlumnos();
	
}
