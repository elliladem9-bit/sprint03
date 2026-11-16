# Gestion des Vols (Angular)

Même architecture que le projet « MiniProjet Sprint 02 » : application Angular standalone sans backend.

- `services/vol.service.ts` : données en mémoire (vols + types de vol) avec CRUD complet sur les vols **et** sur les types
- `services/auth.ts` : authentification simple (tableau `users`, `localStorage`)
- `guard-vol/vol.guard.ts` : réserve l'ajout de vol au rôle ADMIN (sinon `/app-forbidden`)
- `liste-types/` + `update-type/` : gestion des types de vol (composant parent/enfant avec `@Input` / `@Output`)
- `login/`, `forbidden/` : pages de connexion et d'accès refusé

Comptes : `Admin / 1234` (ADMIN) et `adem / 1234` (USER).

```
npm install
npm start
```
