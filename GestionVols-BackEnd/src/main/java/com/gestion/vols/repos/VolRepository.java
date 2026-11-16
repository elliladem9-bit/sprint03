package com.gestion.vols.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gestion.vols.entities.Vol;

// Spring Data REST : http://localhost:8090/vols/rest
@RepositoryRestResource(path = "rest")
@CrossOrigin("http://localhost:4200/")
public interface VolRepository extends JpaRepository<Vol, Long> {

	List<Vol> findByDestinationContainingIgnoreCase(String destination);

	List<Vol> findByTypeIdType(Long idType);
}
