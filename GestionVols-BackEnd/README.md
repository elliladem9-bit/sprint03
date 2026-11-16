# Gestion des Vols — Backend (Spring Boot 3 + MySQL)

## Lancer
1. Démarrer MySQL (XAMPP/WAMP). User `root`, mot de passe vide (sinon modifier `application.properties`).
2. Lancer `GestionVolsApplication` (Run As > Spring Boot App) ou `mvn spring-boot:run`.
3. La base `vols_db` et les tables sont créées automatiquement ; 2 types et 3 vols sont insérés si la base est vide.

## API (port 8090, contexte `/vols`)
| Méthode | URL | Rôle |
|---|---|---|
| GET | `/vols/api` | liste des vols |
| GET | `/vols/api/{id}` | un vol |
| POST | `/vols/api` | créer |
| PUT | `/vols/api` | modifier |
| DELETE | `/vols/api/{id}` | supprimer |
| GET | `/vols/api/voltype/{idType}` | vols d'un type |
| GET | `/vols/api/volsByDestination/{dest}` | recherche par destination |
| GET/POST/PUT/DELETE | `/vols/types` , `/vols/types/{id}` | types de vol (Spring Data REST) |
