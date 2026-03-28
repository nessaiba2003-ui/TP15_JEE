🚀 Projet Spring Boot Conteneurisé avec Docker
Ce projet (TP 15) démontre comment transformer une application Spring Boot classique en une solution portable et isolée grâce à Docker, en la connectant à une base de données MySQL.
🛠️ Architecture du Projet
L'environnement se compose de trois services interconnectés sur un réseau virtuel :
Application : Spring Boot (Java 17) tournant sur le port 8080.
Base de données : MySQL 8.0 tournant sur le port 3307.
Gestion DB : phpMyAdmin pour visualiser les données sur le port 8082.
📋 Prérequis
Docker Desktop installé et lancé.
Java 17 ou supérieur.
Maven (ou utiliser le wrapper ./mvnw).
🧹 Commandes de maintenance
Voir les logs : docker logs -f spring-app-final
Arrêter tout : docker stop spring-app-final mysql-db phpmyadmin
Nettoyer les images inutiles : docker image prune -a
Conclusion : Ce projet valide la compétence de déploiement "Cloud-ready" en séparant l'infrastructure du code source.
<img width="590" height="696" alt="image" src="https://github.com/user-attachments/assets/163e3a05-7f14-4cd0-a9c9-e9c1b3d81239" />
<img width="1851" height="574" alt="Screenshot 2026-03-28 185940" src="https://github.com/user-attachments/assets/dc5268a9-9970-456f-969f-e8d72e490e1b" />
<img width="1846" height="304" alt="Screenshot 2026-03-28 190000" src="https://github.com/user-attachments/assets/69b12585-7c82-4c31-96f9-73a68da38ba6" />
<img width="1445" height="136" alt="Screenshot 2026-03-28 190159" src="https://github.com/user-attachments/assets/7ca029d8-2a96-4621-814a-980466a774f1" />
<img width="1844" height="534" alt="Screenshot 2026-03-28 190321" src="https://github.com/user-attachments/assets/52280838-bfeb-440d-ac36-92cd31a037a8" />
<img width="1046" height="160" alt="Screenshot 2026-03-28 190652" src="https://github.com/user-attachments/assets/6deb6391-3f7f-446a-a551-d1c93ae121ef" />
<img width="1181" height="195" alt="Screenshot 2026-03-28 190810" src="https://github.com/user-attachments/assets/e8fa0fd2-6471-4792-b19c-950e2f959af8" />
<img width="1042" height="168" alt="Screenshot 2026-03-28 190949" src="https://github.com/user-attachments/assets/c3396c14-06c4-47c9-a3d5-fd4949cc6f6b" />
<img width="906" height="142" alt="Screenshot 2026-03-28 191012" src="https://github.com/user-attachments/assets/89e4a812-d837-40fe-8f70-a7fefab802b1" />
<img width="1772" height="120" alt="Screenshot 2026-03-28 191044" src="https://github.com/user-attachments/assets/62912b4e-4119-490a-9e71-10d55cd0d052" />
<img width="1861" height="259" alt="Screenshot 2026-03-28 191113" src="https://github.com/user-attachments/assets/5c380f5d-8c1a-471e-a3c7-5d5a5d7f9d9e" />
<img width="1919" height="774" alt="Screenshot 2026-03-28 191733" src="https://github.com/user-attachments/assets/7620960e-aaab-4336-9983-8249122674b1" />
<img width="1908" height="726" alt="Screenshot 2026-03-28 191901" src="https://github.com/user-attachments/assets/05a1fe1a-7406-409c-beaa-7e93f04e19c0" />
<img width="1826" height="451" alt="Screenshot 2026-03-28 191921" src="https://github.com/user-attachments/assets/8899c66f-cdd0-41ac-b5f6-9d558ca46f86" />
<img width="1475" height="509" alt="Screenshot 2026-03-28 191951" src="https://github.com/user-attachments/assets/e5c987f8-3473-4ae1-b12f-372f87e8b7f8" />
<img width="1919" height="1010" alt="Screenshot 2026-03-28 192055" src="https://github.com/user-attachments/assets/f8d60dcc-747a-4f0b-955a-ab29fdc729ba" />
<img width="1905" height="558" alt="Screenshot 2026-03-28 192344" src="https://github.com/user-attachments/assets/b74bbfcc-2415-4b7c-afff-361dda05bdad" />
<img width="1415" height="677" alt="Screenshot 2026-03-28 192351" src="https://github.com/user-attachments/assets/2e167211-04a1-49ae-8499-dbce4bfcf7f5" />
