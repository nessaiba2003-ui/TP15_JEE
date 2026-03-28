# 1. Utiliser l'image que tu viens de télécharger
FROM bellsoft/liberica-openjdk-alpine:17

# 2. Créer un dossier pour l'application dans le conteneur
WORKDIR /app

# 3. Copier ton fichier JAR (généré par Maven/Gradle) vers le conteneur
# Assure-toi que le nom correspond au fichier dans ton dossier /target
COPY target/*.jar app.jar

# 4. Exposer le port de ton application (8080 par défaut pour Spring)
EXPOSE 8080

# 5. Lancer l'application
ENTRYPOINT ["java", "-Xmx512m", "-Xms256m", "-jar", "app.jar"]
