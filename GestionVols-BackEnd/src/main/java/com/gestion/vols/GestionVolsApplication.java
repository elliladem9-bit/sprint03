package com.gestion.vols;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.gestion.vols.entities.TypeVol;
import com.gestion.vols.entities.Vol;
import com.gestion.vols.repos.TypeVolRepository;
import com.gestion.vols.repos.VolRepository;

@SpringBootApplication
public class GestionVolsApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	@Autowired
	private TypeVolRepository typeRepository;

	@Autowired
	private VolRepository volRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestionVolsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Spring Data REST ne retourne pas les id par défaut : on les expose pour Angular
		repositoryRestConfiguration.exposeIdsFor(Vol.class, TypeVol.class);

		// Données de départ (insérées seulement si la base est vide)
		if (typeRepository.count() == 0) {
			TypeVol direct = typeRepository.save(new TypeVol("Vol direct", "Sans escale"));
			TypeVol escale = typeRepository.save(new TypeVol("Vol avec escale", "Une ou plusieurs escales"));

			volRepository.save(new Vol("TU 714", "Tunisair", "Paris", direct, 850, LocalDate.of(2026, 11, 10)));
			volRepository.save(new Vol("TU 332", "Tunisair", "Istanbul", escale, 720, LocalDate.of(2026, 11, 18)));
			volRepository.save(new Vol("NO 512", "Nouvelair", "Rome", direct, 640, LocalDate.of(2026, 12, 2)));
		}
	}
}
