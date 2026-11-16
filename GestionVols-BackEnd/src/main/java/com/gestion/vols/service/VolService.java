package com.gestion.vols.service;

import java.util.List;

import com.gestion.vols.entities.Vol;

public interface VolService {

	Vol saveVol(Vol v);

	Vol updateVol(Vol v);

	void deleteVolById(Long id);

	Vol getVol(Long id);

	List<Vol> getAllVols();

	List<Vol> findByTypeIdType(Long idType);

	List<Vol> findByDestinationContaining(String destination);
}
