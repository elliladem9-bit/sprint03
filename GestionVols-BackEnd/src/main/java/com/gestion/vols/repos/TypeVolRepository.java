package com.gestion.vols.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gestion.vols.entities.TypeVol;

// Spring Data REST : http://localhost:8090/vols/types  (GET, POST, PUT, DELETE...)
@RepositoryRestResource(path = "types", collectionResourceRel = "types")
@CrossOrigin("http://localhost:4200/")
public interface TypeVolRepository extends JpaRepository<TypeVol, Long> {
}
