package com.gestion.vols.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.vols.entities.Vol;
import com.gestion.vols.service.VolService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200/")
public class VolRESTController {

	@Autowired
	private VolService volService;

	// GET http://localhost:8090/vols/api
	@GetMapping
	public List<Vol> getAllVols() {
		return volService.getAllVols();
	}

	// GET http://localhost:8090/vols/api/1
	@GetMapping("/{id}")
	public Vol getVolById(@PathVariable("id") Long id) {
		return volService.getVol(id);
	}

	// POST http://localhost:8090/vols/api
	@PostMapping
	public Vol createVol(@RequestBody Vol vol) {
		return volService.saveVol(vol);
	}

	// PUT http://localhost:8090/vols/api
	@PutMapping
	public Vol updateVol(@RequestBody Vol vol) {
		return volService.updateVol(vol);
	}

	// DELETE http://localhost:8090/vols/api/1
	@DeleteMapping("/{id}")
	public void deleteVol(@PathVariable("id") Long id) {
		volService.deleteVolById(id);
	}

	// GET http://localhost:8090/vols/api/voltype/1
	@GetMapping("/voltype/{idType}")
	public List<Vol> getVolsByTypeId(@PathVariable("idType") Long idType) {
		return volService.findByTypeIdType(idType);
	}

	// GET http://localhost:8090/vols/api/volsByDestination/par
	@GetMapping("/volsByDestination/{destination}")
	public List<Vol> findByDestinationContaining(@PathVariable("destination") String destination) {
		return volService.findByDestinationContaining(destination);
	}
}
