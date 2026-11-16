package com.gestion.vols.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.vols.entities.Vol;
import com.gestion.vols.repos.VolRepository;

@Service
public class VolServiceImpl implements VolService {

	@Autowired
	private VolRepository volRepository;

	@Override
	public Vol saveVol(Vol v) {
		// l'id est généré par MySQL : on ignore celui envoyé par le client
		v.setIdVol(null);
		return volRepository.save(v);
	}

	@Override
	public Vol updateVol(Vol v) {
		return volRepository.save(v);
	}

	@Override
	public void deleteVolById(Long id) {
		volRepository.deleteById(id);
	}

	@Override
	public Vol getVol(Long id) {
		return volRepository.findById(id).get();
	}

	@Override
	public List<Vol> getAllVols() {
		return volRepository.findAll();
	}

	@Override
	public List<Vol> findByTypeIdType(Long idType) {
		return volRepository.findByTypeIdType(idType);
	}

	@Override
	public List<Vol> findByDestinationContaining(String destination) {
		return volRepository.findByDestinationContainingIgnoreCase(destination);
	}
}
