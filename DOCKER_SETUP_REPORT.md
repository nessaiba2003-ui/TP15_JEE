# Rapport d'Ajustement Docker & Spring Boot

L'ensemble de votre projet a été harmonisé et optimisé pour correspondre à votre walkthrough Docker.

## Ajustements Réalisés

1. **Optimisation Dockerfile** : Correction de l'EXPOSE de `8081` vers `8080` (port réel de l'app) et ajout de limitations mémoire JVM (`-Xmx`).
2. **Expansion Docker Compose** :
   - Ajout d'un système de gestion de base de données visuel via **phpMyAdmin** (port 8082).
   - Création d'un **réseau privé** (`spring-network`) pour sécuriser la communication interne.
   - Uniformité des ports hôtes : App (8081), phpMyAdmin (8082), MySQL Direct (3307).
3. **Synchronisation Config** : Le mot de passe de `application.properties` a été harmonisé avec le secret Docker (`root`).
4. **Build & Tagging** : Préparation de l'image locale `ens/springdocker:1.0`.

## Comment Utiliser Votre Environnement

| Service | Accès Externe | Port Interne |
| :--- | :--- | :--- |
| **Spring App** | [http://localhost:8081](http://localhost:8081) | 8080 |
| **phpMyAdmin** | [http://localhost:8082](http://localhost:8082) | 80 |
| **MySQL DB** | `localhost:3307` | 3306 |

> [!NOTE]
> Les identifiants par défaut pour tous les services (MySQL, phpMyAdmin) sont **`root / root`**.

## Commandes Recommandées
- **Relancer tout** : `docker-compose down && docker-compose up -d`
- **Suivre les logs** : `docker logs -f spring-app`
- **Reconstruire** : `./mvnw clean package && docker-compose build`

---

*Ajustements réalisés par Antigravity.*
